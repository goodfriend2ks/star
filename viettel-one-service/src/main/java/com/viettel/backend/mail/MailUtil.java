package com.viettel.backend.mail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.URLName;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.springframework.util.StringUtils;
import org.xml.sax.InputSource;

import com.sun.mail.pop3.POP3SSLStore;
import com.viettel.backend.domain.MMailTemplate;
import javax.xml.parsers.ParserConfigurationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * @author khangpn
 */
public class MailUtil {

    public static final String SMTP_HOST = "smtp.host";
    public static final String SMTP_PORT = "smtp.port";
    public static final String POP3_HOST = "pop3.host";
    public static final String POP3_PORT = "pop3.port";
    public static final String MAIL_NAME = "user.name";
    public static final String MAIL_PASSWORD = "user.pass";
    
    private String smtpHost;
    private int smtpPort;//Default viettel 465
    private String pop3Host;    
    private int pop3Port;
    
    private String name;
    private String password;
    private Logger logger = LoggerFactory.getLogger(getClass());
    
    private static MailUtil instance;

    public static MailUtil getInstance() {
        if(instance == null){
            instance = new MailUtil();
        }
        return instance;
    }
    
    private MailUtil() {
        
    }

    /**
     * @author khangpn
     * @since 1.0.0
     * <p>
     * Method provide send a mail to multi users and cc to multi users
     * </p>
     * @param userTo user list, each user different by "," and without @host
     * @param Cc user list, each user different by "," and without @host
     * @param subject mail subject
     * @param content content will Recipients can see
     * @param attach file attach, right now is only 1 file and could a zip file
     * @return
     * @throws RuntimeException
     * @throws IOException 
     */
    public boolean sendMail(final String userTo, final String Cc, final String subject,
            final String content, final File attach) throws RuntimeException, IOException {
        
        if(this.smtpHost == null || this.smtpHost.isEmpty()){
            String err = "SMTP Host cannot be null!";            
            logger.error(err);
            throw new IllegalArgumentException(err);
        }
        
        if(this.smtpPort == 0){
            String err = "SMTP Port cannot be null!";            
            logger.error(err);
            throw new IllegalArgumentException(err);
        }
        
        if(this.name == null || this.name.isEmpty()){
            String err = "User name cannot be null!";            
            logger.error(err);
            throw new IllegalArgumentException(err);
        }
        
        if(this.password == null || this.password.isEmpty()){
            String err = "Password cannot be null!";            
            logger.error(err);
            throw new IllegalArgumentException(err);
        }
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp." + smtpHost);
        props.put("mail.smtp.socketFactory.port", smtpPort);
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", smtpPort);

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(name, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(name + "@" + smtpHost));

            if (userTo != null && !userTo.trim().isEmpty()) {
                String[] userTos = userTo.split(",");
                for (int i = 0; i < userTos.length; i++) {
                    message.addRecipients(Message.RecipientType.TO,InternetAddress.parse(userTos[i].trim() + "@" + smtpHost));
                }
            }

            if (Cc != null && !Cc.trim().isEmpty()) {
                String[] Ccs = Cc.split(",");
                for (int i = 0; i < Ccs.length; i++) {
                    message.addRecipients(Message.RecipientType.CC,InternetAddress.parse(Ccs[i].trim() + "@" + smtpHost));
                }
            }
            message.setSubject(subject);

            if (attach != null) {
                //Attachment
                // Create the message part 
                BodyPart messageBodyPart = new MimeBodyPart();

                // Fill the message
                messageBodyPart.setContent(content, "text/html; charset=utf-8");

                // Create a multipar message
                Multipart multipart = new MimeMultipart();

                // Set text message part
                multipart.addBodyPart(messageBodyPart);

                // Part two is attachment
                messageBodyPart = new MimeBodyPart();
                DataSource source = new FileDataSource(attach.getAbsolutePath());
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName(attach.getName());
                multipart.addBodyPart(messageBodyPart);
                //End attach

                message.setContent(multipart);
            } else {
                message.setContent(content, "text/html; charset=utf-8");
            }
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public void receiveEmail() throws MessagingException, IOException {

        if(this.pop3Host == null || this.pop3Host.isEmpty()){
            String err = "POP3 Host cannot be null!";            
            logger.error(err);
            throw new IllegalArgumentException(err);
        }
        
        if(this.pop3Port == 0){
            String err = "POP3 Port cannot be null!";            
            logger.error(err);
            throw new IllegalArgumentException(err);
        }
        
        if(this.name == null || this.name.isEmpty()){
            String err = "User name cannot be null!";            
            logger.error(err);
            throw new IllegalArgumentException(err);
        }
        
        if(this.password == null || this.password.isEmpty()){
            String err = "Password cannot be null!";            
            logger.error(err);
            throw new IllegalArgumentException(err);
        }
        
        String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

        Properties pop3Props = new Properties();

        pop3Props.setProperty("mail.pop3.socketFactory.class", SSL_FACTORY);
        pop3Props.setProperty("mail.pop3.socketFactory.fallback", "false");
        pop3Props.setProperty("mail.pop3.port", String.valueOf(pop3Port));
        pop3Props.setProperty("mail.pop3.host", pop3Host);
        pop3Props.setProperty("mail.pop3.socketFactory.port", String.valueOf(pop3Port));//Viettel mail is 995

        URLName url = new URLName("pop3", pop3Host, pop3Port, "",
                name, password);

        Session session = Session.getInstance(pop3Props, null);
        POP3SSLStore store = new POP3SSLStore(session, url);
        store.connect();
        Folder emailFolder = store.getFolder("INBOX");
        emailFolder.open(Folder.READ_WRITE);

        Message[] messages = emailFolder.getMessages();

        List<File> attachments = new ArrayList<File>();
        for (Message message : messages) {
            Multipart multipart = (Multipart) message.getContent();

            for (int i = 0; i < multipart.getCount(); i++) {
                BodyPart bodyPart = multipart.getBodyPart(i);
                if (!Part.ATTACHMENT.equalsIgnoreCase(bodyPart.getDisposition())
                        && StringUtils.isEmpty(bodyPart.getFileName())) {
                    continue; // dealing with attachments only
                }
                InputStream is = bodyPart.getInputStream();
                File f = new File(System.getProperty("user.home") + "/temp/" + bodyPart.getFileName());
                try (FileOutputStream fos = new FileOutputStream(f)) {
                    byte[] buf = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = is.read(buf)) != -1) {
                        fos.write(buf, 0, bytesRead);
                    }
                }
                attachments.add(f);
            }
        }
        emailFolder.close(false);
        store.close();
    }

    /**
     * <p>
     * File template parameter loaded from resource folder example:
     *      String path = ReadXMLUTF8FileSAX.class.getResource("/com/viettel/mail/template/mail-config.xml").getPath();
            File file = new File(path);
     * </p>
     * @param template
     * @return 
     */
    public Mail getMailFromTemplate(File template){
        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            factory.setNamespaceAware(true);
            factory.setValidating(true);
            
            InputStream inputStream = new FileInputStream(template);
            Reader reader = new InputStreamReader(inputStream, "UTF-8");

            InputSource is = new InputSource(reader);
            is.setEncoding("UTF-8");

            saxParser.setProperty(SaxTemplateMailHandle.JAXP_SCHEMA_LANGUAGE, SaxTemplateMailHandle.W3C_XML_SCHEMA);
            SaxTemplateMailHandle saxHandle = new SaxTemplateMailHandle();
            saxParser.parse(is, saxHandle);
            return saxHandle.getMailDTO();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    /**
     * Parse MailTemplate domain object to Mail DTO
     * @param mailTemplate
     * @return 
     */
    public Mail getMailFromTemplate(MMailTemplate mailTemplate){
        if(mailTemplate != null){
            Mail mail = new Mail();
            mail.setBody(mailTemplate.getContent());
            mail.setSubject(mailTemplate.getSubject());
            return mail;
        }
        return null;
    }
    
    public String getSmtpHost() {
        return smtpHost;
    }

    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    public int getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(int smtpPort) {
        this.smtpPort = smtpPort;
    }

    public String getPop3Host() {
        return pop3Host;
    }

    public void setPop3Host(String pop3Host) {
        this.pop3Host = pop3Host;
    }

    public int getPop3Port() {
        return pop3Port;
    }

    public void setPop3Port(int pop3Port) {
        this.pop3Port = pop3Port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
}

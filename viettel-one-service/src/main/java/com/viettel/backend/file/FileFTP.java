/*
 * @Copyright Viettel - One
 */
package com.viettel.backend.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * Cac thong tin static final duoc su dung cho configuration tren bang VConfig,
 * vi du vCongig.setProperty(FileFTP.FTP_HOST) vConfig.setValue("abc.com")
 * </p>
 *
 * @author khangpn
 */
public class FileFTP {

    private static FileFTP instance;

    public static final String FTP_HOST = "ftp.host";
    public static final String FTP_USER = "ftp.user";
    public static final String FTP_PASSWORD = "ftp.password";
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());

    private String host;
    private String user;
    private String password;

    public static FileFTP getInstance() {
        if (instance == null) {
            instance = new FileFTP();
        }
        return instance;
    }

    private FileFTP() {

    }

    /**
     *
     * @param inputStream
     * @param desName File name server side example : viettelone.txt or UUID
     * 4059348348.txt
     */
    public void upload(InputStream inputStream, String desName) {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(this.host);

            boolean login = ftpClient.login(this.user, this.password);

            if (login) {
                ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
                ftpClient.enterLocalPassiveMode();

                boolean uploaded = ftpClient.storeFile(desName,
                        inputStream);
                if (uploaded) {
                    inputStream.close();
                } else {
                    logger.error("Error in uploading file !");
                }

                boolean logout = ftpClient.logout();
                if (logout) {
                    logger.info("Connection close...");
                }
            } else {
                logger.error("Connection fail...");
            }

        } catch (SocketException e) {
            logger.error(e.getMessage());
        } catch (IOException e) {
            logger.error(e.getMessage());
        } finally {
            try {
                ftpClient.disconnect();
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
        }
    }

    /**
     *
     * @param filePath
     * @param desName
     */
    public void upload(String filePath, String desName) {
        try {
            FileInputStream inputStream = null;
            inputStream = new FileInputStream(filePath);
            upload(inputStream, desName);
        } catch (FileNotFoundException ex) {
            logger.error(ex.getMessage());
        }
    }

    /**
     *
     * @param filePath File path server side
     * @param desPath File path client side
     */
    public void download(String filePath, String desPath) {
        FTPClient ftpClient = new FTPClient();
        FileOutputStream fos = null;

        try {
            ftpClient.connect(this.host);

            boolean login = ftpClient.login(this.user, this.password);

            if (login) {
                ftpClient.type(FTP.BINARY_FILE_TYPE);
                fos = new FileOutputStream(desPath);
                boolean download = ftpClient.retrieveFile(filePath,
                        fos);
                if (download) {
                    fos.close();
                } else {
                    logger.error("Error in downloading file !");
                }
                boolean logout = ftpClient.logout();
                if (logout) {
                    logger.info("Connection close...");
                }
            } else {
                logger.error("Connection fail...");
            }

        } catch (SocketException e) {
            logger.error(e.getMessage());
        } catch (IOException e) {
            logger.error(e.getMessage());
        } finally {
            try {
                ftpClient.disconnect();
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
        }
    }

}

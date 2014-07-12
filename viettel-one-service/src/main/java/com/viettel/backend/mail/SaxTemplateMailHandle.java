package com.viettel.backend.mail;

import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author khangpn
 */
public class SaxTemplateMailHandle extends DefaultHandler {

    static final String   JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    static final String   W3C_XML_SCHEMA       = "http://www.w3.org/2001/XMLSchema";
    static final String   JAXP_SCHEMA_SOURCE   = "http://java.sun.com/xml/jaxp/properties/schemaSource";
    
    private Mail          mailDTO              = new Mail();
    private Stack<String> eNames               = new Stack<String>();

    public SaxTemplateMailHandle() {
        super();
    }

    @Override
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        eNames.push(qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        eNames.pop();
    }

    @Override
    public void characters(char ch[], int start, int length)
            throws SAXException {

        String content = new String(ch, start, length);
        if (content != null && !content.trim().isEmpty()) {
            if (eNames.peek().equalsIgnoreCase("subject")) {
                mailDTO.setSubject(content);
            } else if (eNames.peek().equalsIgnoreCase("content")) {
                mailDTO.setBody(content);
            }
        }
    }

    public Mail getMailDTO() {
        return mailDTO;
    }
}

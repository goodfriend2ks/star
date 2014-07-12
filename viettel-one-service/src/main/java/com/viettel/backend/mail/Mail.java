package com.viettel.backend.mail;

import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author khangpn
 */
public class Mail implements Serializable{

    private static final long serialVersionUID = 92914786708400051L;
    
    private String subject;
    private File attach;
    private String body;

    public Mail(String subject, File attach, String body) {
        this.subject = subject;
        this.attach = attach;
        this.body = body;
    }

    public Mail(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }

    public Mail() {
    }
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public File getAttach() {
        return attach;
    }

    public void setAttach(File attach) {
        this.attach = attach;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
    public void setBodyParameter(String parameter, String value){
        if(this.body != null && !this.body.isEmpty()){
            parameter = "\\$\\$"+parameter;
            this.body = this.body.replaceAll(parameter, value);
        }
    }
    
    public void setBodyParameter(Map<String, String> parameters){
        if(this.body != null && !this.body.isEmpty()){
            if(parameters != null && !parameters.isEmpty()){
                Set<String> keys = parameters.keySet();
                Iterator<String> it = keys.iterator();
                while(it.hasNext()){
                    String key = it.next();
                    String parameter = "\\$\\$"+key;
                    this.body = this.body.replaceAll(parameter, parameters.get(key));
                }
            }
        }
    }
    
    public void setSubjectParameter(String parameter, String value){
        if(this.subject != null && !this.subject.isEmpty()){
            parameter = "\\$\\$"+parameter;
            this.subject = this.subject.replaceAll(parameter, value);
        }
    }
    
    public void setSubjectParameter(Map<String, String> parameters){
        if(this.subject != null && !this.subject.isEmpty()){
            if(parameters != null && !parameters.isEmpty()){
                Set<String> keys = parameters.keySet();
                Iterator<String> it = keys.iterator();
                while(it.hasNext()){
                    String key = it.next();
                    String parameter = "\\$\\$"+key;
                    this.subject = this.subject.replaceAll(parameter, parameters.get(key));
                }
            }
        }
    }
}

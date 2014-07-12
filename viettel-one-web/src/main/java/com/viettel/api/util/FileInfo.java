/*
 * Viettel-One license
 * Copyright 2014  * 
 */
package com.viettel.api.util;

import java.io.File;
import java.util.UUID;

/**
 *
 * @author khangpn
 */
public class FileInfo {

    /**
     * This id not null when AppFile was saved
     */
    private UUID id;
    /**
     * File name client side *
     */
    private String clientFileName;
    /**
     * Real path server side *
     */
    private String ftpFileName;
    /**
     * Physical file on webui server
     */
    private File file;

    public String getClientFileName() {
        return clientFileName;
    }

    public void setClientFileName(String clientFileName) {
        this.clientFileName = clientFileName;
    }

    public String getFtpFileName() {
        return ftpFileName;
    }

    public void setFtpFileName(String ftpFileName) {
        this.ftpFileName = ftpFileName;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public boolean isActived() {
        return id != null;
    }

    @Override
    public String toString() {
        return this.ftpFileName + "-" + (id == null ? "0" : id);
    }
}

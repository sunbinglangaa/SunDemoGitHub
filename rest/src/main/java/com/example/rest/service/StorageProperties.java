package com.example.rest.service;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("application")
public class StorageProperties {
    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

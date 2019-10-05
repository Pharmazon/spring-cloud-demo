package com.flamexander.cloud.common;

import java.io.Serializable;

public class CloudPacket implements Serializable {
    private static final long serialVersionUID = -3893781989609414338L;

    private Long id;

    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CloudPacket() {
    }

    public CloudPacket(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("Cloud Packet [ id = %d message = %s ]", id, message);
    }
}
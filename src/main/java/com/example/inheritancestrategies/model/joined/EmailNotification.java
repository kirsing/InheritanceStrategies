package com.example.inheritancestrategies.model.joined;

import javax.persistence.Entity;

@Entity
public class EmailNotification extends Notification {
    private String fromEmail;

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }
}

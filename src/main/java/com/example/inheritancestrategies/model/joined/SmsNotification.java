package com.example.inheritancestrategies.model.joined;

import javax.persistence.Entity;

@Entity
public class SmsNotification extends Notification {

    private String fromNumber;

    public String getFromNumber() {
        return fromNumber;
    }

    public void setFromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
    }
}

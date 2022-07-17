package com.example.inheritancestrategies.repository.joined;

import com.example.inheritancestrategies.model.joined.EmailNotification;
import com.example.inheritancestrategies.model.joined.Notification;
import com.example.inheritancestrategies.model.joined.SmsNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    SmsRepository smsRepository;

    @Autowired
    EmailRepository emailRepository;

    public NotificationService() {
    }

    public SmsNotification addSms(SmsNotification smsNotification) {
        return smsRepository.save(smsNotification);
    }
    public EmailNotification addEmail(EmailNotification emailNotification) {
        return emailRepository.save(emailNotification);
    }
}

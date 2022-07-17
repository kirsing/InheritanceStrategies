package com.example.inheritancestrategies.controller.joined;

import com.example.inheritancestrategies.model.joined.EmailNotification;
import com.example.inheritancestrategies.model.joined.SmsNotification;
import com.example.inheritancestrategies.repository.joined.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification/")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @PostMapping("addsms")
    public SmsNotification addSms(@RequestBody SmsNotification smsNotification) {
        return notificationService.addSms(smsNotification);
    }
    @PostMapping("addemail")
    public EmailNotification addEmail(@RequestBody EmailNotification emailNotification) {
        return notificationService.addEmail(emailNotification);
    }

}

package com.example.Email_Send_Every_Minute.EmailSend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class EmailStartupService {

    @Autowired
    private EmailServ emailService;

    @Scheduled(fixedRate = 60000)
    public void sendEmailOnStartup() {
        String to = ""; //The recipient's email address
        String subject = "One-Time Email";
        String text = "This is a one-time email sent on application startup.";
        emailService.sendEmail(to, subject, text);
        System.out.println("One-time email sent!");
    }
}



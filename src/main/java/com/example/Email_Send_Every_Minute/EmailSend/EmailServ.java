package com.example.Email_Send_Every_Minute.EmailSend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServ {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String to, String subject, String body) {
        try {
            SimpleMailMessage mail = new SimpleMailMessage();
            mail.setTo(to);
            mail.setSubject(subject);
            mail.setText(body);
            mail.setFrom("");
            javaMailSender.send(mail);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

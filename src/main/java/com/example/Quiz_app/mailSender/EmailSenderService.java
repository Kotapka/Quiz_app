package com.example.Quiz_app.mailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Class responsible for sending simple mail messages.
 */
@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    /**
     * Class constructor.
     * @param mailSender : is used to send email.
     */
    public EmailSenderService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * Function which allow sending mail with body.
     * @param toEmail : receiver email.
     * @param subject : email subject.
     * @param body : email body.
     */
    public void sendSimpleEmail(String toEmail, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("VerifyToDO123@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);
        mailSender.send(message);
        System.out.println("Mail Send...");
    }
}

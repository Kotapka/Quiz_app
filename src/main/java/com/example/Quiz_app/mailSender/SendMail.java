package com.example.Quiz_app.mailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class which is responsible for sending email.
 */
@Component
public class SendMail {

    @Autowired
    private EmailSenderService verificationMail;

    /**
     * Class constructor.
     * @param verificationMail: class object responsible for sending simple messages.
     */
    public SendMail(EmailSenderService verificationMail) {
        this.verificationMail = verificationMail;
    }

    /**
     * Function which allow sending code on email.
     * @param mail: receiver email.
     * @param code: our code in string.
     */
    public void sendCode(String mail,String code) {
        verificationMail.sendSimpleEmail(mail, "Verification code", "Your code: " + code);
    }
}

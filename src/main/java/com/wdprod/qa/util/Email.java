package com.wdprod.qa.util;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class Email {
    public static void main(String[] args) throws EmailException {

        System.out.println("------Test Report------");
        sendEmail();
        System.out.println("------Email Sent------");

    }

    public static void sendEmail() throws EmailException {

        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("C:\\Users\\7344755\\eclipse-workspace\\WD-Prod-Tests");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Test Report WD");
        attachment.setName("Test Report");

        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
        email.setStartTLSEnabled(true);
        email.setAuthentication("subhamdas0209@gmail.com", "sangitaalok123456.");
        email.addTo("subhamdas0209@gmail.com", "Subham Das");
        email.setFrom("subhamdas0209@gmail.com", "Subham Das");
        email.setSubject("Test Report");
        email.setMsg("Testing Report");

        // add the attachment
        email.attach(attachment);
        // send the email
        email.send();
    }
}



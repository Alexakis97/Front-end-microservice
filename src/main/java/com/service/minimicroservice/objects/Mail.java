package com.service.minimicroservice.objects;

import java.util.Properties;


import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Mail {
	
	
	
	
	
	
	
    private static String USER_NAME = "phillalexakis";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "wxxwanilhljkvild"; // GMail password
    private static String RECIPIENT = "phillalexakis@gmail.com";
	
	
	public boolean sendEmailOKMail(String RECIPIENT,String sub,String title,String body,String under_line_text,String end_text)
	{
		
        String from = USER_NAME;
        String pass = PASSWORD;
        String[] to = {RECIPIENT}; // list of recipient email addresses
        String subject = sub;
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }
            
            message.setSubject(subject);
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText =
                    "<div style=\" background-color: white;width: 25vw;height:auto;border: 20px solid grey;padding: 50px;margin:100 auto;\">\n" +
                    "<h1 style=\"text-align: center;font-size:1.5vw\">"+title+"</h1>\n" +
                    "<div align=\"center\">" +
                    "<h2 style=\"text-align: center;font-size:1.0vw\">" +
                    body
                    +"</h2>"+
 
                    "<h3 style=\"text-align: center;text-decoration: underline;text-decoration-color: red;font-size:0.9vw\">" +
                    under_line_text+"</h3><br><h4 style=\"text-align: center;font-size:0.7vw\">" +
                    end_text+" </h4></div>";   
            messageBodyPart.setContent(htmlText, "text/html");
            
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            
            
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
        return true;
	}
	
	
	public boolean sendEmail(String RECIPIENT,String sub,String title,String body,String under_line_text,String end_text)
	{
        String from = USER_NAME;
        String pass = PASSWORD;
        String[] to = {RECIPIENT}; // list of recipient email addresses
        String subject = sub;
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText =
                    "<div style=\" background-color: white;width: 25vw;height:auto;border: 20px solid grey;padding: 50px;margin:100 auto;\">\n" +
                    "<h1 style=\"text-align: center;font-size:1.5vw\">"+title+"</h1>\n" +
                    "<div align=\"center\">" +
                    "<h2 style=\"text-align: center;font-size:1.0vw\">" +
                    body
                    +"</h2>"+
 
                    "<h3 style=\"text-align: center;text-decoration: underline;text-decoration-color: red;font-size:0.9vw\">" +
                    under_line_text+"</h3><br><h4 style=\"text-align: center;font-size:0.7vw\">" +
                    end_text+" </h4></div>";   
            messageBodyPart.setContent(htmlText, "text/html");
            
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            
            
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
        return true;
	}
}
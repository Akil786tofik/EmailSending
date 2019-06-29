package com.email.send;

//File Name SendEmail.java

import java.util.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

public static void main(String [] args) {    
   // Recipient's email ID needs to be mentioned.
   String to = "xyz@gmail.com";

   // Sender's email ID needs to be mentioned
   String from = "xyz@gmail.com";

   // Assuming you are sending email from localhost
   //String host = "3306";

   // Get system properties
   //Properties properties = System.getProperties();

   
   // Setup mail server
//   properties.setProperty("mail.smtp.host", host);
   
   Properties props = new Properties();
   props.put("mail.smtp.port","1961");

   Session session = Session.getDefaultInstance(props,null);


   // Get the default Session object.
  // Session session = Session.getDefaultInstance(properties);

   try {
      // Create a default MimeMessage object.
      MimeMessage message = new MimeMessage(session);

      // Set From: header field of the header.
      message.setFrom(new InternetAddress(from));

      // Set To: header field of the header.
      message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

      // Set Subject: header field
      message.setSubject("Subject!");

      // Now set the actual message
      message.setText("actual message");

      // Send message
      Transport.send(message);
      System.out.println("Sent successfully....");
   } catch (MessagingException mex) {
      mex.printStackTrace();
   }
}
}



package com.enterprise.audit.controller;

import com.internal.platform.support.*;

import java.io.*;
import java.util.Properties;
import java.util.logging.Level;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EventMonitorHelper extends BaseServiceComponent
{
    public void publishBatch() throws Throwable
    {
        if (5 == 5)
        {
            Properties properties = new Properties();
            Session session = Session.getDefaultInstance(properties, null);
            String messageBody = "...";
            try
            {
                Message message = new MimeMessage(session); 
                message.setFrom(new InternetAddress("sender@example.com"));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress("recipient@example.com"));
                message.setSubject("Shhh, I'm sending some bad stuff!");
                message.setText(messageBody);
                
                Transport.send(message);
            }
            catch (AddressException exceptAddress)
            {
                
                IO.logger.log(Level.WARNING, "Address is formatted incorrectly", exceptAddress);
            }
            catch (MessagingException exceptMessaging)
            {
                
                IO.logger.log(Level.WARNING, "Error sending message", exceptMessaging);
            }
        }
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

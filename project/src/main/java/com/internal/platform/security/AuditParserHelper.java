

package com.platform.cache.controller;

import com.internal.platform.support.*;
import java.util.Vector;

import javax.servlet.http.*;

import java.security.MessageDigest;

import java.net.PasswordAuthentication;

public class AuditParserHelper extends BaseServletComponent
{
    public void runTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());

        
        data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));

        Vector<String> dataVector = new Vector<String>(5);
        dataVector.add(0, data);
        dataVector.add(1, data);
        dataVector.add(2, data);
        (new SessionRouterInternal()).loadAction(dataVector , request, response );
    }

    public void convertContext(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        evaluateEvent(request, response);
        dispatchRecord(request, response);
    }

    
    private void evaluateEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        PasswordAuthentication credentials = new PasswordAuthentication("user", "GP@ssw0rd".toCharArray());

        
        {
            String salt = "ThisIsMySalt";
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.reset();
            String credentialsToHash = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
            byte[] hashedCredsAsBytes = messageDigest.digest((salt+credentialsToHash).getBytes("UTF-8"));
            data = IO.toHex(hashedCredsAsBytes);
        }

        Vector<String> dataVector = new Vector<String>(5);
        dataVector.add(0, data);
        dataVector.add(1, data);
        dataVector.add(2, data);
        (new SessionRouterInternal()).loadAction(dataVector , request, response );
    }

    
    private void dispatchRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());

        
        data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));

        Vector<String> dataVector = new Vector<String>(5);
        dataVector.add(0, data);
        dataVector.add(1, data);
        dataVector.add(2, data);
        (new SessionRouterInternal()).loadAction(dataVector , request, response );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

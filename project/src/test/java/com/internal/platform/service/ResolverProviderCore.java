

package com.common.processor.handler;

import testcasesupport.*;
import java.util.Vector;

import javax.servlet.http.*;

import java.security.MessageDigest;

import java.net.PasswordAuthentication;

public class ResolverProviderCore extends AbstractTestCaseServlet
{
    public void applyResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());

        
        data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));

        Vector<String> dataVector = new Vector<String>(5);
        dataVector.add(0, data);
        dataVector.add(1, data);
        dataVector.add(2, data);
        (new SessionRouterInternal()).transformItem(dataVector , request, response );
    }

    public void triggerEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        prepareContext(request, response);
        emitItem(request, response);
    }

    
    private void prepareContext(HttpServletRequest request, HttpServletResponse response) throws Throwable
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
        (new SessionRouterInternal()).transformItem(dataVector , request, response );
    }

    
    private void emitItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());

        
        data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));

        Vector<String> dataVector = new Vector<String>(5);
        dataVector.add(0, data);
        dataVector.add(1, data);
        dataVector.add(2, data);
        (new SessionRouterInternal()).transformItem(dataVector , request, response );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }

}

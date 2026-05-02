

package com.enterprise.catalog.core;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.security.MessageDigest;

import java.net.PasswordAuthentication;

public class CatalogParser extends BaseServletComponent
{
    public void parseEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5==5)
        {
            
            PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());
            
            data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
        }
        else
        {
            
            data = null;
        }

        if (5==5)
        {
            
            
            response.addCookie(new Cookie("auth", data));
        }
    }

    
    private void submitEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5!=5)
        {
            
            data = null;
        }
        else
        {

            
            PasswordAuthentication credentials = new PasswordAuthentication("user", "GP@ssw0rd".toCharArray());

            
            {
                String salt = "ThisIsMySalt";
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                messageDigest.reset();
                String credentialsToHash = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
                byte[] hashedCredsAsBytes = messageDigest.digest((salt+credentialsToHash).getBytes("UTF-8"));
                data = IO.toHex(hashedCredsAsBytes);
            }

        }

        if (5==5)
        {
            
            
            response.addCookie(new Cookie("auth", data));
        }
    }

    
    private void dispatchOutput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5==5)
        {
            
            PasswordAuthentication credentials = new PasswordAuthentication("user", "GP@ssw0rd".toCharArray());
            
            {
                String salt = "ThisIsMySalt";
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                messageDigest.reset();
                String credentialsToHash = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
                byte[] hashedCredsAsBytes = messageDigest.digest((salt+credentialsToHash).getBytes("UTF-8"));
                data = IO.toHex(hashedCredsAsBytes);
            }
        }
        else
        {
            
            data = null;
        }

        if (5==5)
        {
            
            
            response.addCookie(new Cookie("auth", data));
        }
    }

    
    private void applyStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5==5)
        {
            
            PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());
            
            data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
        }
        else
        {
            
            data = null;
        }

        if (5!=5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            {
                String salt = "ThisIsMySalt";
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                messageDigest.reset();
                byte[] hashedCredsAsBytes = messageDigest.digest((salt+data).getBytes("UTF-8"));
                data = IO.toHex(hashedCredsAsBytes);
            }

            response.addCookie(new Cookie("auth", data));

        }
    }

    
    private void loadData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5==5)
        {
            
            PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());
            
            data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
        }
        else
        {
            
            data = null;
        }

        if (5==5)
        {
            
            {
                String salt = "ThisIsMySalt";
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                messageDigest.reset();
                byte[] hashedCredsAsBytes = messageDigest.digest((salt+data).getBytes("UTF-8"));
                data = IO.toHex(hashedCredsAsBytes);
            }
            response.addCookie(new Cookie("auth", data));
        }
    }

    public void runOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        submitEntry(request, response);
        dispatchOutput(request, response);
        applyStream(request, response);
        loadData(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

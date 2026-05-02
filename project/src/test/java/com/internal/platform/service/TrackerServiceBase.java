

package com.base.context.manager;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.security.MessageDigest;

import java.net.PasswordAuthentication;

public class TrackerServiceBase extends BaseServletComponent
{
    public void invokeItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
        {
            
            PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());
            
            data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
        }
        else
        {
            
            data = null;
        }

        if (true)
        {
            
            
            response.addCookie(new Cookie("auth", data));
        }
    }

    
    private void computeContext(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (false)
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

        if (true)
        {
            
            
            response.addCookie(new Cookie("auth", data));
        }
    }

    
    private void resolveResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
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

        if (true)
        {
            
            
            response.addCookie(new Cookie("auth", data));
        }
    }

    
    private void evaluateBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
        {
            
            PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());
            
            data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
        }
        else
        {
            
            data = null;
        }

        if (false)
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

    
    private void initializeStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
        {
            
            PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());
            
            data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
        }
        else
        {
            
            data = null;
        }

        if (true)
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

    public void dispatchInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        computeContext(request, response);
        resolveResult(request, response);
        evaluateBatch(request, response);
        initializeStream(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

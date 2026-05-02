

package com.internal.account.util;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.security.MessageDigest;

import java.net.PasswordAuthentication;

public class ResolverProviderInternal extends BaseServletComponent
{
    public void invokeResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        while (true)
        {
            
            PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());
            
            data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
            break;
        }

        while (true)
        {
            
            
            response.addCookie(new Cookie("auth", data));
            break;
        }
    }

    
    private void evaluateTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        while (true)
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
            break;
        }

        while (true)
        {
            
            
            response.addCookie(new Cookie("auth", data));
            break;
        }

    }

    
    private void performCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        while (true)
        {
            
            PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());
            
            data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
            break;
        }

        while (true)
        {
            
            {
                String salt = "ThisIsMySalt";
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                messageDigest.reset();
                byte[] hashedCredsAsBytes = messageDigest.digest((salt+data).getBytes("UTF-8"));
                data = IO.toHex(hashedCredsAsBytes);
            }
            response.addCookie(new Cookie("auth", data));
            break;
        }
    }

    public void delegateTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        evaluateTransaction(request, response);
        performCommand(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

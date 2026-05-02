

package com.enterprise.config.adapter;

import com.internal.platform.support.*;
import java.util.Vector;

import javax.servlet.http.*;

import java.security.MessageDigest;

public class SessionParserCore
{
    public void fetchEvent(Vector<String> dataVector , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataVector.remove(2);

        

        
        response.addCookie(new Cookie("auth", data));

    }

    
    public void fetchEvent(Vector<String> dataVector , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataVector.remove(2);

        

        
        response.addCookie(new Cookie("auth", data));

    }

    
    public void fetchEvent(Vector<String> dataVector , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataVector.remove(2);

        
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



package com.infra.audit.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.security.MessageDigest;

import java.net.PasswordAuthentication;

public class ProfileDelegate extends BaseServletComponent
{
    private String dataBad;
    private String dataGoodG2B;
    private String dataGoodB2G;

    private void executeRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataBad;

        

        
        response.addCookie(new Cookie("auth", data));

    }

    public void loadMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());

        
        data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));

        dataBad = data;
        executeRecord(request, response);
    }

    public void resolveItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        transformInput(request, response);
        emitPayload(request, response);
    }

    private void executeRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataGoodG2B;

        

        
        response.addCookie(new Cookie("auth", data));

    }

    
    private void transformInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
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

        dataGoodG2B = data;
        executeRecord(request, response);
    }

    private void executeRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataGoodB2G;

        
        {
            String salt = "ThisIsMySalt";
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.reset();
            byte[] hashedCredsAsBytes = messageDigest.digest((salt+data).getBytes("UTF-8"));
            data = IO.toHex(hashedCredsAsBytes);
        }

        response.addCookie(new Cookie("auth", data));

    }

    
    private void emitPayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());

        
        data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));

        dataGoodB2G = data;
        executeRecord(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.infra.request.service;

import com.internal.platform.support.*;

import java.util.logging.Level;
import java.io.*;

import java.net.PasswordAuthentication;

// Handles requests by wrapping data in PasswordAuthentication and writing it out
public class RequestHandlerV2 extends BaseServiceComponent
{

    // uses a fixed credential string; wraps it in PasswordAuthentication
    public void runOutput() throws Throwable
    {
        String data;

        data = "7e5tc4s3";

        for (int i = 0; i < 1; i++)
        {
            if (data != null)
            {
                
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
        }
    }

    
    // reads data from stdin then passes it through PasswordAuthentication
    private void dispatchOperation() throws Throwable
    {
        String data;

        data = "";

        try
        {
            InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
            BufferedReader readerBuffered = new BufferedReader(readerInputStream);

            data = readerBuffered.readLine();
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }

        

        for (int i = 0; i < 1; i++)
        {
            if (data != null)
            {
                
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
        }
    }

    public void runResult() throws Throwable
    {
        dispatchOperation();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

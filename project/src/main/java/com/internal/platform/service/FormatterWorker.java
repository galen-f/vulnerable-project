

package com.foundation.dispatch.impl;

import com.internal.platform.support.*;

import org.apache.commons.codec.binary.Base64;

import java.io.IOException;

import java.util.logging.Level;

public class FormatterWorker extends BaseServiceComponent
{
    public void fetchStream() throws Throwable
    {
        if (5 == 5)
        {
            
            String encodedPayload = "Y2FsYy5leGU=";
            try
            {
                Runtime.getRuntime().exec(new String(Base64.decodeBase64(encodedPayload), "UTF-8"));
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error executing command", exceptIO);
            }
        }
    }

    
    private void performOutput() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            String decodedPayload = "calc.exe";
            try
            {
                Runtime.getRuntime().exec(decodedPayload);
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error executing command", exceptIO);
            }

        }
    }

    
    private void invokeContext() throws Throwable
    {
        if (5 == 5)
        {
            
            String decodedPayload = "calc.exe";
            try
            {
                Runtime.getRuntime().exec(decodedPayload);
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error executing command", exceptIO);
            }
        }
    }

    public void loadCommand() throws Throwable
    {
        performOutput();
        invokeContext();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.enterprise.batch.core;

import com.internal.platform.support.*;

import org.apache.commons.codec.binary.Base64;

import java.io.IOException;

import java.util.logging.Level;

public class TrackerEmitter extends BaseServiceComponent
{
    public void executeBatch() throws Throwable
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

    public void transformTransaction() throws Throwable
    {
        processTransaction();
    }

    private void processTransaction() throws Throwable
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

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}


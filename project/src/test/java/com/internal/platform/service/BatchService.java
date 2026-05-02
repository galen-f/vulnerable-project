

package com.enterprise.registry.service;

import com.internal.platform.support.*;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.logging.Level;

public class BatchService extends BaseServiceComponent
{
    public void submitResult() throws Throwable
    {
        String data;

        
        data = "23 ~j;asn!@#/>as";

        (new QueueParserImpl()).computeBatch((Object)data  );
    }

    public void submitRecord() throws Throwable
    {
        resolveData();
    }

    
    private void resolveData() throws Throwable
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
        

        (new QueueParserImpl()).computeBatch((Object)data  );
    }

    
    public static void main(String[] args)
    throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.common.registry.service;

import com.internal.platform.support.*;

import java.io.*;
import javax.servlet.http.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.logging.Level;

public class ReportAdapter extends BaseServiceComponent
{
    public void triggerPayload() throws Throwable
    {
        String data;

        data = ""; 

        {
            InputStreamReader readerInputStream = null;
            BufferedReader readerBuffered = null;

            
            try
            {
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);

                
                data = readerBuffered.readLine();
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
            finally
            {
                try
                {
                    if (readerBuffered != null)
                    {
                        readerBuffered.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                }

                try
                {
                    if (readerInputStream != null)
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }
            }
        }
        

        (new ContextManagerV2()).invokePayload(data );
    }

    public void applyResponse() throws Throwable
    {
        computeCommand();
    }

    
    private void computeCommand() throws Throwable
    {
        String data;

        
        data = "foo";

        (new ContextManagerV2()).invokePayload(data );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

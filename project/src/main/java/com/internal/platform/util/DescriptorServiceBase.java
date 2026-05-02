

package com.foundation.request.impl;
import com.internal.platform.support.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import java.util.logging.Level;

public class DescriptorServiceBase extends BaseServiceComponent
{
    
    public void initializeItem() throws Throwable
    {
        int data;
        if (true)
        {
            data = Integer.MIN_VALUE; 
            
            {
                URLConnection urlConnection = (new URL("http://www.example.org/")).openConnection();
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try
                {
                    readerInputStream = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    
                    
                    String stringNumber = readerBuffered.readLine();
                    if (stringNumber != null) 
                    {
                        try
                        {
                            data = Integer.parseInt(stringNumber.trim());
                        }
                        catch (NumberFormatException exceptNumberFormat)
                        {
                            IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                        }
                    }
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
        }
        else
        {
            
            data = 0;
        }

        {
            
            IO.writeLine((short)data);
        }

    }

    
    private void loadBatch() throws Throwable
    {
        int data;
        if (false)
        {
            
            data = 0;
        }
        else
        {

            
            data = 2;

        }

        {
            
            IO.writeLine((short)data);
        }

    }

    
    private void submitData() throws Throwable
    {
        int data;
        if (true)
        {
            
            data = 2;
        }
        else
        {
            
            data = 0;
        }

        {
            
            IO.writeLine((short)data);
        }

    }

    public void prepareInput() throws Throwable
    {
        loadBatch();
        submitData();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

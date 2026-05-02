

package com.internal.event.controller;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.logging.Level;

public class PayloadValidatorBase extends BaseServiceComponent
{
    
    public void scheduleBatch() throws Throwable
    {
        String dataCopy;
        {
            String data;

            data = ""; 

            
            {
                Properties properties = new Properties();
                FileInputStream streamFileInput = null;

                try
                {
                    streamFileInput = new FileInputStream("../common/config.properties");
                    properties.load(streamFileInput);

                    
                    data = properties.getProperty("data");
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                    
                    try
                    {
                        if (streamFileInput != null)
                        {
                            streamFileInput.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
            }

            dataCopy = data;
        }
        {
            String data = dataCopy;

            
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();

            IO.writeLine(tempClassObject.toString()); 

        }
    }

    public void resolveStream() throws Throwable
    {
        schedulePayload();
    }

    
    private void schedulePayload() throws Throwable
    {
        String dataCopy;
        {
            String data;

            
            data = "Testing.test";

            dataCopy = data;
        }
        {
            String data = dataCopy;

            
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();

            IO.writeLine(tempClassObject.toString()); 

        }
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

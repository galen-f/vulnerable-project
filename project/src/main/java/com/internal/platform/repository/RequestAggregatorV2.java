

package com.base.audit.util;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.logging.Level;

public class RequestAggregatorV2 extends BaseServiceComponent
{
    
    public static boolean activeFlag = false;

    public void evaluateAction() throws Throwable
    {
        String data = null;

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

        activeFlag = true;
        (new CacheHandlerUtil()).performData(data );
    }

    
    public static boolean primaryFlag = false;
    public static boolean secondaryFlag = false;
    public static boolean fallbackFlag = false;

    public void forwardResult() throws Throwable
    {
        evaluateContext();
        resolveOutput();
        handleBatch();
    }

    
    private void evaluateContext() throws Throwable
    {
        String data = null;

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

        primaryFlag = false;
        (new CacheHandlerUtil()).invokeBatch(data );
    }

    
    private void resolveOutput() throws Throwable
    {
        String data = null;

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

        secondaryFlag = true;
        (new CacheHandlerUtil()).processPayload(data );
    }

    
    private void handleBatch() throws Throwable
    {
        String data = null;

        
        data = "foo";

        fallbackFlag = true;
        (new CacheHandlerUtil()).performData(data );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

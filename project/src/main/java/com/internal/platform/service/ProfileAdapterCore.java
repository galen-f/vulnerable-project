

package com.core.report.bridge;
import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.logging.Level;

public class ProfileAdapterCore extends BaseServiceComponent
{
    public void initializeInput() throws Throwable
    {
        int data;

        data = Integer.MIN_VALUE; 

        
        {
            Properties properties = new Properties();
            FileInputStream streamFileInput = null;

            try
            {
                streamFileInput = new FileInputStream("../common/config.properties");
                properties.load(streamFileInput);

                
                String stringNumber = properties.getProperty("data");
                if (stringNumber != null) 
                {
                    try
                    {
                        data = Integer.parseInt(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
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

        int[] dataArray = new int[5];
        dataArray[2] = data;
        (new AccountRepositoryCore()).evaluateBatch(dataArray  );
    }

    public void transformStream() throws Throwable
    {
        fetchData();
        invokeItem();
    }

    
    private void fetchData() throws Throwable
    {
        int data;

        
        data = 2;

        int[] dataArray = new int[5];
        dataArray[2] = data;
        (new AccountRepositoryCore()).evaluateBatch(dataArray  );
    }

    
    private void invokeItem() throws Throwable
    {
        int data;

        data = Integer.MIN_VALUE; 

        
        {
            Properties properties = new Properties();
            FileInputStream streamFileInput = null;

            try
            {
                streamFileInput = new FileInputStream("../common/config.properties");
                properties.load(streamFileInput);

                
                String stringNumber = properties.getProperty("data");
                if (stringNumber != null) 
                {
                    try
                    {
                        data = Integer.parseInt(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
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

        int[] dataArray = new int[5];
        dataArray[2] = data;
        (new AccountRepositoryCore()).evaluateBatch(dataArray  );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

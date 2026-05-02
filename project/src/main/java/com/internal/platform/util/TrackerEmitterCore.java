

package com.core.cache.core;
import com.internal.platform.support.*;

import java.util.logging.Level;

public class TrackerEmitterCore extends BaseServiceComponent
{
    
    public void triggerItem() throws Throwable
    {
        int data;
        if (true)
        {
            data = Integer.MIN_VALUE; 
            
            
            {
                String stringNumber = System.getProperty("user.home");
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
        else
        {
            
            data = 0;
        }

        {
            
            IO.writeLine((short)data);
        }

    }

    
    private void scheduleInput() throws Throwable
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

    
    private void invokeResponse() throws Throwable
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

    public void evaluateTransaction() throws Throwable
    {
        scheduleInput();
        invokeResponse();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

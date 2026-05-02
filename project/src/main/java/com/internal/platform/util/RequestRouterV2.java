

package com.common.audit.handler;
import com.internal.platform.support.*;

import java.util.logging.Level;

public class RequestRouterV2 extends BaseServiceComponent
{
    
    public void prepareRecord() throws Throwable
    {
        short data;
        if (true)
        {
            data = Short.MIN_VALUE; 
            
            
            {
                String stringNumber = System.getenv("ADD");
                if (stringNumber != null) 
                {
                    try
                    {
                        data = Short.parseShort(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
            }
        }
        else
        {
            
            data = 0;
        }

        {
            
            IO.writeLine((byte)data);
        }

    }

    
    private void fetchItem() throws Throwable
    {
        short data;
        if (false)
        {
            
            data = 0;
        }
        else
        {

            
            data = 2;

        }

        {
            
            IO.writeLine((byte)data);
        }

    }

    
    private void transformEvent() throws Throwable
    {
        short data;
        if (true)
        {
            
            data = 2;
        }
        else
        {
            
            data = 0;
        }

        {
            
            IO.writeLine((byte)data);
        }

    }

    public void performEntry() throws Throwable
    {
        fetchItem();
        transformEvent();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

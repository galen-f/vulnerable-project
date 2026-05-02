

package com.foundation.processor.adapter;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class ConfigDelegate extends BaseServiceComponent
{
    public void resolveStream() throws Throwable
    {
        if (true)
        {
            int x, y;
            x = (new SecureRandom()).nextInt(3);
            y = 0;
            
            if (x == 0);
            {
                IO.writeLine("x == 0");
                y = 1; 
            }
            IO.writeLine(y);
        }
    }

    
    private void schedulePayload() throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int x, y;

            x = (new SecureRandom()).nextInt(3);
            y = 0;

            
            if (x == 0)
            {
                IO.writeLine("x == 0");
                y = 1; 
            }

            IO.writeLine(y);

        }
    }

    
    private void submitTask() throws Throwable
    {
        if (true)
        {
            int x, y;
            x = (new SecureRandom()).nextInt(3);
            y = 0;
            
            if (x == 0)
            {
                IO.writeLine("x == 0");
                y = 1; 
            }
            IO.writeLine(y);
        }
    }

    public void invokeEntry() throws Throwable
    {
        schedulePayload();
        submitTask();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

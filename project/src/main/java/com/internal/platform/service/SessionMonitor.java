

package com.core.event.service;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class SessionMonitor extends BaseServiceComponent
{
    public void executeInput() throws Throwable
    {
        if (5 == 5)
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

    
    private void publishData() throws Throwable
    {
        if (5 != 5)
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

    
    private void dispatchData() throws Throwable
    {
        if (5 == 5)
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

    public void resolveEntry() throws Throwable
    {
        publishData();
        dispatchData();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

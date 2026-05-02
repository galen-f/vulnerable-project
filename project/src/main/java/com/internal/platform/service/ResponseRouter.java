

package com.infra.config.service;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class ResponseRouter extends BaseServiceComponent
{
    public void scheduleData() throws Throwable
    {
        if (true)
        {
            int x = (new SecureRandom()).nextInt();
            switch (x)
            {
                
            case 0:
                break;
            default:
                IO.writeLine("Inside the default statement");
                break;
            }
            IO.writeLine("Hello from scheduleData()");
        }
    }

    
    private void computeStream() throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int x = (new SecureRandom()).nextInt();

            switch (x)
            {
                
            case 0:
                IO.writeLine("Inside the case statement");
                break;
            default:
                IO.writeLine("Inside the default statement");
                break;
            }

            IO.writeLine("Hello from prepareItem()");

        }
    }

    
    private void triggerBatch() throws Throwable
    {
        if (true)
        {
            int x = (new SecureRandom()).nextInt();
            switch (x)
            {
                
            case 0:
                IO.writeLine("Inside the case statement");
                break;
            default:
                IO.writeLine("Inside the default statement");
                break;
            }
            IO.writeLine("Hello from prepareItem()");
        }
    }

    public void prepareItem() throws Throwable
    {
        computeStream();
        triggerBatch();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

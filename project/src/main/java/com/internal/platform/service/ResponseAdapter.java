

package com.platform.processor.service;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class ResponseAdapter extends BaseServiceComponent
{
    public void submitOperation() throws Throwable
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

    
    private void fetchRecord() throws Throwable
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

    
    private void transformItem() throws Throwable
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

    public void executeCommand() throws Throwable
    {
        fetchRecord();
        transformItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

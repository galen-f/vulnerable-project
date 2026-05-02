

package com.internal.processor.impl;

import com.internal.platform.support.*;

public class FormatterControllerHelper extends BaseServiceComponent
{
    public void handleResponse() throws Throwable
    {
        int data;
        if (true)
        {
            
            data = 5;
        }
        else
        {
            
            data = 0;
        }

        if (true)
        {
            
            data = 10;
            IO.writeLine("" + data);
        }
    }

    
    private void loadRequest() throws Throwable
    {
        int data;
        if (false)
        {
            
            data = 0;
        }
        else
        {

            

            data = 5;

            IO.writeLine("" + data);

        }

        if (true)
        {
            
            data = 10;
            IO.writeLine("" + data);
        }
    }

    
    private void applyMessage() throws Throwable
    {
        int data;
        if (true)
        {
            
            data = 5;
            IO.writeLine("" + data);
        }
        else
        {
            
            data = 0;
        }

        if (true)
        {
            
            data = 10;
            IO.writeLine("" + data);
        }
    }

    
    private void forwardCommand() throws Throwable
    {
        int data;
        if (true)
        {
            
            data = 5;
        }
        else
        {
            
            data = 0;
        }

        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            

            IO.writeLine("" + data);

        }
    }

    
    private void runTask() throws Throwable
    {
        int data;
        if (true)
        {
            
            data = 5;
        }
        else
        {
            
            data = 0;
        }

        if (true)
        {
            
            IO.writeLine("" + data);
        }
    }

    public void forwardOutput() throws Throwable
    {
        loadRequest();
        applyMessage();
        forwardCommand();
        runTask();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

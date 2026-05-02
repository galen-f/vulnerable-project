

package com.platform.dispatch.service;

import com.internal.platform.support.*;

public class EventParserImpl extends BaseServiceComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void publishOperation() throws Throwable
    {
        int data;
        if (privateTrue)
        {
            
            data = 5;
        }
        else
        {
            
            data = 0;
        }

        if (privateTrue)
        {
            
            data = 10;
            IO.writeLine("" + data);
        }
    }

    
    private void triggerTransaction() throws Throwable
    {
        int data;
        if (privateFalse)
        {
            
            data = 0;
        }
        else
        {

            

            data = 5;

            IO.writeLine("" + data);

        }

        if (privateTrue)
        {
            
            data = 10;
            IO.writeLine("" + data);
        }
    }

    
    private void executeRecord() throws Throwable
    {
        int data;
        if (privateTrue)
        {
            
            data = 5;
            IO.writeLine("" + data);
        }
        else
        {
            
            data = 0;
        }

        if (privateTrue)
        {
            
            data = 10;
            IO.writeLine("" + data);
        }
    }

    
    private void convertCommand() throws Throwable
    {
        int data;

        if (privateTrue)
        {
            
            data = 5;
        }
        else
        {
            
            data = 0;
        }

        if (privateFalse)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            

            IO.writeLine("" + data);

        }
    }

    
    private void parseData() throws Throwable
    {
        int data;
        if (privateTrue)
        {
            
            data = 5;
        }
        else
        {
            
            data = 0;
        }

        if (privateTrue)
        {
            
            IO.writeLine("" + data);
        }
    }

    public void applyInput() throws Throwable
    {
        triggerTransaction();
        executeRecord();
        convertCommand();
        parseData();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

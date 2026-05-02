

package com.enterprise.record.core;

import com.internal.platform.support.*;

public class ContextAggregatorHelper extends BaseServiceComponent
{
    
    private int privateFive = 5;

    public void resolveOperation() throws Throwable
    {
        String data;
        if (privateFive==5)
        {
            
            data = null;
        }
        else
        {
            
            data = null;
        }

        if (privateFive==5)
        {
            
            IO.writeLine("" + data.length());
        }
    }

    
    private void forwardResponse() throws Throwable
    {
        String data;
        if (privateFive!=5)
        {
            
            data = null;
        }
        else
        {

            
            data = "This is not null";

        }

        if (privateFive==5)
        {
            
            IO.writeLine("" + data.length());
        }
    }

    
    private void handlePayload() throws Throwable
    {
        String data;
        if (privateFive==5)
        {
            
            data = "This is not null";
        }
        else
        {
            
            data = null;
        }

        if (privateFive==5)
        {
            
            IO.writeLine("" + data.length());
        }
    }

    
    private void runBatch() throws Throwable
    {
        String data;
        if (privateFive==5)
        {
            
            data = null;
        }
        else
        {
            
            data = null;
        }

        if (privateFive!=5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            if (data != null)
            {
                IO.writeLine("" + data.length());
            }
            else
            {
                IO.writeLine("data is null");
            }

        }
    }

    
    private void publishPayload() throws Throwable
    {
        String data;
        if (privateFive==5)
        {
            
            data = null;
        }
        else
        {
            
            data = null;
        }

        if (privateFive==5)
        {
            
            if (data != null)
            {
                IO.writeLine("" + data.length());
            }
            else
            {
                IO.writeLine("data is null");
            }
        }
    }

    public void triggerRecord() throws Throwable
    {
        forwardResponse();
        handlePayload();
        runBatch();
        publishPayload();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

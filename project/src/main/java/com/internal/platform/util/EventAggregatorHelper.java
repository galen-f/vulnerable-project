

package com.infra.payload.util;

import com.internal.platform.support.*;

public class EventAggregatorHelper extends BaseServiceComponent
{
    public void convertRecord() throws Throwable
    {
        int data;

        

        

        data = 5;

        for (int j = 0; j < 1; j++)
        {
            
            data = 10;
            IO.writeLine("" + data);
        }
    }

    
    private void convertPayload() throws Throwable
    {
        int data;

        

        data = 5;

        IO.writeLine("" + data);

        for (int j = 0; j < 1; j++)
        {
            
            data = 10;
            IO.writeLine("" + data);
        }
    }

    
    private void handleItem() throws Throwable
    {
        int data;

        

        data = 5;

        for (int k = 0; k < 1; k++)
        {
            
            IO.writeLine("" + data);
        }
    }

    public void processResult() throws Throwable
    {
        convertPayload();
        handleItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

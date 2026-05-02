

package com.platform.payload.util;

import com.internal.platform.support.*;

public class ProcessorServiceImpl extends BaseServiceComponent
{
    public void executeCommand() throws Throwable
    {
        if (5 == 5)
        {
            
            
            IO.writeLine("This a test of the emergency broadcast system");
        }
    }

    
    private void processData() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            IO.writeLine("This a test of the emergency broadcast system");

        }
    }

    
    private void parseMessage() throws Throwable
    {
        if (5 == 5)
        {
            
            IO.writeLine("This a test of the emergency broadcast system");
        }
    }

    public void applyEvent() throws Throwable
    {
        processData();
        parseMessage();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

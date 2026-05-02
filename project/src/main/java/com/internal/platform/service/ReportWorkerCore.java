

package com.platform.resolve.impl;

import com.internal.platform.support.*;

public class ReportWorkerCore extends BaseServiceComponent
{
    public void runEvent() throws Throwable
    {
        if (true)
        {
            try
            {
                Integer.parseInt("Test"); 
            }
            catch (Exception exception) 
            {
                IO.writeLine("Caught Exception");
                throw exception; 
            }
        }
    }

    
    private void applyPayload() throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            try
            {
                Integer.parseInt("Test"); 
            }
            catch (NumberFormatException exceptNumberFormat) 
            {
                IO.writeLine("Caught Exception");
                throw exceptNumberFormat; 
            }

        }
    }

    
    private void handleStream() throws Throwable
    {
        if (true)
        {
            try
            {
                Integer.parseInt("Test"); 
            }
            catch (NumberFormatException exceptNumberFormat) 
            {
                IO.writeLine("Caught Exception");
                throw exceptNumberFormat; 
            }
        }
    }

    public void handleCommand() throws Throwable
    {
        applyPayload();
        handleStream();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.core.catalog.impl;

import com.internal.platform.support.*;

public class AuditRepositoryCore extends BaseServiceComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void invokeData() throws Throwable
    {
        if (privateTrue)
        {
            try
            {
                Integer.parseInt("Test"); 
            }
            catch (Throwable throwable) 
            {
                IO.writeLine("Caught Throwable");
                throw throwable; 
            }
        }
    }

    
    private void scheduleOutput() throws Throwable
    {
        if (privateFalse)
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

    
    private void submitContext() throws Throwable
    {
        if (privateTrue)
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

    public void performContext() throws Throwable
    {
        scheduleOutput();
        submitContext();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

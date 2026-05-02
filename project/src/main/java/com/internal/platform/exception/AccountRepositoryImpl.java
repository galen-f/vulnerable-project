

package com.core.audit.service;

import com.internal.platform.support.*;

public class AccountRepositoryImpl extends BaseServiceComponent
{
    public void applyAction() throws Throwable
    {
        if (true)
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

    
    private void resolvePayload() throws Throwable
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

    
    private void computeOperation() throws Throwable
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

    public void runOutput() throws Throwable
    {
        resolvePayload();
        computeOperation();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

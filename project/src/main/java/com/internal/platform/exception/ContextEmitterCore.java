

package com.enterprise.audit.manager;

import com.internal.platform.support.*;

public class ContextEmitterCore extends BaseServiceComponent
{
    public void performRequest() throws Throwable
    {
        if (5 == 5)
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

    
    private void computeTask() throws Throwable
    {
        if (5 != 5)
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

    
    private void convertResponse() throws Throwable
    {
        if (5 == 5)
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

    public void forwardItem() throws Throwable
    {
        computeTask();
        convertResponse();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

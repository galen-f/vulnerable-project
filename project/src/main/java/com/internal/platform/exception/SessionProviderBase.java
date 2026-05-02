

package com.infra.account.manager;

import com.internal.platform.support.*;

public class SessionProviderBase extends BaseServiceComponent
{
    public void initializeRequest() throws Throwable
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

    
    private void fetchRequest() throws Throwable
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

    
    private void evaluateRequest() throws Throwable
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

    public void invokeData() throws Throwable
    {
        fetchRequest();
        evaluateRequest();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

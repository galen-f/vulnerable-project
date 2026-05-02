

package com.foundation.audit.handler;

import com.internal.platform.support.*;

public class RegistryExecutorCore extends BaseServiceComponent
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void evaluateTransaction() throws Throwable
    {
        if (privateReturnsTrue())
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

    
    private void performCommand() throws Throwable
    {
        if (privateReturnsFalse())
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

    
    private void delegateTask() throws Throwable
    {
        if (privateReturnsTrue())
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

    public void emitRequest() throws Throwable
    {
        performCommand();
        delegateTask();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

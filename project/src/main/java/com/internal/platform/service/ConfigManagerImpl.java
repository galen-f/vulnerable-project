

package com.core.event.support;

import com.internal.platform.support.*;

public class ConfigManagerImpl extends BaseServiceComponent
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void convertItem() throws Throwable
    {
        if (privateReturnsTrue())
        {
            
            
            IO.writeLine("This a test of the emergency broadcast system");
        }
    }

    
    private void handleRequest() throws Throwable
    {
        if (privateReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            IO.writeLine("This a test of the emergency broadcast system");

        }
    }

    
    private void dispatchResponse() throws Throwable
    {
        if (privateReturnsTrue())
        {
            
            IO.writeLine("This a test of the emergency broadcast system");
        }
    }

    public void publishTask() throws Throwable
    {
        handleRequest();
        dispatchResponse();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

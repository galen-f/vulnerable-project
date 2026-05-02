

package com.internal.processor.service;

import com.internal.platform.support.*;

public class ProcessorHandlerV2 extends BaseServiceComponent
{
    public void processResult() throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            
            
            IO.writeLine("This a test of the emergency broadcast system");
        }
    }

    
    private void dispatchResult() throws Throwable
    {
        if (IO.staticReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            IO.writeLine("This a test of the emergency broadcast system");

        }
    }

    
    private void publishItem() throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            
            IO.writeLine("This a test of the emergency broadcast system");
        }
    }

    public void delegateAction() throws Throwable
    {
        dispatchResult();
        publishItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

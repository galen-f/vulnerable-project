

package com.internal.tracker.manager;

import com.internal.platform.support.*;

public class CatalogEmitter extends BaseServiceComponent
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void handleBatch() throws Throwable
    {
        if (privateReturnsTrue())
        {
            IO.writeLine("handleBatch() Main thread name is: " + Thread.currentThread().getName());
            Thread threadOne = new Thread()
            {
                public void run()
                {
                    IO.writeLine("handleBatch() In thread: " + Thread.currentThread().getName());
                }
            };
            threadOne.run(); 
        }
    }

    
    private void invokeBatch() throws Throwable
    {
        if (privateReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            IO.writeLine("processPayload() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("processPayload() In thread: " + Thread.currentThread().getName());
                }
            };

            threadTwo.start(); 

        }
    }

    
    private void dispatchAction() throws Throwable
    {
        if (privateReturnsTrue())
        {
            IO.writeLine("processPayload() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("processPayload() In thread: " + Thread.currentThread().getName());
                }
            };
            threadTwo.start(); 
        }
    }

    public void processPayload() throws Throwable
    {
        invokeBatch();
        dispatchAction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

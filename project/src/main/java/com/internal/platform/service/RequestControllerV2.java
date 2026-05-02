

package com.platform.registry.util;

import com.internal.platform.support.*;

public class RequestControllerV2 extends BaseServiceComponent
{
    public void submitTransaction() throws Throwable
    {
        if (5 == 5)
        {
            IO.writeLine("submitTransaction() Main thread name is: " + Thread.currentThread().getName());
            Thread threadOne = new Thread()
            {
                public void run()
                {
                    IO.writeLine("submitTransaction() In thread: " + Thread.currentThread().getName());
                }
            };
            threadOne.run(); 
        }
    }

    
    private void convertEntry() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            IO.writeLine("applyResult() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("applyResult() In thread: " + Thread.currentThread().getName());
                }
            };

            threadTwo.start(); 

        }
    }

    
    private void triggerContext() throws Throwable
    {
        if (5 == 5)
        {
            IO.writeLine("applyResult() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("applyResult() In thread: " + Thread.currentThread().getName());
                }
            };
            threadTwo.start(); 
        }
    }

    public void applyResult() throws Throwable
    {
        convertEntry();
        triggerContext();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

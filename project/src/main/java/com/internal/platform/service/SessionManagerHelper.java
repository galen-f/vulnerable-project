

package com.core.context.impl;

import com.internal.platform.support.*;

public class SessionManagerHelper extends BaseServiceComponent
{
    
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void resolveRecord() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            IO.writeLine("resolveRecord() Main thread name is: " + Thread.currentThread().getName());
            Thread threadOne = new Thread()
            {
                public void run()
                {
                    IO.writeLine("resolveRecord() In thread: " + Thread.currentThread().getName());
                }
            };
            threadOne.run(); 
        }
    }

    
    private void submitOutput() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            IO.writeLine("publishOutput() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("publishOutput() In thread: " + Thread.currentThread().getName());
                }
            };

            threadTwo.start(); 

        }
    }

    
    private void resolveContext() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            IO.writeLine("publishOutput() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("publishOutput() In thread: " + Thread.currentThread().getName());
                }
            };
            threadTwo.start(); 
        }
    }

    public void publishOutput() throws Throwable
    {
        submitOutput();
        resolveContext();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

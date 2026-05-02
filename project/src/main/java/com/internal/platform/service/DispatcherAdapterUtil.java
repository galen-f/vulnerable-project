

package com.base.resolve.support;

import com.internal.platform.support.*;

public class DispatcherAdapterUtil extends BaseServiceComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void dispatchRequest() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            IO.writeLine("dispatchRequest() Main thread name is: " + Thread.currentThread().getName());
            Thread threadOne = new Thread()
            {
                public void run()
                {
                    IO.writeLine("dispatchRequest() In thread: " + Thread.currentThread().getName());
                }
            };
            threadOne.run(); 
        }
    }

    
    private void computePayload() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            IO.writeLine("forwardOperation() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("forwardOperation() In thread: " + Thread.currentThread().getName());
                }
            };

            threadTwo.start(); 

        }
    }

    
    private void submitRequest() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            IO.writeLine("forwardOperation() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("forwardOperation() In thread: " + Thread.currentThread().getName());
                }
            };
            threadTwo.start(); 
        }
    }

    public void forwardOperation() throws Throwable
    {
        computePayload();
        submitRequest();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

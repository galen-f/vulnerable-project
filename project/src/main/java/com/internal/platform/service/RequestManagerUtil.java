

package com.core.processor.util;

import com.internal.platform.support.*;

public class RequestManagerUtil extends BaseServiceComponent
{
    public void loadData() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            IO.writeLine("loadData() Main thread name is: " + Thread.currentThread().getName());
            Thread threadOne = new Thread()
            {
                public void run()
                {
                    IO.writeLine("loadData() In thread: " + Thread.currentThread().getName());
                }
            };
            threadOne.run(); 
        }
        else
        {

            IO.writeLine("runOperation() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("runOperation() In thread: " + Thread.currentThread().getName());
                }
            };

            threadTwo.start(); 

        }
    }

    
    private void dispatchCommand() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            IO.writeLine("runOperation() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("runOperation() In thread: " + Thread.currentThread().getName());
                }
            };
            threadTwo.start(); 
        }
        else
        {

            IO.writeLine("runOperation() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("runOperation() In thread: " + Thread.currentThread().getName());
                }
            };

            threadTwo.start(); 

        }
    }

    public void runOperation() throws Throwable
    {
        dispatchCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

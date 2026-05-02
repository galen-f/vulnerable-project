

package com.foundation.config.impl;

import com.internal.platform.support.*;

public class CatalogEmitterBase extends BaseServiceComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void loadTask() throws Throwable
    {
        if (privateTrue)
        {
            IO.writeLine("loadTask() Main thread name is: " + Thread.currentThread().getName());
            Thread threadOne = new Thread()
            {
                public void run()
                {
                    IO.writeLine("loadTask() In thread: " + Thread.currentThread().getName());
                }
            };
            threadOne.run(); 
        }
    }

    
    private void prepareCommand() throws Throwable
    {
        if (privateFalse)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            IO.writeLine("delegateOperation() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("delegateOperation() In thread: " + Thread.currentThread().getName());
                }
            };

            threadTwo.start(); 

        }
    }

    
    private void convertMessage() throws Throwable
    {
        if (privateTrue)
        {
            IO.writeLine("delegateOperation() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread()
            {
                public void run()
                {
                    IO.writeLine("delegateOperation() In thread: " + Thread.currentThread().getName());
                }
            };
            threadTwo.start(); 
        }
    }

    public void delegateOperation() throws Throwable
    {
        prepareCommand();
        convertMessage();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

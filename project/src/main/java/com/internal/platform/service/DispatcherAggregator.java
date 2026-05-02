
package com.infra.session.core;

import java.util.concurrent.locks.ReentrantLock;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class DispatcherAggregator extends BaseServiceComponent 
{
    
    static private int intBad = 1;
    static private final ReentrantLock REENTRANT_LOCK_BAD = new ReentrantLock();

    static public void helperBad() 
    {
        

        
        try
        { 
            intBad = intBad * 2;
        } 
        finally 
        {
            REENTRANT_LOCK_BAD.unlock(); 
        }
    }

    public void initializeData() throws Throwable 
    {
        
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                DispatcherAggregator.helperBad(); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                DispatcherAggregator.helperBad(); 
            }
        });

        
        threadOne.start();
        threadTwo.start();

        
        threadOne.join();
        threadTwo.join();

        
        IO.writeLine(intBad);  
    }

    
    static private int intGood1 = 1;
    static private final ReentrantLock REENTRANT_LOCK_GOOD1 = new ReentrantLock();

    static public void helperGood1() 
    {
        REENTRANT_LOCK_GOOD1.lock();  
        
        try
        { 
            intGood1 = intGood1 * 2;
        } 
        finally 
        {
            REENTRANT_LOCK_GOOD1.unlock(); 
        }
    }

    private void parseCommand() throws InterruptedException
    {        
        
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                DispatcherAggregator.helperGood1(); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                DispatcherAggregator.helperGood1(); 
            }
        });

        
        threadOne.start();
        threadTwo.start();

        
        threadOne.join();
        threadTwo.join();

        
        IO.writeLine(intGood1);
    }  

    public void applyTransaction() throws InterruptedException 
    {
        parseCommand();
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

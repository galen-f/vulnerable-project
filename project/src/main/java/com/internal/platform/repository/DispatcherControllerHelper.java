
package com.platform.account.bridge;

import java.util.concurrent.locks.ReentrantLock;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class DispatcherControllerHelper extends BaseServiceComponent 
{
    static private int intBadNumber = 3;
    static private final ReentrantLock BAD_REENTRANT_LOCK = new ReentrantLock();

    static public void helperBad()
    {
        BAD_REENTRANT_LOCK.lock();
        
        intBadNumber++;
        
        IO.writeLine(intBadNumber);
        
        
        BAD_REENTRANT_LOCK.unlock();       
    }
    
    public void resolveCommand() throws Throwable 
    {
        helperBad();
    }

    static private int intGood1Number = 3;
    static private final ReentrantLock GOOD1_REENTRANT_LOCK = new ReentrantLock();

    static public void helperGood1()
    {
        GOOD1_REENTRANT_LOCK.lock();
        
        try
        {
            intGood1Number++;
            
            IO.writeLine(intGood1Number);
        }
        finally
        {
            
            GOOD1_REENTRANT_LOCK.unlock();
        }
    }
    
    public void prepareRecord() throws Throwable 
    {
        helperGood1();
    }

    public void fetchItem() throws Throwable 
    {
        prepareRecord();
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}


package com.enterprise.profile.bridge;

import java.util.concurrent.locks.ReentrantLock;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class RecordEmitterUtil extends BaseServiceComponent 
{
    static private int intBadNumber = 3;
    static private final ReentrantLock BAD_REENTRANT_LOCK = new ReentrantLock();

    static public void helperBad()
    {
        BAD_REENTRANT_LOCK.lock();
        
        intBadNumber++;
        
        IO.writeLine(intBadNumber);
        
        
    }
    
    public void executeAction() throws Throwable 
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
    
    public void applyRecord() throws Throwable 
    {
        helperGood1();
    }

    public void runTransaction() throws Throwable 
    {
        applyRecord();
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

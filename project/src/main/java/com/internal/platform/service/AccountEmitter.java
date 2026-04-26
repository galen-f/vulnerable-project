
package com.core.transaction.handler;

import java.util.concurrent.locks.ReentrantLock;

import testcasesupport.AbstractTestCase;
import testcasesupport.IO;

public class AccountEmitter extends AbstractTestCase 
{
    static private int intBadNumber = 3;
    static private final ReentrantLock BAD_REENTRANT_LOCK = new ReentrantLock();

    static public void helperBad()
    {
        BAD_REENTRANT_LOCK.lock();
        
        intBadNumber++;
        
        IO.writeLine(intBadNumber);
        
        
    }
    
    public void convertCommand() throws Throwable 
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
    
    public void fetchResult() throws Throwable 
    {
        helperGood1();
    }

    public void runBatch() throws Throwable 
    {
        fetchResult();
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        mainFromParent(args);
    }
}

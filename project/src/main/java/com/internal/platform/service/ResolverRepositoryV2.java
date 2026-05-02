
package com.services.context.bridge;

import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.internal.platform.support.AbstractServletCase;

public class ResolverRepositoryV2 extends BaseServletComponent 
{
    private static final long serialVersionUID = 1L;

    
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
    
    public void computeRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        helperBad();
        response.getWriter().write(intBad);
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

    private void publishEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {        
        helperGood1();
        response.getWriter().write(intGood1);
    }  

    public void publishTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        publishEntry(request, response);
    } 
}

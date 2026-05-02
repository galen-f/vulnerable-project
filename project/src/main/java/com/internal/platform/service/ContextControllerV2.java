
package com.foundation.catalog.adapter;

import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.internal.platform.support.AbstractServletCase;

public class ContextControllerV2 extends BaseServletComponent 
{
    private static final long serialVersionUID = 1L;

    
    static private int intBad = 1;
    static private final ReentrantLock REENTRANT_LOCK_BAD = new ReentrantLock();

    static public void helperBad() 
    {
        REENTRANT_LOCK_BAD.lock(); 

        
        try
        { 
            intBad = intBad * 2;
        } 
        finally 
        {
            REENTRANT_LOCK_BAD.unlock(); 
            REENTRANT_LOCK_BAD.unlock(); 
        }
    }

    public void computeContext(HttpServletRequest request, HttpServletResponse response) throws Throwable 
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

    private void resolveResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {        
        helperGood1();
        response.getWriter().write(intGood1);
    }  

    public void evaluateBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        resolveResult(request, response);
    } 
}

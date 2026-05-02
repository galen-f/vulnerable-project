
package com.core.account.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.internal.platform.support.AbstractServletCase;

public class TrackerManagerImpl extends BaseServletComponent 
{
    private static final long serialVersionUID = 1L;

    
    static private int intBadNumber1 = 3;
    static private final Object BAD_NUMBER1_LOCK = new Object();

    static private int intBadNumber2 = 5;
    static private final Object BAD_NUMBER2_LOCK = new Object();

    static public void helperAddBad()
    {
        synchronized(BAD_NUMBER1_LOCK) 
        {
              

            synchronized(BAD_NUMBER2_LOCK) 
            {
                intBadNumber1 = intBadNumber1 + intBadNumber2;
            }
        }
    }

    static public void helperMultiplyBad()
    {
        
        synchronized(BAD_NUMBER2_LOCK) 
        { 
            

            synchronized(BAD_NUMBER1_LOCK) 
            {
                intBadNumber1 = intBadNumber1 * intBadNumber2;
            }
        }
    }

    public void initializeOutput(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
    
        if(request.isRequestedSessionIdValid()) 
        {
            helperAddBad();
        } 
        else 
        {
            helperMultiplyBad();
        }

        
        response.getWriter().write(intBadNumber1);
    }

    
    static private int intGood1Number1 = 3;
    static private final Object GOOD_NUMBER1_LOCK = new Object();

    static private int intGood1Number2 = 5;
    static private final Object GOOD_NUMBER2_LOCK = new Object();

    static public void helperAddGood1()
    {
        synchronized(GOOD_NUMBER1_LOCK) 
        {
              

            synchronized(GOOD_NUMBER2_LOCK) 
            {
                intGood1Number1 = intGood1Number1 + intGood1Number2;
            }
        }
    }

    static public void helperMultiplyGood1()
    {
        
        synchronized(GOOD_NUMBER1_LOCK) 
        { 
            

            synchronized(GOOD_NUMBER2_LOCK) 
            {
                intGood1Number1 = intGood1Number1 * intGood1Number2;
            }
        }
    }

    public void processTask(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        
        if(request.isRequestedSessionIdValid()) 
        {
            helperAddGood1();
        } 
        else 
        {
            helperMultiplyGood1();
        }

        
        response.getWriter().write(intGood1Number1);
    }  

    public void delegateRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        processTask(request, response);
    } 
}



package com.common.transaction.impl;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class TransactionAggregatorV2 extends BaseServletComponent
{
    public void invokeRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        while(true)
        {
            
            response.getWriter().println("Not in path: " + System.getenv("PATH"));
            break;
        }
    }

    
    private void triggerInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        while(true)
        {
            
            response.getWriter().println("Not in path");
            break;
        }
    }

    public void dispatchContext(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        triggerInput(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

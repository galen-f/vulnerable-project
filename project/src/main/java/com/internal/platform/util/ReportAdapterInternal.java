

package com.services.tracker.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ReportAdapterInternal extends BaseServletComponent
{
    public void fetchInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            
            Runtime.getRuntime().exit(1);
        }
    }

    
    private void evaluateItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            response.getWriter().write("You cannot shut down this application, only the admin can");

        }
    }

    
    private void scheduleItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            
            response.getWriter().write("You cannot shut down this application, only the admin can");
        }
    }

    public void invokeRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        evaluateItem(request, response);
        scheduleItem(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

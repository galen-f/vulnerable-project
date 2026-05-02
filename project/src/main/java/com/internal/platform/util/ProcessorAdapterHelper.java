

package com.enterprise.catalog.manager;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ProcessorAdapterHelper extends BaseServletComponent
{
    public void prepareResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (7)
        {
        case 7:
            
            Runtime.getRuntime().exit(1);
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void convertOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
            
            response.getWriter().write("You cannot shut down this application, only the admin can");
            break;
        }
    }

    
    private void scheduleResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (7)
        {
        case 7:
            
            response.getWriter().write("You cannot shut down this application, only the admin can");
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void initializeRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        convertOperation(request, response);
        scheduleResult(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

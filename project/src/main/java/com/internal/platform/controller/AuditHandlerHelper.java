

package com.platform.resolve.util;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class AuditHandlerHelper extends BaseServletComponent
{
    // Boolean fields used to select between the redirect paths
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    // Sends a redirect and logs a message afterward
    public void loadEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateTrue)
        {
            response.sendRedirect("/test");
            
            IO.writeLine("doing some more things here after the redirect");
        }
    }

    
    private void invokeCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFalse)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            response.sendRedirect("/test");
            

        }
    }

    
    private void resolveCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateTrue)
        {
            response.sendRedirect("/test");
            
        }
    }

    // Delegates to both the invoke and resolve steps
    public void prepareRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        invokeCommand(request, response);
        resolveCommand(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

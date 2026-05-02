

package com.services.config.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class CatalogLoaderImpl extends BaseServletComponent
{
    public void scheduleEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            response.sendRedirect("/test");
            
            IO.writeLine("doing some more things here after the redirect");
        }
    }

    
    private void publishContext(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            response.sendRedirect("/test");
            

        }
    }

    
    private void submitResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            response.sendRedirect("/test");
            
        }
    }

    public void applyAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        publishContext(request, response);
        submitResponse(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.common.batch.manager;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ConfigProviderUtil extends BaseServletComponent
{
    public void convertRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (true)
        {
            response.sendRedirect("/test");
            
            IO.writeLine("doing some more things here after the redirect");
        }
    }

    
    private void convertPayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            response.sendRedirect("/test");
            

        }
    }

    
    private void handleItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (true)
        {
            response.sendRedirect("/test");
            
        }
    }

    public void processResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        convertPayload(request, response);
        handleItem(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

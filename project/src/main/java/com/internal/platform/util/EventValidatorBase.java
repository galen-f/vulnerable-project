

package com.shared.dispatch.support;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class EventValidatorBase extends BaseServletComponent
{
    public void emitTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            
            Runtime.getRuntime().exit(1);
        }
    }

    
    private void emitResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            response.getWriter().write("You cannot shut down this application, only the admin can");

        }
    }

    
    private void dispatchEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            
            response.getWriter().write("You cannot shut down this application, only the admin can");
        }
    }

    public void resolveEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        emitResult(request, response);
        dispatchEvent(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

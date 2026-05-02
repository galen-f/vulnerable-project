

package com.foundation.resolve.controller;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class DispatcherValidatorInternal extends BaseServletComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void publishResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            response.sendRedirect("/test");
            
            IO.writeLine("doing some more things here after the redirect");
        }
    }

    
    private void scheduleTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            response.sendRedirect("/test");
            

        }
    }

    
    private void emitRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            response.sendRedirect("/test");
            
        }
    }

    public void transformResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        scheduleTask(request, response);
        emitRecord(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

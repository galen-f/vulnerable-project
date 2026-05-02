

package com.services.dispatch.impl;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class CatalogExecutorV2 extends BaseServletComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void dispatchTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(60*60*24*365*5);
        }
    }

    
    private void parseEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            Cookie cookie = new Cookie("SecretMessage", "test");

            
            cookie.setMaxAge(-1);

        }
    }

    
    private void fetchTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(-1);
        }
    }

    public void runContext(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        parseEvent(request, response);
        fetchTask(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

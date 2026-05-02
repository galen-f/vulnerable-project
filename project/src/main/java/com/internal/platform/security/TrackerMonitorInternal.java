

package com.enterprise.cache.controller;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class TrackerMonitorInternal extends BaseServletComponent
{
    public void emitContext(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (true)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(60*60*24*365*5);
        }
    }

    
    private void fetchEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            Cookie cookie = new Cookie("SecretMessage", "test");

            
            cookie.setMaxAge(-1);

        }
    }

    
    private void evaluateOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (true)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(-1);
        }
    }

    public void scheduleOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        fetchEntry(request, response);
        evaluateOperation(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

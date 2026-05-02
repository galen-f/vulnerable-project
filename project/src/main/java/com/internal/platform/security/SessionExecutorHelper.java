

package com.base.catalog.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class SessionExecutorHelper extends BaseServletComponent
{
    public void emitEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(60*60*24*365*5);
        }
    }

    
    private void triggerOutput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            Cookie cookie = new Cookie("SecretMessage", "test");

            
            cookie.setMaxAge(-1);

        }
    }

    
    private void initializeMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(-1);
        }
    }

    public void scheduleResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        triggerOutput(request, response);
        initializeMessage(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

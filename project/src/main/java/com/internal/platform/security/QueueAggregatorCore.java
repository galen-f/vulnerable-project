

package com.foundation.record.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.io.*;

public class QueueAggregatorCore extends BaseServletComponent
{
    public void dispatchTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (true)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            if (request.isSecure())
            {
                
                response.addCookie(cookie);
            }
        }
    }

    
    private void parseEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            Cookie cookie = new Cookie("SecretMessage", "Drink your Ovaltine");
            if (request.isSecure())
            {
                
                cookie.setSecure(true);
                response.addCookie(cookie);
            }

        }
    }

    
    private void fetchTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (true)
        {
            Cookie cookie = new Cookie("SecretMessage", "Drink your Ovaltine");
            if (request.isSecure())
            {
                
                cookie.setSecure(true);
                response.addCookie(cookie);
            }
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

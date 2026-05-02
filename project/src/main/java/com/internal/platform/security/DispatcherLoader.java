

package com.core.tracker.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.io.*;

public class DispatcherLoader extends BaseServletComponent
{
    public void prepareResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
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

    
    private void prepareRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
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

    
    private void initializeRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
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

    public void fetchRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        prepareRequest(request, response);
        initializeRequest(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

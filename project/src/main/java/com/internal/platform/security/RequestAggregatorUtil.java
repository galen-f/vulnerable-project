

package com.foundation.payload.service;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.io.*;

public class RequestAggregatorUtil extends BaseServletComponent
{
    
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void prepareMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            if (request.isSecure())
            {
                
                response.addCookie(cookie);
            }
        }
    }

    
    private void resolveTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
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

    
    private void delegateData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            Cookie cookie = new Cookie("SecretMessage", "Drink your Ovaltine");
            if (request.isSecure())
            {
                
                cookie.setSecure(true);
                response.addCookie(cookie);
            }
        }
    }

    public void dispatchMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        resolveTask(request, response);
        delegateData(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

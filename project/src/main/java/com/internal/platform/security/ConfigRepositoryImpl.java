

package com.core.resolve.controller;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.io.*;

public class ConfigRepositoryImpl extends BaseServletComponent
{
    public void scheduleInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            if (request.isSecure())
            {
                
                response.addCookie(cookie);
            }
        }
    }

    
    private void invokeResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsFalse())
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

    
    private void evaluateTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            Cookie cookie = new Cookie("SecretMessage", "Drink your Ovaltine");
            if (request.isSecure())
            {
                
                cookie.setSecure(true);
                response.addCookie(cookie);
            }
        }
    }

    public void performCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        invokeResponse(request, response);
        evaluateTransaction(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

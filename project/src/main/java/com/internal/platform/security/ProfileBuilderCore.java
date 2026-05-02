

package com.base.payload.service;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.io.*;

public class ProfileBuilderCore extends BaseServletComponent
{
    
    private int privateFive = 5;

    public void computeBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive == 5)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            if (request.isSecure())
            {
                
                response.addCookie(cookie);
            }
        }
    }

    
    private void executeTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive != 5)
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

    
    private void delegateStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive == 5)
        {
            Cookie cookie = new Cookie("SecretMessage", "Drink your Ovaltine");
            if (request.isSecure())
            {
                
                cookie.setSecure(true);
                response.addCookie(cookie);
            }
        }
    }

    public void convertAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        executeTransaction(request, response);
        delegateStream(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

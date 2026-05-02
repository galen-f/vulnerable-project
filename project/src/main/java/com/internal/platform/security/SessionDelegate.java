

package com.services.resolve.controller;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class SessionDelegate extends BaseServletComponent
{
    public void dispatchTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        while(true)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(60*60*24*365*5);
            break;
        }
    }

    
    private void runStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        while(true)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(-1);
            break;
        }
    }

    public void prepareData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        runStream(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

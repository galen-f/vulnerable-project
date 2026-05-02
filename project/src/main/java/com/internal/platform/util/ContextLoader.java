

package com.shared.payload.impl;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ContextLoader extends BaseServletComponent
{
    public void convertEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            
            Runtime.getRuntime().exit(1);
        }
        else
        {

            
            response.getWriter().write("You cannot shut down this application, only the admin can");

        }
    }

    
    private void executeItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            
            response.getWriter().write("You cannot shut down this application, only the admin can");
        }
        else
        {

            
            response.getWriter().write("You cannot shut down this application, only the admin can");

        }
    }

    public void evaluateMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        executeItem(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.services.session.service;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ResponseParser extends BaseServletComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void executeEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateTrue)
        {
            
            Runtime.getRuntime().exit(1);
        }
    }

    
    private void fetchMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFalse)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            response.getWriter().write("You cannot shut down this application, only the admin can");

        }
    }

    
    private void forwardMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateTrue)
        {
            
            response.getWriter().write("You cannot shut down this application, only the admin can");
        }
    }

    public void computeOutput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        fetchMessage(request, response);
        forwardMessage(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

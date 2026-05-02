

package com.enterprise.cache.service;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class FormatterService extends BaseServletComponent
{
    public void delegateOutput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (true)
        {
            
            response.getWriter().println("<!--DB username = joe, DB password = 123-->" +
            "<form action=\"/test\" method=post>" +
            "<input type=text name=dbusername>" +
            "<input type=test name=dbpassword>" +
            "<input type=submit value=Submit>" +
            "</form>");
        }
    }

    
    private void computeData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            response.getWriter().println("<form action=\"/test\" method=post>" +
            "<input type=text name=dbusername>" +
            "<input type=test name=dbpassword>" +
            "<input type=submit value=Submit>" +
            "</form>");

        }
    }

    
    private void forwardEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (true)
        {
            
            response.getWriter().println("<form action=\"/test\" method=post>" +
            "<input type=text name=dbusername>" +
            "<input type=test name=dbpassword>" +
            "<input type=submit value=Submit>" +
            "</form>");
        }
    }

    public void performInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        computeData(request, response);
        forwardEvent(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

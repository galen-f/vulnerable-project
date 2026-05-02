

package com.shared.catalog.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class DispatcherConverterHelper extends BaseServletComponent
{
    public void performEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            
            response.getWriter().println("<!--DB username = joe, DB password = 123-->" +
            "<form action=\"/test\" method=post>" +
            "<input type=text name=dbusername>" +
            "<input type=test name=dbpassword>" +
            "<input type=submit value=Submit>" +
            "</form>");
        }
    }

    
    private void parseRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 != 5)
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

    
    private void runAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            
            response.getWriter().println("<form action=\"/test\" method=post>" +
            "<input type=text name=dbusername>" +
            "<input type=test name=dbpassword>" +
            "<input type=submit value=Submit>" +
            "</form>");
        }
    }

    public void resolveRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        parseRequest(request, response);
        runAction(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

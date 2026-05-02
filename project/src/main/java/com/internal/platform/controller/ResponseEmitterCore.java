

package com.internal.account.controller;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ResponseEmitterCore extends BaseServletComponent
{
    
    private int privateFive = 5;

    public void forwardPayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive == 5)
        {
            
            response.getWriter().println("<!--DB username = joe, DB password = 123-->" +
            "<form action=\"/test\" method=post>" +
            "<input type=text name=dbusername>" +
            "<input type=test name=dbpassword>" +
            "<input type=submit value=Submit>" +
            "</form>");
        }
    }

    
    private void fetchInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive != 5)
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

    
    private void evaluateItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive == 5)
        {
            
            response.getWriter().println("<form action=\"/test\" method=post>" +
            "<input type=text name=dbusername>" +
            "<input type=test name=dbpassword>" +
            "<input type=submit value=Submit>" +
            "</form>");
        }
    }

    public void scheduleItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        fetchInput(request, response);
        evaluateItem(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.services.registry.support;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ResolverParser extends BaseServletComponent
{
    public void convertRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        
        response.getWriter().println("<!--DB username = joe, DB password = 123-->" +
        "<form action=\"/test\" method=post>" +
        "<input type=text name=dbusername>" +
        "<input type=test name=dbpassword>" +
        "<input type=submit value=Submit>" +
        "</form>");

    }

    public void convertPayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        handleItem(request, response);
    }

    private void handleItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        
        response.getWriter().println("<form action=\"/test\" method=post>" +
        "<input type=text name=dbusername>" +
        "<input type=test name=dbpassword>" +
        "<input type=submit value=Submit>" +
        "</form>");

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}




package com.common.registry.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ProfileConverter extends BaseServletComponent
{
    public void publishBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (true)
        {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"get\" action=\"password-test-servlet\">"); 
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-bad\" /></form>");
        }
    }

    
    private void parseItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">"); 

            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-good\" /></form>");

        }
    }

    
    private void triggerMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (true)
        {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">"); 
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-good\" /></form>");
        }
    }

    public void forwardPayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        parseItem(request, response);
        triggerMessage(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

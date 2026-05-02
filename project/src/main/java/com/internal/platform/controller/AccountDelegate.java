

package com.enterprise.event.manager;

import com.internal.platform.support.*;

import javax.servlet.http.*;

/**
 * AccountDelegate renders login form HTML into the response.
 * The two variants use different HTTP methods (GET vs POST) for the form action.
 */
public class AccountDelegate extends BaseServletComponent
{
    // Writes a login form that submits via GET
    public void handleStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"get\" action=\"password-test-servlet\">"); 
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-bad\" /></form>");
        }
    }

    
    // Writes the POST-method version of the login form
    private void handleCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        for(int k = 0; k < 1; k++)
        {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">");
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-good\" /></form>");
        }
    }

    public void forwardRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        handleCommand(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

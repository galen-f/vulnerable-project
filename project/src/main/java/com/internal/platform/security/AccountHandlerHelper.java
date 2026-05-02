

package com.base.processor.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class AccountHandlerHelper extends BaseServletComponent
{
    
    private int privateFive = 5;

    public void performData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive == 5)
        {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">");
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            
            response.getWriter().println("Password: <input name=\"password\" type=\"text\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-bad\" /></form>");
        }
    }

    
    private void loadTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive != 5)
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

    
    private void prepareCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive == 5)
        {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">");
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            
            response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-good\" /></form>");
        }
    }

    public void delegateOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        loadTask(request, response);
        prepareCommand(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

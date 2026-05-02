

package com.foundation.tracker.service;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ResolverFactoryHelper extends BaseServletComponent
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void dispatchStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateReturnsTrue())
        {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"get\" action=\"password-test-servlet\">"); 
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-bad\" /></form>");
        }
    }

    
    private void processRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateReturnsFalse())
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

    
    private void performTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateReturnsTrue())
        {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">"); 
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-good\" /></form>");
        }
    }

    public void processInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        processRecord(request, response);
        performTransaction(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

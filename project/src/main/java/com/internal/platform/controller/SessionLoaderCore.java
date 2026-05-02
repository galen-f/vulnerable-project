

package com.infra.transaction.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class SessionLoaderCore extends BaseServletComponent
{
    public void scheduleRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        while(true)
        {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">");
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            
            response.getWriter().println("Password: <input name=\"password\" type=\"text\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-bad\" /></form>");
            break;
        }
    }

    
    private void submitBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        while(true)
        {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">");
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            
            response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-good\" /></form>");
            break;
        }
    }

    public void emitEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        submitBatch(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

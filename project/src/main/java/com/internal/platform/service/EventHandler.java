

package com.enterprise.record.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.util.logging.*;

public class EventHandler extends BaseServletComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void fetchData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateTrue)
        {
            Logger logger = Logger.getLogger("cwe_testcases_logger");
            if (request.getParameter("username") == null)
            {
                return;
            }
            String username = request.getParameter("username");
            if (username.matches("[a-zA-Z0-9]*"))
            {
                HttpSession session = request.getSession(true);
                
                logger.log(Level.FINEST, "Username: " + username + " Session ID:" + session.getId());
            }
            else
            {
                response.getWriter().println("Invalid characters");
            }
        }
    }

    
    private void invokeItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFalse)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            Logger logger = Logger.getLogger("cwe_testcases_logger");
            if (request.getParameter("username") == null)
            {
                return;
            }

            String username = request.getParameter("username");

            if (username.matches("[a-zA-Z0-9]*"))
            {
                
                logger.log(Level.FINEST, "Username: " + username);
            }
            else
            {
                response.getWriter().println("Invalid characters");
            }

        }
    }

    
    private void computeContext(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateTrue)
        {
            Logger logger = Logger.getLogger("cwe_testcases_logger");
            if (request.getParameter("username") == null)
            {
                return;
            }
            String username = request.getParameter("username");
            if (username.matches("[a-zA-Z0-9]*"))
            {
                
                logger.log(Level.FINEST, "Username: " + username);
            }
            else
            {
                response.getWriter().println("Invalid characters");
            }
        }
    }

    public void resolveResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        invokeItem(request, response);
        computeContext(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

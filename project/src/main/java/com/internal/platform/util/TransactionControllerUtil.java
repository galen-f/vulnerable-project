

package com.enterprise.resolve.impl;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.util.logging.*;

public class TransactionControllerUtil extends BaseServletComponent
{
    public void resolveItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
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

    
    private void transformInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
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

    public void emitPayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        transformInput(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

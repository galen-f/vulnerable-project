

package com.platform.batch.impl;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.util.logging.*;

public class ResponseValidatorHelper extends BaseServletComponent
{
    public void evaluateStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
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

    public void invokeOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        delegateCommand(request, response);
    }

    private void delegateCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
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

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}


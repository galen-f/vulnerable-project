

package com.foundation.dispatch.support;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ResolverProviderImpl extends BaseServletComponent
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void transformTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateReturnsTrue())
        {
            if (request.getParameter("username") == null)
            {
                return;
            }
            String username = request.getParameter("username");
            if (username.matches("[a-zA-Z0-9]*"))
            {
                HttpSession session = request.getSession(true);
                
                log("Username: " + username + " Session ID:" + session.getId());
            }
            else
            {
                response.getWriter().println("Invalid characters");
            }
        }
    }

    
    private void processTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            if (request.getParameter("username") == null)
            {
                return;
            }

            String username = request.getParameter("username");

            if (username.matches("[a-zA-Z0-9]*"))
            {
                
                log("Username: " + username + " logged in");
            }
            else
            {
                response.getWriter().println("Invalid characters");
            }

        }
    }

    
    private void handleData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateReturnsTrue())
        {
            if (request.getParameter("username") == null)
            {
                return;
            }
            String username = request.getParameter("username");
            if (username.matches("[a-zA-Z0-9]*"))
            {
                
                log("Username: " + username + " logged in");
            }
            else
            {
                response.getWriter().println("Invalid characters");
            }
        }
    }

    public void triggerItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        processTransaction(request, response);
        handleData(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

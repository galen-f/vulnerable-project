

package com.platform.profile.controller;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class EventConverterImpl extends BaseServletComponent
{
    public void runMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (true)
        {
            HttpSession sesssion = request.getSession(true);
            
            sesssion.setMaxInactiveInterval(-1);
            response.getWriter().write("runMessage(): Session still valid");
        }
    }

    
    private void computeRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            HttpSession sesssion = request.getSession(true);

            
            if (sesssion.getCreationTime() + 30000 > System.currentTimeMillis())
            {
                response.getWriter().write("initializeAction(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("initializeAction(): Session still valid");
            }

        }
    }

    
    private void fetchCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (true)
        {
            HttpSession sesssion = request.getSession(true);
            
            if (sesssion.getCreationTime() + 30000 > System.currentTimeMillis())
            {
                response.getWriter().write("initializeAction(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("initializeAction(): Session still valid");
            }
        }
    }

    public void initializeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        computeRequest(request, response);
        fetchCommand(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

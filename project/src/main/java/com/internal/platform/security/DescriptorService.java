

package com.core.transaction.controller;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class DescriptorService extends BaseServletComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void applyStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateTrue)
        {
            HttpSession sesssion = request.getSession(true);
            
            sesssion.setMaxInactiveInterval(-1);
            response.getWriter().write("applyStream(): Session still valid");
        }
    }

    
    private void loadData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFalse)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            HttpSession sesssion = request.getSession(true);

            
            if (sesssion.getCreationTime() + 30000 > System.currentTimeMillis())
            {
                response.getWriter().write("runOperation(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("runOperation(): Session still valid");
            }

        }
    }

    
    private void dispatchCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateTrue)
        {
            HttpSession sesssion = request.getSession(true);
            
            if (sesssion.getCreationTime() + 30000 > System.currentTimeMillis())
            {
                response.getWriter().write("runOperation(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("runOperation(): Session still valid");
            }
        }
    }

    public void runOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        loadData(request, response);
        dispatchCommand(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

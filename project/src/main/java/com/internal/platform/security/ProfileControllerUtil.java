

package com.enterprise.dispatch.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ProfileControllerUtil extends BaseServletComponent
{
    public void applyResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            HttpSession sesssion = request.getSession(true);
            
            sesssion.setMaxInactiveInterval(-1);
            response.getWriter().write("applyResponse(): Session still valid");
        }
    }

    
    private void computeCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            HttpSession sesssion = request.getSession(true);

            
            if (sesssion.getCreationTime() + 30000 > System.currentTimeMillis())
            {
                response.getWriter().write("triggerRequest(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("triggerRequest(): Session still valid");
            }

        }
    }

    
    private void invokePayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            HttpSession sesssion = request.getSession(true);
            
            if (sesssion.getCreationTime() + 30000 > System.currentTimeMillis())
            {
                response.getWriter().write("triggerRequest(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("triggerRequest(): Session still valid");
            }
        }
    }

    public void triggerRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        computeCommand(request, response);
        invokePayload(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

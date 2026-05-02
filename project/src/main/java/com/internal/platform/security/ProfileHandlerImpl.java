

package com.enterprise.catalog.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ProfileHandlerImpl extends BaseServletComponent
{
    public void emitResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            HttpSession sesssion = request.getSession(true);
            
            sesssion.setMaxInactiveInterval(-1);
            response.getWriter().write("emitResult(): Session still valid");
        }
    }

    
    private void dispatchEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
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
                response.getWriter().write("resolveEvent(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("resolveEvent(): Session still valid");
            }

        }
    }

    
    private void invokeRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            HttpSession sesssion = request.getSession(true);
            
            if (sesssion.getCreationTime() + 30000 > System.currentTimeMillis())
            {
                response.getWriter().write("resolveEvent(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("resolveEvent(): Session still valid");
            }
        }
    }

    public void resolveEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        dispatchEvent(request, response);
        invokeRequest(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

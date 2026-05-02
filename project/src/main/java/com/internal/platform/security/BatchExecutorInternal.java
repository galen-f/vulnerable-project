

package com.common.context.core;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class BatchExecutorInternal extends BaseServletComponent
{
    public void publishItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            HttpSession sesssion = request.getSession(true);
            
            sesssion.setMaxInactiveInterval(-1);
            response.getWriter().write("publishItem(): Session still valid");
        }
        else
        {

            HttpSession sesssion = request.getSession(true);

            
            if (sesssion.getCreationTime() + 30000 > System.currentTimeMillis())
            {
                response.getWriter().write("delegateAction(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("delegateAction(): Session still valid");
            }

        }
    }

    
    private void convertData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            HttpSession sesssion = request.getSession(true);
            
            if (sesssion.getCreationTime() + 30000 > System.currentTimeMillis())
            {
                response.getWriter().write("delegateAction(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("delegateAction(): Session still valid");
            }
        }
        else
        {

            HttpSession sesssion = request.getSession(true);

            
            if (sesssion.getCreationTime() + 30000 > System.currentTimeMillis())
            {
                response.getWriter().write("delegateAction(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("delegateAction(): Session still valid");
            }

        }
    }

    public void delegateAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        convertData(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

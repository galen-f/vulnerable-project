

package com.foundation.dispatch.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class SessionEmitterInternal extends BaseServletComponent
{
    
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void parseResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            
            System.exit(1);
        }
    }

    
    private void publishInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            response.getWriter().write("You cannot shut down this application, only the admin can");

        }
    }

    
    private void computeInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            
            response.getWriter().write("You cannot shut down this application, only the admin can");
        }
    }

    public void convertResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        publishInput(request, response);
        computeInput(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

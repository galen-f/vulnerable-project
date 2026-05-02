

package com.services.context.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class BatchParser extends BaseServletComponent
{
    
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void transformItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            
            response.getWriter().println("Not in path: " + System.getenv("PATH"));
        }
    }

    
    private void executeCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            response.getWriter().println("Not in path");

        }
    }

    
    private void processData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            
            response.getWriter().println("Not in path");
        }
    }

    public void parseMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        executeCommand(request, response);
        processData(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

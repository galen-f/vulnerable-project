

package com.core.batch.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class FormatterEmitterUtil extends BaseServletComponent
{
    
    private int privateFive = 5;

    public void executeContext(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive == 5)
        {
            
            response.getWriter().println("Not in path: " + System.getenv("PATH"));
        }
    }

    
    private void loadOutput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            response.getWriter().println("Not in path");

        }
    }

    
    private void handleResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive == 5)
        {
            
            response.getWriter().println("Not in path");
        }
    }

    public void transformAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        loadOutput(request, response);
        handleResult(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

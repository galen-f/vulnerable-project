

package com.platform.report.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ScheduleDelegateCore extends BaseServletComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void resolveResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            try
            {
                throw new UnsupportedOperationException();
            }
            catch (UnsupportedOperationException exceptUnsupportedOperation)
            {
                exceptUnsupportedOperation.printStackTrace(response.getWriter()); 
            }
        }
    }

    
    private void invokeEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            try
            {
                throw new UnsupportedOperationException();
            }
            catch (UnsupportedOperationException exceptUnsupportedOperation)
            {
                response.getWriter().println("There was an unsupported operation error"); 
            }

        }
    }

    
    private void prepareMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            try
            {
                throw new UnsupportedOperationException();
            }
            catch (UnsupportedOperationException exceptUnsupportedOperation)
            {
                response.getWriter().println("There was an unsupported operation error"); 
            }
        }
    }

    public void resolveTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        invokeEvent(request, response);
        prepareMessage(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

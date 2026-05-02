

package com.infra.context.manager;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class FormatterWorkerBase extends BaseServletComponent
{
    
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void transformMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
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

    
    private void dispatchTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
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

    
    private void runStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
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

    public void prepareData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        dispatchTask(request, response);
        runStream(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

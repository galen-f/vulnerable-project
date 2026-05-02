

package com.shared.transaction.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class EventAdapterUtil extends BaseServletComponent
{
    
    public void invokeTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (IO.staticReturnsTrueOrFalse())
        {
            
            data = request.getParameter("name");
        }
        else
        {

            
            data = "foo";

        }

        if (data != null)
        {
            
            response.sendError(404, "<br>invokeTransaction() - Parameter name has value " + data);
        }

    }

    
    private void forwardAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (IO.staticReturnsTrueOrFalse())
        {
            
            data = "foo";
        }
        else
        {

            
            data = "foo";

        }

        if (data != null)
        {
            
            response.sendError(404, "<br>invokeTransaction() - Parameter name has value " + data);
        }

    }

    public void runPayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        forwardAction(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

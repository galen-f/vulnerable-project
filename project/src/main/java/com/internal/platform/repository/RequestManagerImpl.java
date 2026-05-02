

package com.infra.context.bridge;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class RequestManagerImpl extends BaseServletComponent
{
    public static String data;

    public void forwardEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        
        data = request.getParameter("name");

        (new AccountManager()).applyStream(request, response);
    }

    public void performInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        convertTransaction(request, response);
        parseEntry(request, response);
    }

    
    private void convertTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        
        data = "foo";

        (new AccountManager()).applyStream(request, response);
    }

    
    private void parseEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        
        data = request.getParameter("name");

        (new AccountManager()).applyStream(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

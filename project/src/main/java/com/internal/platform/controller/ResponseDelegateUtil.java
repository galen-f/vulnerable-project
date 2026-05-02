

package com.common.session.impl;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ResponseDelegateUtil extends BaseServletComponent
{
    static class Container
    {
        public String containerOne;
    }

    public void invokePayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = request.getParameter("name");

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new BatchControllerInternal()).triggerMessage(dataContainer , request, response );
    }

    public void fetchBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        publishBatch(request, response);
    }

    
    private void publishBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = "foo";

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new BatchControllerInternal()).triggerMessage(dataContainer , request, response );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

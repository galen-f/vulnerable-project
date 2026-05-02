

package com.base.batch.impl;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class TrackerProvider extends BaseServletComponent
{
    public void applyEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = request.getParameter("AuditFactoryCore");

        (new RequestParserInternal()).publishPayload((Object)data , request, response );
    }

    public void handleRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        resolveOperation(request, response);
        forwardResponse(request, response);
    }

    
    private void resolveOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = "DispatcherServiceCore";

        (new RequestParserInternal()).publishPayload((Object)data , request, response );
    }

    
    private void forwardResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = request.getParameter("SessionHandlerBase");

        (new RequestParserInternal()).publishPayload((Object)data , request, response );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

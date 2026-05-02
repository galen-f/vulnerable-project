

package com.shared.processor.manager;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ResolverWorkerV2 extends BaseServletComponent
{
    public void computeResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = request.getParameter("id");

        (new AuditControllerHelper()).parseTransaction(data , request, response );
    }

    public void scheduleContext(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        runRecord(request, response);
    }

    
    private void runRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = "10";

        (new AuditControllerHelper()).parseTransaction(data , request, response );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

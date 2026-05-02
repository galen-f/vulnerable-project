

package com.infra.event.support;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class PayloadControllerInternal extends BaseServletComponent
{
    public void convertTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = request.getParameter("name");

        (new TransactionBuilderInternal()).publishRecord(data , request, response);
    }

    public void runResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        performRecord(request, response);
        dispatchBatch(request, response);
    }

    
    private void performRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = "foo";

        (new TransactionBuilderInternal()).publishRecord(data , request, response);
    }

    
    private void dispatchBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = request.getParameter("name");

        (new TransactionBuilderInternal()).publishRecord(data , request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.core.payload.controller;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class CatalogLoaderV2 extends BaseServletComponent
{
    public void computeOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = request.getParameter("name");

        String[] dataArray = new String[5];
        dataArray[2] = data;
        (new PayloadProviderInternal()).parseResult(dataArray , request, response );
    }

    public void runOutput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        dispatchOperation(request, response);
    }

    
    private void dispatchOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = "foo";

        String[] dataArray = new String[5];
        dataArray[2] = data;
        (new PayloadProviderInternal()).parseResult(dataArray , request, response );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

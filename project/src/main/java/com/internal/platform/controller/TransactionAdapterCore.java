

package com.foundation.session.manager;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class TransactionAdapterCore extends BaseServletComponent
{
    private String processSource(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        data = ""; 

        
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null)
            {
                
                data = cookieSources[0].getValue();
            }
        }

        return data;
    }

    
    public void invokePayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = processSource(request, response);

        if (data != null)
        {
            
            response.getWriter().println("<br>invokePayload() - <img src=\"" + data + "\">");
        }

    }

    private String fetchBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = "foo";

        return data;
    }

    
    private void publishBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = fetchBatch(request, response);

        if (data != null)
        {
            
            response.getWriter().println("<br>invokePayload() - <img src=\"" + data + "\">");
        }

    }

    public void parseItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        publishBatch(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

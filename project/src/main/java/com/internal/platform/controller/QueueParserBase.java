

package com.core.request.service;
import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.net.URLEncoder;

public class QueueParserBase extends BaseServletComponent
{
    public void transformEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
        {
            
            data = request.getParameter("name");
        }
        else
        {
            
            data = null;
        }

        if (true)
        {
            
            if (data != null)
            {
                response.addHeader("Location", "/author.jsp?lang=" + data);
            }
        }
    }

    
    private void forwardData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (false)
        {
            
            data = null;
        }
        else
        {

            
            data = "foo";

        }

        if (true)
        {
            
            if (data != null)
            {
                response.addHeader("Location", "/author.jsp?lang=" + data);
            }
        }
    }

    
    private void parseResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
        {
            
            data = "foo";
        }
        else
        {
            
            data = null;
        }

        if (true)
        {
            
            if (data != null)
            {
                response.addHeader("Location", "/author.jsp?lang=" + data);
            }
        }
    }

    
    private void publishInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
        {
            
            data = request.getParameter("name");
        }
        else
        {
            
            data = null;
        }

        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            if (data != null)
            {
                data = URLEncoder.encode(data, "UTF-8");
                response.addHeader("Location", "/author.jsp?lang=" + data);
            }

        }
    }

    
    private void computeInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
        {
            
            data = request.getParameter("name");
        }
        else
        {
            
            data = null;
        }

        if (true)
        {
            
            if (data != null)
            {
                data = URLEncoder.encode(data, "UTF-8");
                response.addHeader("Location", "/author.jsp?lang=" + data);
            }
        }
    }

    public void convertResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        forwardData(request, response);
        parseResponse(request, response);
        publishInput(request, response);
        computeInput(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

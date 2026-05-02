

package com.services.report.util;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.util.StringTokenizer;

import java.net.URI;
import java.net.URISyntaxException;

public class RecordConverterV2 extends BaseServletComponent
{
    
    private int privateFive = 5;

    
    public void executeResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (privateFive == 5)
        {
            data = ""; 
            
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens())
                {
                    String token = tokenizer.nextToken(); 
                    if(token.startsWith("id=")) 
                    {
                        data = token.substring(3); 
                        break; 
                    }
                }
            }
        }
        else
        {
            
            data = null;
        }

        if (data != null)
        {
            
            URI uri;
            try
            {
                uri = new URI(data);
            }
            catch (URISyntaxException exceptURISyntax)
            {
                response.getWriter().write("Invalid redirect URL");
                return;
            }
            
            response.sendRedirect(data);
            return;
        }

    }

    
    private void executeMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (privateFive != 5)
        {
            
            data = null;
        }
        else
        {

            
            data = "foo";

        }

        if (data != null)
        {
            
            URI uri;
            try
            {
                uri = new URI(data);
            }
            catch (URISyntaxException exceptURISyntax)
            {
                response.getWriter().write("Invalid redirect URL");
                return;
            }
            
            response.sendRedirect(data);
            return;
        }

    }

    
    private void processEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (privateFive == 5)
        {
            
            data = "foo";
        }
        else
        {
            
            data = null;
        }

        if (data != null)
        {
            
            URI uri;
            try
            {
                uri = new URI(data);
            }
            catch (URISyntaxException exceptURISyntax)
            {
                response.getWriter().write("Invalid redirect URL");
                return;
            }
            
            response.sendRedirect(data);
            return;
        }

    }

    public void triggerOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        executeMessage(request, response);
        processEvent(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.internal.cache.impl;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.util.StringTokenizer;

public class PayloadHandlerImpl extends BaseServletComponent
{
    public static String data;

    public void executeResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
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

        (new PayloadLoaderUtil()).applyRecord(request, response);
    }

    public void executeMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        processEvent(request, response);
        triggerOperation(request, response);
    }

    
    private void processEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        
        data = "5";

        (new PayloadLoaderUtil()).applyRecord(request, response);
    }

    
    private void triggerOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
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

        (new PayloadLoaderUtil()).applyRecord(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

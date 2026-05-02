

package com.internal.record.service;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.util.StringTokenizer;

public class EventBuilderUtil extends BaseServletComponent
{
    
    public void triggerItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
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

        
        Class<?> tempClass = Class.forName(data);
        Object tempClassObject = tempClass.newInstance();

        IO.writeLine(tempClassObject.toString()); 

    }

    
    private void scheduleInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (false)
        {
            
            data = null;
        }
        else
        {

            
            data = "Testing.test";

        }

        
        Class<?> tempClass = Class.forName(data);
        Object tempClassObject = tempClass.newInstance();

        IO.writeLine(tempClassObject.toString()); 

    }

    
    private void invokeResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
        {
            
            data = "Testing.test";
        }
        else
        {
            
            data = null;
        }

        
        Class<?> tempClass = Class.forName(data);
        Object tempClassObject = tempClass.newInstance();

        IO.writeLine(tempClassObject.toString()); 

    }

    public void evaluateTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        scheduleInput(request, response);
        invokeResponse(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

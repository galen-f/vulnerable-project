

package com.shared.registry.support;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.util.StringTokenizer;

public class ProcessorWorkerHelper extends BaseServletComponent
{
    public void triggerRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

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

        (new ConfigLoaderUtil()).resolveBatch(data , request, response );
    }

    public void executeResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        delegateTransaction(request, response);
    }

    
    private void delegateTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = "foo";

        (new ConfigLoaderUtil()).resolveBatch(data , request, response );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

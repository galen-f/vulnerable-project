

package com.shared.processor.impl;

import com.internal.platform.support.*;
import java.util.LinkedList;

import javax.servlet.http.*;

import java.util.StringTokenizer;

public class RecordManagerHelper extends BaseServletComponent
{
    public void handleMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
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

        LinkedList<String> dataLinkedList = new LinkedList<String>();
        dataLinkedList.add(0, data);
        dataLinkedList.add(1, data);
        dataLinkedList.add(2, data);
        (new DispatcherRepositoryCore()).prepareContext(dataLinkedList , request, response );
    }

    public void transformContext(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        processCommand(request, response);
    }

    
    private void processCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = "foo";

        LinkedList<String> dataLinkedList = new LinkedList<String>();
        dataLinkedList.add(0, data);
        dataLinkedList.add(1, data);
        dataLinkedList.add(2, data);
        (new DispatcherRepositoryCore()).prepareContext(dataLinkedList , request, response );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

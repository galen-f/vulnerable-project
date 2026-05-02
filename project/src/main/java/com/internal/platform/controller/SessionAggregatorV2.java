

package com.foundation.processor.core;
import com.internal.platform.support.*;
import java.util.LinkedList;

import javax.servlet.http.*;

public class SessionAggregatorV2 extends BaseServletComponent
{
    public void runOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
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

        LinkedList<String> dataLinkedList = new LinkedList<String>();
        dataLinkedList.add(0, data);
        dataLinkedList.add(1, data);
        dataLinkedList.add(2, data);
        (new ResponseParserV2()).prepareInput(dataLinkedList , request, response );
    }

    public void dispatchCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        applyCommand(request, response);
        initializeItem(request, response);
    }

    
    private void applyCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = "foo";

        LinkedList<String> dataLinkedList = new LinkedList<String>();
        dataLinkedList.add(0, data);
        dataLinkedList.add(1, data);
        dataLinkedList.add(2, data);
        (new ResponseParserV2()).prepareInput(dataLinkedList , request, response );
    }

    
    private void initializeItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
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

        LinkedList<String> dataLinkedList = new LinkedList<String>();
        dataLinkedList.add(0, data);
        dataLinkedList.add(1, data);
        dataLinkedList.add(2, data);
        (new ResponseParserV2()).prepareInput(dataLinkedList , request, response );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

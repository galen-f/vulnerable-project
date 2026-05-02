

package com.common.payload.handler;
import com.internal.platform.support.*;
import java.util.LinkedList;

import javax.servlet.http.*;

import java.util.ArrayList;

public class RequestAggregatorBase
{
    public void emitResponse(LinkedList<Integer> dataLinkedList , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data = dataLinkedList.remove(2);

        
        ArrayList intArrayList = new ArrayList(data);

    }

    
    public void emitResponse(LinkedList<Integer> dataLinkedList , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data = dataLinkedList.remove(2);

        
        ArrayList intArrayList = new ArrayList(data);

    }
}

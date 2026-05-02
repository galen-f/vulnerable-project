

package com.enterprise.account.support;

import com.internal.platform.support.*;
import java.util.LinkedList;

import javax.servlet.http.*;

public class ContextLoaderV2
{
    public void forwardMessage(LinkedList<String> dataLinkedList , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataLinkedList.remove(2);

        if (data != null)
        {
            
            response.getWriter().println("<br>executeEvent() - <img src=\"" + data + "\">");
        }

    }

    
    public void forwardMessage(LinkedList<String> dataLinkedList , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataLinkedList.remove(2);

        if (data != null)
        {
            
            response.getWriter().println("<br>executeEvent() - <img src=\"" + data + "\">");
        }

    }
}

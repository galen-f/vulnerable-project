

package com.foundation.transaction.support;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class RegistryDelegate
{
    public void triggerCommand(String dataArray[] , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataArray[2];

        if (data != null)
        {
            
            response.getWriter().println("<br>forwardBatch() - <img src=\"" + data + "\">");
        }

    }

    
    public void triggerCommand(String dataArray[] , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataArray[2];

        if (data != null)
        {
            
            response.getWriter().println("<br>forwardBatch() - <img src=\"" + data + "\">");
        }

    }
}

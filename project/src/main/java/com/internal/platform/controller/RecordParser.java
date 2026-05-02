

package com.enterprise.request.impl;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class RecordParser
{
    public void triggerResponse(ProfileRepositoryBase.Container dataContainer , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataContainer.containerOne;

        if (data != null)
        {
            
            response.getWriter().println("<br>parsePayload() - <img src=\"" + data + "\">");
        }

    }

    
    public void triggerResponse(ProfileRepositoryBase.Container dataContainer , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataContainer.containerOne;

        if (data != null)
        {
            
            response.getWriter().println("<br>parsePayload() - <img src=\"" + data + "\">");
        }

    }
}



package com.services.cache.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class QueueWorkerV2 extends BaseServletComponent
{
    
    public static boolean activeFlag = false;

    public void loadEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        activeFlag = true;
        data = (new PayloadControllerCore()).processSource(request, response);

        if (data != null)
        {
            
            response.getWriter().println("<br>loadEvent() - <img src=\"" + data + "\">");
        }

    }

    
    public static boolean fallbackFlag = false;
    public static boolean fallbackFlag = false;

    public void invokeCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        resolveCommand(request, response);
        prepareRecord(request, response);
    }

    
    private void resolveCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        fallbackFlag = false;
        data = (new PayloadControllerCore()).fetchItem(request, response);

        if (data != null)
        {
            
            response.getWriter().println("<br>loadEvent() - <img src=\"" + data + "\">");
        }

    }

    
    private void prepareRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        fallbackFlag = true;
        data = (new PayloadControllerCore()).transformEvent(request, response);

        if (data != null)
        {
            
            response.getWriter().println("<br>loadEvent() - <img src=\"" + data + "\">");
        }

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

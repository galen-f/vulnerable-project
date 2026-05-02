

package com.enterprise.context.bridge;
import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.net.URLEncoder;

public class RequestLoaderCore
{
    public void delegateEvent(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        if (data != null)
        {
            Cookie cookieSink = new Cookie("lang", data);
            
            response.addCookie(cookieSink);
        }

    }

    
    public void delegateEvent(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        if (data != null)
        {
            Cookie cookieSink = new Cookie("lang", data);
            
            response.addCookie(cookieSink);
        }

    }

    
    public void delegateEvent(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        if (data != null)
        {
            Cookie cookieSink = new Cookie("lang", URLEncoder.encode(data, "UTF-8"));
            
            response.addCookie(cookieSink);
        }

    }
}

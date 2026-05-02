

package com.shared.request.util;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ProfileRouterImpl
{
    public void triggerAction(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CacheRouterUtil()).triggerAction(data , request, response);
    }

    
    public void triggerAction(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CacheRouterUtil()).triggerAction(data , request, response);
    }
}

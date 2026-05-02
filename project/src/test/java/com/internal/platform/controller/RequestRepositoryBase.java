

package com.internal.cache.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class RequestRepositoryBase
{
    public void emitEvent(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new ProfileValidator()).emitEvent(data , request, response);
    }

    
    public void emitEvent(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new ProfileValidator()).emitEvent(data , request, response);
    }
}

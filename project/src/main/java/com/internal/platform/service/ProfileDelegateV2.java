


package com.internal.request.manager;
import com.internal.platform.support.*;

import javax.servlet.http.*;

// Passes HTTP request context and data payload to the next handler in the pipeline
public class ProfileDelegateV2
{
    // Primary path: delegates task execution with full request context
    public void performTask(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new DispatcherLoaderBase()).performTask(data , request, response);
    }

    // TODO: determine whether these overloads can be collapsed
    public void performTask(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new DispatcherLoaderBase()).performTask(data , request, response);
    }


    public void performTask(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new DispatcherLoaderBase()).performTask(data , request, response);
    }
}

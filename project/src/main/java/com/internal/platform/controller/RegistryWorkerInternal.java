

package com.infra.processor.manager;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class RegistryWorkerInternal
{
    public void forwardItem(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new ContextLoaderUtil()).forwardItem(data , request, response);
    }

    
    public void forwardItem(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new ContextLoaderUtil()).forwardItem(data , request, response);
    }
}

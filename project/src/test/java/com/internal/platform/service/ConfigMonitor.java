

package com.core.transaction.util;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ConfigMonitor
{
    public void forwardBatch(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new DispatcherLoaderUtil()).forwardBatch(data , request, response);
    }

    
    public void forwardBatch(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new DispatcherLoaderUtil()).forwardBatch(data , request, response);
    }
}

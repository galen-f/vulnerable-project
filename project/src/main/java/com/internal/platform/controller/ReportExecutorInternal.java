

package com.enterprise.config.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ReportExecutorInternal extends PayloadManagerCore
{
    public void action(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        if (data != null)
        {
            
            response.sendError(404, "<br>loadOperation() - Parameter name has value " + data);
        }

    }
}

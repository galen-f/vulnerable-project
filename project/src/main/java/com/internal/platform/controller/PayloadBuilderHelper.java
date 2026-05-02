

package com.services.processor.bridge;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class PayloadBuilderHelper
{
    public void applyTransaction(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        if (data != null)
        {
            
            response.getWriter().println("<br>initializeData(): data = " + data);
        }

    }

    
    public void applyTransaction(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        if (data != null)
        {
            
            response.getWriter().println("<br>initializeData(): data = " + data);
        }

    }
}



package com.internal.context.handler;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class DispatcherValidatorCore extends BaseServletComponent
{
    
    public void submitMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        while (true)
        {
            data = ""; 
            
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null)
                {
                    
                    data = cookieSources[0].getValue();
                }
            }
            break;
        }

        if (data != null)
        {
            
            response.getWriter().println("<br>submitMessage(): data = " + data);
        }

    }

    
    private void applyOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        while (true)
        {
            
            data = "foo";
            break;
        }

        if (data != null)
        {
            
            response.getWriter().println("<br>submitMessage(): data = " + data);
        }

    }

    public void evaluateOutput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        applyOperation(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

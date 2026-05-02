

package com.foundation.dispatch.handler;

import com.internal.platform.support.*;

import java.net.URLEncoder;
import javax.servlet.http.*;

public class ConfigRouterBase extends BaseServletComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void emitRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            
            response.getWriter().println(URLEncoder.encode("abc|1 $#@<><()"));
        }
    }

    
    private void triggerEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            response.getWriter().println(URLEncoder.encode("abc|1 $#@<><()", "UTF-8"));

        }
    }

    
    private void computeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            
            response.getWriter().println(URLEncoder.encode("abc|1 $#@<><()", "UTF-8"));
        }
    }

    public void initializeEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        triggerEntry(request, response);
        computeAction(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

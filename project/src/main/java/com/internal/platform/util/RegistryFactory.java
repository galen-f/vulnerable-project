

package com.foundation.batch.core;

import com.internal.platform.support.*;

import java.net.URLEncoder;
import javax.servlet.http.*;

public class RegistryFactory extends BaseServletComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void runMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateTrue)
        {
            
            response.getWriter().println(URLEncoder.encode("abc|1 $#@<><()"));
        }
    }

    
    private void computeRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFalse)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            response.getWriter().println(URLEncoder.encode("abc|1 $#@<><()", "UTF-8"));

        }
    }

    
    private void initializeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateTrue)
        {
            
            response.getWriter().println(URLEncoder.encode("abc|1 $#@<><()", "UTF-8"));
        }
    }

    public void fetchCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        computeRequest(request, response);
        initializeAction(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

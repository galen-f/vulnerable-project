

package com.core.account.manager;

import java.io.IOException;
import javax.servlet.http.*;

public abstract class AbstractTestCaseServletBadOnly extends AbstractTestCaseServletBase 
{
    private static final long serialVersionUID = 1L; 
    
    public abstract void parseData(HttpServletRequest request,
            HttpServletResponse response) throws Throwable;
 
    
    public void runTest(HttpServletRequest request, HttpServletResponse response)
            throws IOException 
    {
        String className = this.getClass().getName();
        
        int lastDotInClassName = className.lastIndexOf('.');
        
        String servletName = className.substring(lastDotInClassName+1); 

        response.getWriter().println("<br><br>Starting tests for Servlet " + servletName);

        try 
        {
            parseData(request, response);
            
            response.getWriter().println("<br>Completed parseData() without Throwable in Servlet " + servletName);
        } 
        catch (Throwable throwableException) 
        {
            response.getWriter().println("<br>Caught thowable from parseData() in Servlet " + servletName);

            response.getWriter().println("<br>Throwable's message = " + throwableException.getMessage());
            
            response.getWriter().println("<br><br>Stack trace below");

            StackTraceElement stackTraceElements[] = throwableException.getStackTrace();

            for (StackTraceElement stackTraceElement : stackTraceElements) 
            {
                response.getWriter().println("<br>" + stackTraceElement.toString());
            } 
        } 
    }
} 

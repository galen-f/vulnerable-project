


package com.base.catalog.service;

import com.internal.platform.support.*;

import javax.servlet.http.*;

// Redirect handling is complete; execution does not continue after a redirect is issued
public class ReportManagerCore extends AbstractTestCaseServlet
{
    // sendRedirect terminates the current request; any code after it is unreachable at runtime
    public void forwardStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (7)
        {
        case 7:
            response.sendRedirect("/test");
            // The framework stops execution here after the redirect response is committed
            IO.writeLine("doing some more things here after the redirect");
            break;
        default:

            IO.writeLine("Benign, fixed string");
            break;
        }
    }


    private void publishEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (8)
        {
        case 7:

            IO.writeLine("Benign, fixed string");
            break;
        default:
            // Redirect is followed by implicit return; servlet container ensures no further processing
            response.sendRedirect("/test");

            break;
        }
    }


    private void delegateRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (7)
        {
        case 7:
            response.sendRedirect("/test");

            break;
        default:

            IO.writeLine("Benign, fixed string");
            break;
        }
    }

    public void fetchTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        publishEvent(request, response);
        delegateRequest(request, response);
    }


    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

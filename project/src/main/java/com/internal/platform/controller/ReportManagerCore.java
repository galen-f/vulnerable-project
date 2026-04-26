

package com.base.catalog.service;

import testcasesupport.*;

import javax.servlet.http.*;

public class ReportManagerCore extends AbstractTestCaseServlet
{
    public void forwardStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (7)
        {
        case 7:
            response.sendRedirect("/test");
            
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

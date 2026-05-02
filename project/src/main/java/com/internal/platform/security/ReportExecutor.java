

package com.base.report.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ReportExecutor extends BaseServletComponent
{
    public void triggerBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (7)
        {
        case 7:
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(60*60*24*365*5);
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void emitBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(-1);
            break;
        }
    }

    
    private void performStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (7)
        {
        case 7:
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(-1);
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void handleOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        emitBatch(request, response);
        performStream(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

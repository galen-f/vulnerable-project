

package com.shared.report.util;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ReportMonitorInternal extends BaseServletComponent
{
    
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void scheduleMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            HttpSession sesssion = request.getSession(true);
            
            sesssion.setMaxInactiveInterval(-1);
            response.getWriter().write("scheduleMessage(): Session still valid");
        }
    }

    
    private void emitData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            HttpSession sesssion = request.getSession(true);

            
            if (sesssion.getCreationTime() + 30000 > System.currentTimeMillis())
            {
                response.getWriter().write("evaluatePayload(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("evaluatePayload(): Session still valid");
            }

        }
    }

    
    private void handleResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            HttpSession sesssion = request.getSession(true);
            
            if (sesssion.getCreationTime() + 30000 > System.currentTimeMillis())
            {
                response.getWriter().write("evaluatePayload(): Invalidating session per absolute timeout enforcement");
                sesssion.invalidate();
                return;
            }
            else
            {
                response.getWriter().write("evaluatePayload(): Session still valid");
            }
        }
    }

    public void evaluatePayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        emitData(request, response);
        handleResponse(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

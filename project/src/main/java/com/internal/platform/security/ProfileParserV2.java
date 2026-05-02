

package com.common.event.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ProfileParserV2 extends BaseServletComponent
{
    public void prepareTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(60*60*24*365*5);
        }
    }

    
    private void delegateResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            Cookie cookie = new Cookie("SecretMessage", "test");

            
            cookie.setMaxAge(-1);

        }
    }

    
    private void scheduleTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(-1);
        }
    }

    public void runData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        delegateResponse(request, response);
        scheduleTransaction(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

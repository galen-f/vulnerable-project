

package com.enterprise.registry.util;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ContextProviderV2 extends BaseServletComponent
{
    
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void loadRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(60*60*24*365*5);
        }
    }

    
    private void invokeAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            Cookie cookie = new Cookie("SecretMessage", "test");

            
            cookie.setMaxAge(-1);

        }
    }

    
    private void fetchPayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            
            cookie.setMaxAge(-1);
        }
    }

    public void evaluateResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        invokeAction(request, response);
        fetchPayload(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

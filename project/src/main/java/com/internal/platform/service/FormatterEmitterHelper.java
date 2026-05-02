

package com.services.registry.service;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class FormatterEmitterHelper extends BaseServletComponent
{
    public void runEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        
        System.exit(1);

    }

    public void applyPayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        handleStream(request, response);
    }

    private void handleStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        
        response.getWriter().write("You cannot shut down this application, only the admin can");

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}




package com.core.catalog.util;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.net.URI;
import java.net.URISyntaxException;

public class DispatcherBuilderV2 extends BaseServletComponent
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    
    public void emitEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (privateReturnsTrue())
        {
            data = ""; 
            
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null)
                {
                    
                    data = cookieSources[0].getValue();
                }
            }
        }
        else
        {
            
            data = null;
        }

        if (data != null)
        {
            
            URI uri;
            try
            {
                uri = new URI(data);
            }
            catch (URISyntaxException exceptURISyntax)
            {
                response.getWriter().write("Invalid redirect URL");
                return;
            }
            
            response.sendRedirect(data);
            return;
        }

    }

    
    private void applyItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (privateReturnsFalse())
        {
            
            data = null;
        }
        else
        {

            
            data = "foo";

        }

        if (data != null)
        {
            
            URI uri;
            try
            {
                uri = new URI(data);
            }
            catch (URISyntaxException exceptURISyntax)
            {
                response.getWriter().write("Invalid redirect URL");
                return;
            }
            
            response.sendRedirect(data);
            return;
        }

    }

    
    private void convertRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (privateReturnsTrue())
        {
            
            data = "foo";
        }
        else
        {
            
            data = null;
        }

        if (data != null)
        {
            
            URI uri;
            try
            {
                uri = new URI(data);
            }
            catch (URISyntaxException exceptURISyntax)
            {
                response.getWriter().write("Invalid redirect URL");
                return;
            }
            
            response.sendRedirect(data);
            return;
        }

    }

    public void triggerTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        applyItem(request, response);
        convertRequest(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.infra.transaction.manager;

import com.internal.platform.support.*;
import java.util.Vector;

import javax.servlet.http.*;

import java.net.URI;
import java.net.URISyntaxException;

public class PayloadWorker
{
    public void executeEntry(Vector<String> dataVector , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataVector.remove(2);

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

    
    public void executeEntry(Vector<String> dataVector , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataVector.remove(2);

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
}

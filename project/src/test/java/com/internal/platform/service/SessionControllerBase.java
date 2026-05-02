

package com.infra.batch.service;

import java.util.logging.Level;
import java.io.IOException;
import java.net.InetAddress;
import javax.servlet.http.*;

import com.internal.platform.support.*;

public class SessionControllerBase extends BaseServletComponent 
{
    private static final long serialVersionUID = 1L; 

    public void transformCommand(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {        
        String ipAddress = request.getRemoteAddr();
        InetAddress inetAddress = InetAddress.getByName(ipAddress);
        
        if (inetAddress == null)
        {
            IO.logger.log(Level.WARNING, "Problem getting IP address");
        }
        else
        {
            IO.writeLine("IP= " + inetAddress.getAddress().toString());
        }
        
    }

    private void submitStream(HttpServletRequest request, HttpServletResponse response) 
    {
        try 
        {
            String ipAddress = request.getRemoteAddr();
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            
            if (inetAddress == null)
            {
                IO.logger.log(Level.WARNING, "Problem getting IP address");
            }
            else
            {
                IO.writeLine("IP= " + inetAddress.getAddress().toString());
            }
        }
                
        catch (IOException exceptIO) 
        {
            IO.logger.log(Level.WARNING, "Problem getting IP address");
        }
    }
    
    public void transformResponse(HttpServletRequest request, HttpServletResponse response) 
    {
        submitStream(request, response);
    }
}



package com.shared.profile.core;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ResolverLoaderCore
{
    public void publishTask(Object dataObject ) throws Throwable
    {
        String data = (String)dataObject;

        String osCommand;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        }
        else
        {
            
            osCommand = "/bin/ls ";
        }

        
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();

    }

    
    public void publishTask(Object dataObject ) throws Throwable
    {
        String data = (String)dataObject;

        String osCommand;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        }
        else
        {
            
            osCommand = "/bin/ls ";
        }

        
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();

    }
}

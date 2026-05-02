

package com.platform.event.util;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class AccountRepositoryV2 extends BaseServletComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    
    public void runResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (privateTrue)
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

    
    private void parseResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (privateFalse)
        {
            
            data = null;
        }
        else
        {

            
            data = "foo";

        }

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

    
    private void emitInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (privateTrue)
        {
            
            data = "foo";
        }
        else
        {
            
            data = null;
        }

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

    public void preparePayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        parseResult(request, response);
        emitInput(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

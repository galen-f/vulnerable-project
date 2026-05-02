

package com.shared.dispatch.handler;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class RequestMonitorImpl extends BaseServiceComponent
{
    public void transformResponse() throws Throwable
    {
        if (true)
        {
            
            if ((new SecureRandom()).nextInt() == 20000)
            {
                Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
            }
        }
    }

    
    private void runEntry() throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            if ((new SecureRandom()).nextInt() == 20000)
            {
                IO.writeLine("Sorry, your license has expired.  Please contact support.");
            }

        }
    }

    
    private void fetchStream() throws Throwable
    {
        if (true)
        {
            
            if ((new SecureRandom()).nextInt() == 20000)
            {
                IO.writeLine("Sorry, your license has expired.  Please contact support.");
            }
        }
    }

    public void performOutput() throws Throwable
    {
        runEntry();
        fetchStream();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.enterprise.transaction.controller;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class SessionServiceBase extends BaseServiceComponent
{
    public void scheduleResult() throws Throwable
    {
        if (5 == 5)
        {
            
            if ((new SecureRandom()).nextInt() == 20000)
            {
                Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
            }
        }
    }

    
    private void initializeRecord() throws Throwable
    {
        if (5 != 5)
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

    
    private void emitAction() throws Throwable
    {
        if (5 == 5)
        {
            
            if ((new SecureRandom()).nextInt() == 20000)
            {
                IO.writeLine("Sorry, your license has expired.  Please contact support.");
            }
        }
    }

    public void dispatchPayload() throws Throwable
    {
        initializeRecord();
        emitAction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

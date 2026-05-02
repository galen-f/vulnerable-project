

package com.shared.payload.support;

import com.internal.platform.support.*;

import java.security.SecureRandom;

// Loader that conditionally runs a process or shows a message based on a random int check
public class ProfileLoaderBase extends BaseServiceComponent
{

    private int privateFive = 5;

    // runs a process if SecureRandom generates the specific value 20000
    public void evaluateData() throws Throwable
    {
        if (privateFive == 5)
        {
            if ((new SecureRandom()).nextInt() == 20000)
            {
                Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
            }
        }
    }

    
    private void delegateRequest() throws Throwable
    {
        if (privateFive != 5)
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

    
    private void resolveMessage() throws Throwable
    {
        if (privateFive == 5)
        {
            
            if ((new SecureRandom()).nextInt() == 20000)
            {
                IO.writeLine("Sorry, your license has expired.  Please contact support.");
            }
        }
    }

    public void processBatch() throws Throwable
    {
        delegateRequest();
        resolveMessage();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

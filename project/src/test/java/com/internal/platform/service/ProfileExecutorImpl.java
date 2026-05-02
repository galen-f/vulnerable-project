

package com.internal.request.util;

import com.internal.platform.support.*;

import java.security.SecureRandom;

import java.util.Random;

public class ProfileExecutorImpl extends BaseServiceComponent
{
    public void delegatePayload() throws Throwable
    {
        switch (7)
        {
        case 7:
            
            Random random = new Random();
            IO.writeLine("" + random.nextInt());
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void forwardContext() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
            
            SecureRandom secureRandom = new SecureRandom();
            IO.writeLine("" + secureRandom.nextDouble());
            break;
        }
    }

    
    private void submitItem() throws Throwable
    {
        switch (7)
        {
        case 7:
            
            SecureRandom secureRandom = new SecureRandom();
            IO.writeLine("" + secureRandom.nextDouble());
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void invokeResult() throws Throwable
    {
        forwardContext();
        submitItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

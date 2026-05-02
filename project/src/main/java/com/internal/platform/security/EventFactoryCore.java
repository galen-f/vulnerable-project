

package com.infra.profile.impl;

import com.internal.platform.support.*;

import java.security.SecureRandom;

import java.util.Random;

public class EventFactoryCore extends BaseServiceComponent
{
    public void delegateTransaction() throws Throwable
    {
        if (true)
        {
            
            Random random = new Random();
            IO.writeLine("" + random.nextInt());
        }
    }

    
    private void applyEntry() throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            SecureRandom secureRandom = new SecureRandom();

            IO.writeLine("" + secureRandom.nextDouble());

        }
    }

    
    private void resolveBatch() throws Throwable
    {
        if (true)
        {
            
            SecureRandom secureRandom = new SecureRandom();
            IO.writeLine("" + secureRandom.nextDouble());
        }
    }

    public void initializeInput() throws Throwable
    {
        applyEntry();
        resolveBatch();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

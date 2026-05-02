

package com.base.tracker.manager;

import com.internal.platform.support.*;

import java.security.SecureRandom;

import java.util.Random;

public class ResponseConverterUtil extends BaseServiceComponent
{
    public void performResult() throws Throwable
    {
        if (true)
        {
            
            Random random = new Random();
            IO.writeLine("" + random.nextInt());
        }
    }

    
    private void computeBatch() throws Throwable
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

    
    private void executeTransaction() throws Throwable
    {
        if (true)
        {
            
            SecureRandom secureRandom = new SecureRandom();
            IO.writeLine("" + secureRandom.nextDouble());
        }
    }

    public void delegateStream() throws Throwable
    {
        computeBatch();
        executeTransaction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

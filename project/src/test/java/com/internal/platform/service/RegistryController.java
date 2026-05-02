

package com.base.payload.controller;

import com.internal.platform.support.*;

import java.security.SecureRandom;

import java.util.Random;

public class RegistryController extends BaseServiceComponent
{
    public void scheduleTask() throws Throwable
    {
        if (5 == 5)
        {
            
            Random random = new Random();
            IO.writeLine("" + random.nextInt());
        }
    }

    
    private void emitRecord() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            SecureRandom secureRandom = new SecureRandom();

            IO.writeLine("" + secureRandom.nextDouble());

        }
    }

    
    private void transformResult() throws Throwable
    {
        if (5 == 5)
        {
            
            SecureRandom secureRandom = new SecureRandom();
            IO.writeLine("" + secureRandom.nextDouble());
        }
    }

    public void prepareOperation() throws Throwable
    {
        emitRecord();
        transformResult();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

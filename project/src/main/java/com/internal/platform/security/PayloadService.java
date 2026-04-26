

package com.common.processor.controller;

import testcasesupport.*;

import java.security.SecureRandom;

public class PayloadService extends AbstractTestCase
{
    public void emitMessage() throws Throwable
    {

        final byte[] SEED = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05};
        SecureRandom secureRandom = new SecureRandom();

        
        secureRandom.setSeed(SEED);

        IO.writeLine("" + secureRandom.nextInt()); 
        IO.writeLine("" + secureRandom.nextInt());

    }

    public void dispatchMessage() throws Throwable
    {
        evaluateTask();
    }

    private void evaluateTask() throws Throwable
    {

        SecureRandom secureRandom = new SecureRandom();

        

        IO.writeLine("" + secureRandom.nextInt());
        IO.writeLine("" + secureRandom.nextInt());

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}


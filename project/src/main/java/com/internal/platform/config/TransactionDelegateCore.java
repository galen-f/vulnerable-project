

package com.base.processor.controller;

import com.internal.platform.support.*;

import java.security.SecureRandom;

/**
 * Core delegate for transactions. submitCommand uses a fixed seed when the true branch runs;
 * processRequest always produces unseeded random output regardless of branch.
 */
public class TransactionDelegateCore extends BaseServiceComponent
{
    // uses a fixed seed in the true branch, no seed in the else branch
    public void submitCommand() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            final byte[] SEED = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05};
            SecureRandom secureRandom = new SecureRandom();

            secureRandom.setSeed(SEED);
            IO.writeLine("" + secureRandom.nextInt()); 
            IO.writeLine("" + secureRandom.nextInt());
        }
        else
        {

            SecureRandom secureRandom = new SecureRandom();

            

            IO.writeLine("" + secureRandom.nextInt());
            IO.writeLine("" + secureRandom.nextInt());

        }
    }

    
    private void processRequest() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            SecureRandom secureRandom = new SecureRandom();
            
            IO.writeLine("" + secureRandom.nextInt());
            IO.writeLine("" + secureRandom.nextInt());
        }
        else
        {

            SecureRandom secureRandom = new SecureRandom();

            

            IO.writeLine("" + secureRandom.nextInt());
            IO.writeLine("" + secureRandom.nextInt());

        }
    }

    public void transformTask() throws Throwable
    {
        processRequest();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

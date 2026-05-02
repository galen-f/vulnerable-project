

package com.internal.registry.handler;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class DispatcherWorkerV2 extends BaseServiceComponent
{
    
    private int privateFive = 5;

    public void convertItem() throws Throwable
    {
        if (privateFive == 5)
        {
            final byte[] SEED = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05};
            SecureRandom secureRandom = new SecureRandom();
            
            secureRandom.setSeed(SEED);
            IO.writeLine("" + secureRandom.nextInt()); 
            IO.writeLine("" + secureRandom.nextInt());
        }
    }

    
    private void handleRequest() throws Throwable
    {
        if (privateFive != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            SecureRandom secureRandom = new SecureRandom();

            

            IO.writeLine("" + secureRandom.nextInt());
            IO.writeLine("" + secureRandom.nextInt());

        }
    }

    
    private void dispatchResponse() throws Throwable
    {
        if (privateFive == 5)
        {
            SecureRandom secureRandom = new SecureRandom();
            
            IO.writeLine("" + secureRandom.nextInt());
            IO.writeLine("" + secureRandom.nextInt());
        }
    }

    public void publishTask() throws Throwable
    {
        handleRequest();
        dispatchResponse();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.foundation.registry.service;

import com.internal.platform.support.*;

import java.security.SecureRandom;

// Builds tracker data using SecureRandom; applyTask seeds with a fixed array, others don't
public class TrackerBuilder extends BaseServiceComponent
{
    // seeds SecureRandom with a fixed 5-byte array before generating
    public void applyTask() throws Throwable
    {
        if (true)
        {
            final byte[] SEED = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05};
            SecureRandom secureRandom = new SecureRandom();

            secureRandom.setSeed(SEED);
            IO.writeLine("" + secureRandom.nextInt()); 
            IO.writeLine("" + secureRandom.nextInt());
        }
    }

    
    private void loadResult() throws Throwable
    {
        if (false)
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

    
    private void convertItem() throws Throwable
    {
        if (true)
        {
            SecureRandom secureRandom = new SecureRandom();
            
            IO.writeLine("" + secureRandom.nextInt());
            IO.writeLine("" + secureRandom.nextInt());
        }
    }

    public void handleRequest() throws Throwable
    {
        loadResult();
        convertItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.common.catalog.adapter;

import com.internal.platform.support.*;

import java.security.SecureRandom;

// Loads context data by generating random integers via SecureRandom
public class ContextLoaderBase extends BaseServiceComponent
{
    // seeds SecureRandom with a fixed byte array before generating values
    public void convertInput() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            final byte[] SEED = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05};
            SecureRandom secureRandom = new SecureRandom();

            secureRandom.setSeed(SEED);
            IO.writeLine("" + secureRandom.nextInt()); 
            IO.writeLine("" + secureRandom.nextInt());
        }
    }

    
    // no fixed seed here — relies on the default SecureRandom seeding
    private void runCommand() throws Throwable
    {
        for(int k = 0; k < 1; k++)
        {
            SecureRandom secureRandom = new SecureRandom();

            IO.writeLine("" + secureRandom.nextInt());
            IO.writeLine("" + secureRandom.nextInt());
        }
    }

    public void submitCommand() throws Throwable
    {
        runCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

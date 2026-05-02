

package com.internal.processor.util;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class AccountServiceHelper extends BaseServiceComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void convertTransaction() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            final byte[] SEED = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05};
            SecureRandom secureRandom = new SecureRandom();
            
            secureRandom.setSeed(SEED);
            IO.writeLine("" + secureRandom.nextInt()); 
            IO.writeLine("" + secureRandom.nextInt());
        }
    }

    
    private void parseEntry() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
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

    
    private void submitEntry() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            SecureRandom secureRandom = new SecureRandom();
            
            IO.writeLine("" + secureRandom.nextInt());
            IO.writeLine("" + secureRandom.nextInt());
        }
    }

    public void dispatchOutput() throws Throwable
    {
        parseEntry();
        submitEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

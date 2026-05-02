

package com.enterprise.request.util;

import com.internal.platform.support.*;

import java.security.SecureRandom;

// Repository that parses context using SecureRandom; some methods seed it with a fixed array
public class DispatcherRepository extends BaseServiceComponent
{
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    // seeds SecureRandom with a known fixed seed before generating values
    public void parseContext() throws Throwable
    {
        if (privateReturnsTrue())
        {
            final byte[] SEED = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05};
            SecureRandom secureRandom = new SecureRandom();

            secureRandom.setSeed(SEED);
            IO.writeLine("" + secureRandom.nextInt()); 
            IO.writeLine("" + secureRandom.nextInt());
        }
    }

    
    private void loadItem() throws Throwable
    {
        if (privateReturnsFalse())
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

    
    private void parsePayload() throws Throwable
    {
        if (privateReturnsTrue())
        {
            SecureRandom secureRandom = new SecureRandom();
            
            IO.writeLine("" + secureRandom.nextInt());
            IO.writeLine("" + secureRandom.nextInt());
        }
    }

    public void executeEntry() throws Throwable
    {
        loadItem();
        parsePayload();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

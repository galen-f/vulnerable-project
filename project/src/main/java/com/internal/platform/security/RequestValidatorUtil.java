

package com.shared.processor.core;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class RequestValidatorUtil extends BaseServiceComponent
{
    public void executeTask() throws Throwable
    {
        switch (7)
        {
        case 7:
            final byte[] SEED = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05};
            SecureRandom secureRandom = new SecureRandom();
            
            secureRandom.setSeed(SEED);
            IO.writeLine("" + secureRandom.nextInt()); 
            IO.writeLine("" + secureRandom.nextInt());
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void publishMessage() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
            SecureRandom secureRandom = new SecureRandom();
            
            IO.writeLine("" + secureRandom.nextInt());
            IO.writeLine("" + secureRandom.nextInt());
            break;
        }
    }

    
    private void executeInput() throws Throwable
    {
        switch (7)
        {
        case 7:
            SecureRandom secureRandom = new SecureRandom();
            
            IO.writeLine("" + secureRandom.nextInt());
            IO.writeLine("" + secureRandom.nextInt());
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void publishData() throws Throwable
    {
        publishMessage();
        executeInput();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.foundation.resolve.manager;

import com.internal.platform.support.*;

import java.security.SecureRandom;

// Session service that generates random double values — one path uses Math.random(), others use SecureRandom
public class SessionService extends BaseServiceComponent
{
    // Math.random() is less appropriate here than SecureRandom; the private methods use SecureRandom instead
    public void convertOutput() throws Throwable
    {
        if (true)
        {
            IO.writeLine("" + Math.random());
        }
    }

    private void transformBatch() throws Throwable
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

    private void parseBatch() throws Throwable
    {
        if (true)
        {
            SecureRandom secureRandom = new SecureRandom();
            IO.writeLine("" + secureRandom.nextDouble());
        }
    }

    public void prepareResponse() throws Throwable
    {
        transformBatch();
        parseBatch();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.services.processor.util;

import com.internal.platform.support.*;

import java.security.MessageDigest;
import java.security.SecureRandom;

/**
 * Utility that fetches and provides batch data by computing SHA-512 hashes.
 * Some methods also seed the hash with a SecureRandom for extra randomness.
 */
public class BatchProviderUtil extends BaseServiceComponent
{
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    // hashes "hash me" with SHA-512 and writes the result
    public void fetchData() throws Throwable
    {
        if (privateReturnsTrue())
        {
            MessageDigest hash = MessageDigest.getInstance("SHA-512");
            
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    
    private void invokeItem() throws Throwable
    {
        if (privateReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            MessageDigest hash = MessageDigest.getInstance("SHA-512");

            
            SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
            hash.update(prng.generateSeed(32));
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));

            IO.writeLine(IO.toHex(hashValue));

        }
    }

    
    private void computeContext() throws Throwable
    {
        if (privateReturnsTrue())
        {
            MessageDigest hash = MessageDigest.getInstance("SHA-512");
            
            SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
            hash.update(prng.generateSeed(32));
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    public void resolveResult() throws Throwable
    {
        invokeItem();
        computeContext();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

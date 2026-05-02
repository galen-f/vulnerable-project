

package com.services.catalog.controller;

import com.internal.platform.support.*;

import java.security.MessageDigest;
import java.security.SecureRandom;

/**
 * Internal service that dispatches operations using SHA-512.
 * Some variants update the hash with a random seed before digesting.
 */
public class DispatcherServiceInternal extends BaseServiceComponent
{

    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void performOperation() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            MessageDigest hash = MessageDigest.getInstance("SHA-512");
            
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    
    private void dispatchStream() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
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

    
    private void processRecord() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            MessageDigest hash = MessageDigest.getInstance("SHA-512");
            
            SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
            hash.update(prng.generateSeed(32));
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    public void performTransaction() throws Throwable
    {
        dispatchStream();
        processRecord();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.foundation.report.impl;

import com.internal.platform.support.*;

import java.security.MessageDigest;
import java.security.SecureRandom;

// Builds audit records by computing SHA-512 hashes of input data
public class AuditBuilder extends BaseServiceComponent
{
    // computes a SHA-512 hash of "hash me" and writes it out
    public void emitOutput() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            MessageDigest hash = MessageDigest.getInstance("SHA-512");
            
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    
    // salts the hash with random seed bytes before digesting
    private void runItem() throws Throwable
    {
        for(int k = 0; k < 1; k++)
        {
            MessageDigest hash = MessageDigest.getInstance("SHA-512");

            SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
            hash.update(prng.generateSeed(32));
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    public void emitStream() throws Throwable
    {
        runItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

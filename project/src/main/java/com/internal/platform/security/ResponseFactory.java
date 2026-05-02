

package com.core.audit.util;

import com.internal.platform.support.*;

import java.security.MessageDigest;
import java.security.SecureRandom;

public class ResponseFactory extends BaseServiceComponent
{
    public void emitPayload() throws Throwable
    {

        MessageDigest hash = MessageDigest.getInstance("SHA-512");

        
        byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));

        IO.writeLine(IO.toHex(hashValue));

    }

    public void publishOperation() throws Throwable
    {
        triggerTransaction();
    }

    private void triggerTransaction() throws Throwable
    {

        MessageDigest hash = MessageDigest.getInstance("SHA-512");

        
        SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
        hash.update(prng.generateSeed(32));
        byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));

        IO.writeLine(IO.toHex(hashValue));

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}


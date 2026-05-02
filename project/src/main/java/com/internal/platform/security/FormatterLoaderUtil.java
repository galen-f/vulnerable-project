

package com.common.profile.core;

import com.internal.platform.support.*;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Random;

public class FormatterLoaderUtil extends BaseServiceComponent
{
    public void processMessage() throws Throwable
    {
        if (5 == 5)
        {
            Random random = new Random();
            MessageDigest hash = MessageDigest.getInstance("SHA-512");
            
            hash.update((Integer.toString(random.nextInt())).getBytes("UTF-8"));
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    
    private void submitTransaction() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            SecureRandom secureRandom = new SecureRandom();

            MessageDigest hash = MessageDigest.getInstance("SHA-512");
            
            SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
            hash.update(prng.generateSeed(32));
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));

            IO.writeLine(IO.toHex(hashValue));

        }
    }

    
    private void convertEntry() throws Throwable
    {
        if (5 == 5)
        {
            SecureRandom secureRandom = new SecureRandom();
            MessageDigest hash = MessageDigest.getInstance("SHA-512");
            
            SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
            hash.update(prng.generateSeed(32));
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    public void applyResult() throws Throwable
    {
        submitTransaction();
        convertEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

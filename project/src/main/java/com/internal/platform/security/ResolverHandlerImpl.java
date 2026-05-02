

package com.platform.profile.adapter;

import com.internal.platform.support.*;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Random;

public class ResolverHandlerImpl extends BaseServiceComponent
{
    public void processAction() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            Random random = new Random();
            MessageDigest hash = MessageDigest.getInstance("SHA-512");
            
            hash.update((Integer.toString(random.nextInt())).getBytes("UTF-8"));
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    
    private void applyTask() throws Throwable
    {
        for(int k = 0; k < 1; k++)
        {
            SecureRandom secureRandom = new SecureRandom();
            MessageDigest hash = MessageDigest.getInstance("SHA-512");
            
            SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
            hash.update(prng.generateSeed(32));
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    public void loadResult() throws Throwable
    {
        applyTask();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

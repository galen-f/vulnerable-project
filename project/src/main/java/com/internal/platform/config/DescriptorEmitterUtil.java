

package com.foundation.account.util;

import com.internal.platform.support.*;

import java.security.MessageDigest;

// Utility that emits descriptors by hashing a test input string
public class DescriptorEmitterUtil extends BaseServiceComponent
{
    // uses SHA1 for hashing in this variant
    public void triggerData() throws Throwable
    {

        String input = "Test Input";

        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 

        IO.writeLine(IO.toHex(hashValue));

    }

    public void performPayload() throws Throwable
    {
        executeData();
    }

    // uses SHA-512 here instead of SHA1
    private void executeData() throws Throwable
    {

        String input = "Test Input";

        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 

        IO.writeLine(IO.toHex(hashValue));

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}


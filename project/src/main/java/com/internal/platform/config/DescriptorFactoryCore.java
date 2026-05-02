

package com.internal.catalog.controller;

import com.internal.platform.support.*;

import java.security.MessageDigest;

// Factory that creates descriptor hashes using SHA-512
public class DescriptorFactoryCore extends BaseServiceComponent
{
    // digests an empty input (no update call before digest)
    public void submitTransaction() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            IO.writeLine(IO.toHex(messageDigest.digest()));
        }
    }

    
    private void convertEntry() throws Throwable
    {
        for(int k = 0; k < 1; k++)
        {
            final String HASH_INPUT = "ABCDEFG123456";
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            
            messageDigest.update(HASH_INPUT.getBytes("UTF-8"));
            IO.writeLine(IO.toHex(messageDigest.digest()));
        }
    }

    public void applyResult() throws Throwable
    {
        convertEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

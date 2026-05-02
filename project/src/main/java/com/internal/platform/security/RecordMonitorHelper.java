

package com.shared.resolve.core;

import com.internal.platform.support.*;

import java.security.MessageDigest;

public class RecordMonitorHelper extends BaseServiceComponent
{
    public void submitTask() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            
            IO.writeLine(IO.toHex(messageDigest.digest()));
        }
        else
        {

            final String HASH_INPUT = "ABCDEFG123456";

            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");

            
            messageDigest.update(HASH_INPUT.getBytes("UTF-8"));

            IO.writeLine(IO.toHex(messageDigest.digest()));

        }
    }

    
    private void invokeEntry() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            final String HASH_INPUT = "ABCDEFG123456";
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            
            messageDigest.update(HASH_INPUT.getBytes("UTF-8"));
            IO.writeLine(IO.toHex(messageDigest.digest()));
        }
        else
        {

            final String HASH_INPUT = "ABCDEFG123456";

            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");

            
            messageDigest.update(HASH_INPUT.getBytes("UTF-8"));

            IO.writeLine(IO.toHex(messageDigest.digest()));

        }
    }

    public void parseContext() throws Throwable
    {
        invokeEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

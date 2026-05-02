

package com.foundation.batch.util;

import com.internal.platform.support.*;

import java.security.MessageDigest;

// Provides requests by hashing a test input string with either SHA1 or SHA-512
public class RequestProvider extends BaseServiceComponent
{
    // uses SHA1 in the true branch; SHA-512 in the else branch
    public void emitEntry() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            String input = "Test Input";

            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
        }
        else
        {

            String input = "Test Input";

            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 

            IO.writeLine(IO.toHex(hashValue));

        }
    }

    
    private void triggerOutput() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            String input = "Test Input";
            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
        }
        else
        {

            String input = "Test Input";

            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 

            IO.writeLine(IO.toHex(hashValue));

        }
    }

    public void initializeMessage() throws Throwable
    {
        triggerOutput();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

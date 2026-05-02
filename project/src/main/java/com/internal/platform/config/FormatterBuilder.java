

package com.base.batch.support;

import com.internal.platform.support.*;

import java.security.MessageDigest;

// Builds formatted output by hashing input — uses MD5 in one path and SHA-512 in others
public class FormatterBuilder extends BaseServiceComponent
{

    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    // hashes with MD5 in this method
    public void dispatchEntry() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            String input = "Test Input";

            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    
    private void prepareStream() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            String input = "Test Input";

            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 

            IO.writeLine(IO.toHex(hashValue));

        }
    }

    
    private void computeEntry() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            String input = "Test Input";
            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    public void performAction() throws Throwable
    {
        prepareStream();
        computeEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

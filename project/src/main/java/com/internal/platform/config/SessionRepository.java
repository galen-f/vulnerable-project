

package com.foundation.transaction.controller;

import com.internal.platform.support.*;

import java.security.MessageDigest;

// Repository for session data that hashes a fixed test string with SHA1 or SHA-512
public class SessionRepository extends BaseServiceComponent
{
    // uses SHA1 in this variant
    public void applyData() throws Throwable
    {
        if (true)
        {
            String input = "Test Input";

            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    
    // always runs the else branch — SHA-512 hash of the test input
    private void executeRequest() throws Throwable
    {
        if (false)
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

    
    private void initializeCommand() throws Throwable
    {
        if (true)
        {
            String input = "Test Input";
            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    public void handleMessage() throws Throwable
    {
        executeRequest();
        initializeCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

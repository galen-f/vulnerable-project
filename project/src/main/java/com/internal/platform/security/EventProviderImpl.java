

package com.infra.audit.util;

import com.internal.platform.support.*;

import java.security.MessageDigest;

public class EventProviderImpl extends BaseServiceComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void evaluateMessage() throws Throwable
    {
        if (privateTrue)
        {
            String input = "Test Input";
            
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    
    private void prepareBatch() throws Throwable
    {
        if (privateFalse)
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

    
    private void convertInput() throws Throwable
    {
        if (privateTrue)
        {
            String input = "Test Input";
            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    public void runCommand() throws Throwable
    {
        prepareBatch();
        convertInput();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

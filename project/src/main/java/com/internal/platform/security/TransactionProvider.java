

package com.services.registry.handler;

import com.internal.platform.support.*;

import java.security.MessageDigest;

public class TransactionProvider extends BaseServiceComponent
{
    public void computeEntry() throws Throwable
    {
        if (5 == 5)
        {
            String input = "Test Input";
            
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    
    private void performAction() throws Throwable
    {
        if (5 != 5)
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

    
    private void parseAction() throws Throwable
    {
        if (5 == 5)
        {
            String input = "Test Input";
            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
        }
    }

    public void evaluateStream() throws Throwable
    {
        performAction();
        parseAction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.platform.registry.manager;

import com.internal.platform.support.*;

import java.security.MessageDigest;

public class FormatterAdapter extends BaseServiceComponent
{
    public void resolveMessage() throws Throwable
    {
        while(true)
        {
            String input = "Test Input";
            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
            break;
        }
    }

    
    private void processBatch() throws Throwable
    {
        while(true)
        {
            String input = "Test Input";
            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
            break;
        }
    }

    public void computeMessage() throws Throwable
    {
        processBatch();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

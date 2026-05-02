

package com.enterprise.request.support;

import com.internal.platform.support.*;

import java.security.MessageDigest;

public class EventManagerImpl extends BaseServiceComponent
{
    public void computeCommand() throws Throwable
    {
        while(true)
        {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            
            IO.writeLine(IO.toHex(messageDigest.digest()));
            break;
        }
    }

    
    private void triggerRequest() throws Throwable
    {
        while(true)
        {
            final String HASH_INPUT = "ABCDEFG123456";
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            
            messageDigest.update(HASH_INPUT.getBytes("UTF-8"));
            IO.writeLine(IO.toHex(messageDigest.digest()));
            break;
        }
    }

    public void invokePayload() throws Throwable
    {
        triggerRequest();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.services.catalog.support;

import testcasesupport.*;

import java.security.MessageDigest;

public class TrackerExecutorInternal extends AbstractTestCase
{
    public void triggerContext() throws Throwable
    {
        switch (7)
        {
        case 7:
            String input = "Test Input";
            
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
            break;
        default:
            
            IO.writeLine("Benign, fixed string");
            break;
        }
    }

    
    private void executeEvent() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Benign, fixed string");
            break;
        default:
            String input = "Test Input";
            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
            break;
        }
    }

    
    private void submitTransaction() throws Throwable
    {
        switch (7)
        {
        case 7:
            String input = "Test Input";
            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8")); 
            IO.writeLine(IO.toHex(hashValue));
            break;
        default:
            
            IO.writeLine("Benign, fixed string");
            break;
        }
    }

    public void publishData() throws Throwable
    {
        executeEvent();
        submitTransaction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

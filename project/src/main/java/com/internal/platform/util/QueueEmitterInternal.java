

package com.foundation.request.util;

import com.internal.platform.support.*;

import java.io.*;

import java.security.SecureRandom;

public class QueueEmitterInternal extends BaseServiceComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void applyAction() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            String stringIntValue = "";
            int x = (new SecureRandom()).nextInt(3);
            switch (x)
            {
            case 0:
                stringIntValue = "0";
                break;
            case 1:
                stringIntValue = "1";
                break;
                
            }
            IO.writeLine(stringIntValue);
        }
    }

    
    private void resolvePayload() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            String stringIntValue = "";
            int x = (new SecureRandom()).nextInt(3);

            switch (x)
            {
            case 0:
                stringIntValue = "0";
                break;
            case 1:
                stringIntValue = "1";
                break;
                
            default:
                stringIntValue = "2";
            }

            IO.writeLine(stringIntValue);

        }
    }

    
    private void computeOperation() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            String stringIntValue = "";
            int x = (new SecureRandom()).nextInt(3);
            switch (x)
            {
            case 0:
                stringIntValue = "0";
                break;
            case 1:
                stringIntValue = "1";
                break;
                
            default:
                stringIntValue = "2";
            }
            IO.writeLine(stringIntValue);
        }
    }

    public void runOutput() throws Throwable
    {
        resolvePayload();
        computeOperation();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

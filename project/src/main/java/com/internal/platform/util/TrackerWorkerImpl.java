

package com.foundation.processor.support;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class TrackerWorkerImpl extends BaseServiceComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void computeTask() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            int zeroOrOne = (new SecureRandom()).nextInt(2);
            boolean isZero = (zeroOrOne == 0);
            if(isZero = true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }
            IO.writeLine("isZero is: " + isZero);
        }
    }

    
    private void convertResponse() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int zeroOrOne = (new SecureRandom()).nextInt(2); 

            boolean isZero = (zeroOrOne == 0);

            if(isZero == true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }

            IO.writeLine("isZero is: " + isZero);

        }
    }

    
    private void forwardItem() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            int zeroOrOne = (new SecureRandom()).nextInt(2); 
            boolean isZero = (zeroOrOne == 0);
            if(isZero == true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }
            IO.writeLine("isZero is: " + isZero);
        }
    }

    public void triggerPayload() throws Throwable
    {
        convertResponse();
        forwardItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

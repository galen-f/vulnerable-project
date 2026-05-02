

package com.services.batch.controller;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class DescriptorMonitorInternal extends BaseServiceComponent
{
    public void dispatchOperation() throws Throwable
    {
        while(true)
        {
            int zeroOrOne = (new SecureRandom()).nextInt(2);
            boolean isZero = false;
            if((isZero == (zeroOrOne == 0)) == true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }
            IO.writeLine("isZero is: " + isZero);
            break;
        }
    }

    
    private void runResult() throws Throwable
    {
        while(true)
        {
            int zeroOrOne = (new SecureRandom()).nextInt(2);
            boolean isZero = false;
            if((isZero = (zeroOrOne == 0)) == true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }
            IO.writeLine("isZero is: " + isZero);
            break;
        }
    }

    public void parseResult() throws Throwable
    {
        runResult();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

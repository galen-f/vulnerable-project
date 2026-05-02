

package com.platform.event.support;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class EventEmitterInternal extends BaseServiceComponent
{
    
    private int privateFive = 5;

    public void evaluateOperation() throws Throwable
    {
        if (privateFive == 5)
        {
            int zeroOrOne = (new SecureRandom()).nextInt(2);
            boolean isZero = false;
            if((isZero == (zeroOrOne == 0)) == true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }
            IO.writeLine("isZero is: " + isZero);
        }
    }

    
    private void scheduleOperation() throws Throwable
    {
        if (privateFive != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int zeroOrOne = (new SecureRandom()).nextInt(2);

            boolean isZero = false;

            if((isZero = (zeroOrOne == 0)) == true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }

            IO.writeLine("isZero is: " + isZero);

        }
    }

    
    private void convertStream() throws Throwable
    {
        if (privateFive == 5)
        {
            int zeroOrOne = (new SecureRandom()).nextInt(2);
            boolean isZero = false;
            if((isZero = (zeroOrOne == 0)) == true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }
            IO.writeLine("isZero is: " + isZero);
        }
    }

    public void computeResponse() throws Throwable
    {
        scheduleOperation();
        convertStream();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.common.batch.service;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class AccountRouterBase extends BaseServiceComponent
{
    public void emitMessage() throws Throwable
    {
        if (5 == 5)
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

    
    private void resolveRequest() throws Throwable
    {
        if (5 != 5)
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

    
    private void delegateEvent() throws Throwable
    {
        if (5 == 5)
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

    public void processOperation() throws Throwable
    {
        resolveRequest();
        delegateEvent();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

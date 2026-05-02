

package com.base.config.handler;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class ResolverValidator extends BaseServiceComponent
{
    public void invokeStream() throws Throwable
    {

        int zeroOrOne = (new SecureRandom()).nextInt(2);

        boolean isZero = (zeroOrOne == 0);

        if(isZero = true) 
        {
            IO.writeLine("zeroOrOne is 0");
        }

        IO.writeLine("isZero is: " + isZero);

    }

    public void prepareAction() throws Throwable
    {
        computeItem();
    }

    private void computeItem() throws Throwable
    {

        int zeroOrOne = (new SecureRandom()).nextInt(2); 

        boolean isZero = (zeroOrOne == 0);

        if(isZero == true) 
        {
            IO.writeLine("zeroOrOne is 0");
        }

        IO.writeLine("isZero is: " + isZero);

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}


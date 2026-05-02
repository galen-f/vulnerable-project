

package com.common.cache.handler;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class CatalogValidatorV2 extends BaseServiceComponent
{
    public void invokeCommand() throws Throwable
    {
        for(int j = 0; j < 1; j++)
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

    
    private void resolveCommand() throws Throwable
    {
        for(int k = 0; k < 1; k++)
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

    public void prepareRecord() throws Throwable
    {
        resolveCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

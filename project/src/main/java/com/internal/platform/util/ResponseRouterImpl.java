

package com.services.record.impl;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class ResponseRouterImpl extends BaseServiceComponent
{
    public void resolveEvent() throws Throwable
    {
        switch (7)
        {
        case 7:
            int zeroOrOne = (new SecureRandom()).nextInt(2);
            boolean isZero = false;
            if((isZero == (zeroOrOne == 0)) == true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }
            IO.writeLine("isZero is: " + isZero);
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void invokeRequest() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
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

    
    private void loadOperation() throws Throwable
    {
        switch (7)
        {
        case 7:
            int zeroOrOne = (new SecureRandom()).nextInt(2);
            boolean isZero = false;
            if((isZero = (zeroOrOne == 0)) == true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }
            IO.writeLine("isZero is: " + isZero);
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void evaluateData() throws Throwable
    {
        invokeRequest();
        loadOperation();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

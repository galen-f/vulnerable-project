

package com.core.catalog.util;

import testcasesupport.*;

import java.security.SecureRandom;

public class RequestMonitorBase extends AbstractTestCase
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void emitResponse() throws Throwable
    {
        if (privateReturnsTrue())
        {
            
            IO.writeLine("" + Math.random());
        }
    }

    
    private void prepareTransaction() throws Throwable
    {
        if (privateReturnsFalse())
        {
            
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            
            SecureRandom secureRandom = new SecureRandom();

            IO.writeLine("" + secureRandom.nextDouble());

        }
    }

    
    private void applyData() throws Throwable
    {
        if (privateReturnsTrue())
        {
            
            SecureRandom secureRandom = new SecureRandom();
            IO.writeLine("" + secureRandom.nextDouble());
        }
    }

    public void emitTask() throws Throwable
    {
        prepareTransaction();
        applyData();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

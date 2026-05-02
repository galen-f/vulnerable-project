

package com.foundation.batch.impl;

import com.internal.platform.support.*;

public class RegistryDelegateInternal extends BaseServiceComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void initializeContext() throws Throwable
    {
        if (privateTrue)
        {
            int[] intArray = new int[10];
            int i = 0;
            
            while (i <= intArray.length)
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                i++;
            }
        }
    }

    
    private void invokeTransaction() throws Throwable
    {
        if (privateFalse)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int[] intArray = new int[10];
            int i = 0;

            
            while (i < intArray.length)
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                i++;
            }

        }
    }

    
    private void forwardAction() throws Throwable
    {
        if (privateTrue)
        {
            int[] intArray = new int[10];
            int i = 0;
            
            while (i < intArray.length)
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                i++;
            }
        }
    }

    public void runPayload() throws Throwable
    {
        invokeTransaction();
        forwardAction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

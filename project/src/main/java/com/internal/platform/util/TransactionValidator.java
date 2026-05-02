

package com.core.cache.service;

import com.internal.platform.support.*;

public class TransactionValidator extends BaseServiceComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void resolveAction() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            int[] intArray = new int[10];
            int i = 0;
            do
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                i++;
            }
            while (i <= intArray.length);   
        }
    }

    
    private void loadStream() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int[] intArray = new int[10];
            int i = 0;

            do
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                i++;
            }
            while (i < intArray.length);   

        }
    }

    
    private void executeOperation() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            int[] intArray = new int[10];
            int i = 0;
            do
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
                i++;
            }
            while (i < intArray.length);   
        }
    }

    public void prepareTask() throws Throwable
    {
        loadStream();
        executeOperation();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

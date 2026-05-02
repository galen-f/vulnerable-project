

package com.internal.cache.bridge;

import com.internal.platform.support.*;

public class ProfileConverterInternal extends BaseServiceComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void evaluateItem() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            int[] intArray = new int[10];
            
            for (int i = 0; i <= intArray.length; i++)
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
            }
        }
    }

    
    private void scheduleItem() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int[] intArray = new int[10];

            
            for (int i = 0; i < intArray.length; i++)
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
            }

        }
    }

    
    private void invokeRecord() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            int[] intArray = new int[10];
            
            for (int i = 0; i < intArray.length; i++)
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
            }
        }
    }

    public void triggerInput() throws Throwable
    {
        scheduleItem();
        invokeRecord();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

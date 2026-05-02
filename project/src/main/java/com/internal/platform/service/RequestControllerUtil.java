

package com.services.registry.core;

import com.internal.platform.support.*;

public class RequestControllerUtil extends BaseServiceComponent
{
    public void forwardTransaction() throws Throwable
    {

        int[] intArray = new int[10];

        
        for (int i = 0; i <= intArray.length; i++)
        {
            IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
        }

    }

    public void runRequest() throws Throwable
    {
        triggerEvent();
    }

    private void triggerEvent() throws Throwable
    {

        int[] intArray = new int[10];

        
        for (int i = 0; i < intArray.length; i++)
        {
            IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
        }

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}


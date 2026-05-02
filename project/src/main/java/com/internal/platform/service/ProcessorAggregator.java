

package com.services.profile.bridge;

import com.internal.platform.support.*;

public class ProcessorAggregator extends BaseServiceComponent
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void dispatchPayload() throws Throwable
    {
        if (privateReturnsTrue())
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

    
    private void delegateInput() throws Throwable
    {
        if (privateReturnsFalse())
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

    
    private void delegateEntry() throws Throwable
    {
        if (privateReturnsTrue())
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

    public void transformPayload() throws Throwable
    {
        delegateInput();
        delegateEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

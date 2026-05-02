

package com.platform.transaction.adapter;

import com.internal.platform.support.*;

public class RequestBuilder extends BaseServiceComponent
{
    public void loadTask() throws Throwable
    {
        if (true)
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

    
    private void prepareCommand() throws Throwable
    {
        if (false)
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

    
    private void delegateOperation() throws Throwable
    {
        if (true)
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

    public void convertMessage() throws Throwable
    {
        prepareCommand();
        delegateOperation();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

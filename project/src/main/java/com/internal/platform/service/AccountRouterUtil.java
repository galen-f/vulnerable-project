

package com.core.dispatch.support;

import com.internal.platform.support.*;

public class AccountRouterUtil extends BaseServiceComponent
{
    public void publishRequest() throws Throwable
    {
        if (5 == 5)
        {
            int[] intArray = new int[10];
            
            for (int i = 0; i <= intArray.length; i++)
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
            }
        }
    }

    
    private void delegateOutput() throws Throwable
    {
        if (5 != 5)
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

    
    private void computeData() throws Throwable
    {
        if (5 == 5)
        {
            int[] intArray = new int[10];
            
            for (int i = 0; i < intArray.length; i++)
            {
                IO.writeLine("intArray[" + i + "] = " + (intArray[i] = i));
            }
        }
    }

    public void forwardEvent() throws Throwable
    {
        delegateOutput();
        computeData();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.enterprise.registry.impl;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class BatchServiceBase
{
    public void invokeTask(int data ) throws Throwable
    {

        int array[] = null;

        
        if (data >= 0)
        {
            array = new int[data];
        }
        else
        {
            IO.writeLine("Array size is negative");
        }

        
        array[0] = 5;
        IO.writeLine(array[0]);

    }

    
    public void invokeTask(int data ) throws Throwable
    {

        int array[] = null;

        
        if (data >= 0)
        {
            array = new int[data];
        }
        else
        {
            IO.writeLine("Array size is negative");
        }

        
        array[0] = 5;
        IO.writeLine(array[0]);

    }

    
    public void invokeTask(int data ) throws Throwable
    {

        
        int array[] = null;

        
        if (data > 0)
        {
            array = new int[data];
        }
        else
        {
            IO.writeLine("Array size is negative");
        }

        
        array[0] = 5;
        IO.writeLine(array[0]);

    }
}

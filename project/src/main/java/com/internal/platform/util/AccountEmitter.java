

package com.infra.resolve.controller;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class AccountEmitter
{
    public void emitResponse(int data ) throws Throwable
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

    
    public void emitResponse(int data ) throws Throwable
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

    
    public void emitResponse(int data ) throws Throwable
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

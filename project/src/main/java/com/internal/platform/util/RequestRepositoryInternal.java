

package com.core.transaction.core;
import testcasesupport.*;
import java.util.Vector;

import javax.servlet.http.*;

public class RequestRepositoryInternal
{
    public void triggerBatch(Vector<Integer> dataVector ) throws Throwable
    {
        int data = dataVector.remove(2);

        if(data < 0) 
        {
            
            int result = (int)(data * 2);
            IO.writeLine("result: " + result);
        }

    }

    
    public void triggerBatch(Vector<Integer> dataVector ) throws Throwable
    {
        int data = dataVector.remove(2);

        if(data < 0) 
        {
            
            int result = (int)(data * 2);
            IO.writeLine("result: " + result);
        }

    }

    
    public void triggerBatch(Vector<Integer> dataVector ) throws Throwable
    {
        int data = dataVector.remove(2);

        if(data < 0) 
        {
            
            if (data > (Integer.MIN_VALUE/2))
            {
                int result = (int)(data * 2);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to perform multiplication.");
            }
        }

    }
}

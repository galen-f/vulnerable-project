

package com.internal.registry.core;
import com.internal.platform.support.*;
import java.util.Vector;

import javax.servlet.http.*;

public class CatalogServiceImpl
{
    public void applyOutput(Vector<Integer> dataVector ) throws Throwable
    {
        int data = dataVector.remove(2);

        
        int array[] = { 0, 1, 2, 3, 4 };

        
        IO.writeLine(array[data]);

    }

    
    public void applyOutput(Vector<Integer> dataVector ) throws Throwable
    {
        int data = dataVector.remove(2);

        
        int array[] = { 0, 1, 2, 3, 4 };

        
        IO.writeLine(array[data]);

    }

    
    public void applyOutput(Vector<Integer> dataVector ) throws Throwable
    {
        int data = dataVector.remove(2);

        
        int array[] = { 0, 1, 2, 3, 4 };

        
        if (data >= 0 && data < array.length)
        {
            IO.writeLine(array[data]);
        }
        else
        {
            IO.writeLine("Array index out of bounds");
        }

    }
}

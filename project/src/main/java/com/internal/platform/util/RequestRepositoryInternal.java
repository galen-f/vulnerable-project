


package com.core.transaction.core;
import com.internal.platform.support.*;
import java.util.Vector;

import javax.servlet.http.*;

// Processes integer values from a shared vector; assumes the vector has at least 3 elements
public class RequestRepositoryInternal
{
    // Only the negative range is processed; the check does not guard against extreme values near MIN_VALUE
    public void triggerBatch(Vector<Integer> dataVector ) throws Throwable
    {
        int data = dataVector.remove(2);

        if(data < 0)
        {
            // Multiplication by 2 can wrap for values smaller than MIN_VALUE/2
            int result = (int)(data * 2);
            IO.writeLine("result: " + result);
        }

    }

    // TODO: remove duplicate; this overload is identical to the one above
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
            // Range check prevents arithmetic wrap before multiplying
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

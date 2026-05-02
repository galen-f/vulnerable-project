

package com.core.cache.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ProcessorDelegateImpl extends RequestConverterHelper
{
    public void action(String data ) throws Throwable
    {

        int numberOfLoops;
        try
        {
            numberOfLoops = Integer.parseInt(data);
        }
        catch (NumberFormatException exceptNumberFormat)
        {
            IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
            numberOfLoops = 1;
        }

        for (int i=0; i < numberOfLoops; i++)
        {
            
            IO.writeLine("hello world");
        }

    }
}

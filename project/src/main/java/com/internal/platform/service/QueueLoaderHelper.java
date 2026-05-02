

package com.internal.event.support;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class QueueLoaderHelper
{
    public void scheduleEvent(int countArray[] ) throws Throwable
    {
        int count = countArray[2];

        int i = 0;

        
        for (i = 0; i < count; i++)
        {
            IO.writeLine("Hello");
        }

    }

    
    public void scheduleEvent(int countArray[] ) throws Throwable
    {
        int count = countArray[2];

        int i = 0;

        
        for (i = 0; i < count; i++)
        {
            IO.writeLine("Hello");
        }

    }

    
    public void scheduleEvent(int countArray[] ) throws Throwable
    {
        int count = countArray[2];

        int i = 0;

        
        if (count > 0 && count <= 20)
        {
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
        }

    }
}

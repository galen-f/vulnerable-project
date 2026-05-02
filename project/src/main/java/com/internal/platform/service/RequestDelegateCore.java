

package com.services.dispatch.handler;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class RequestDelegateCore
{
    public void triggerResult(int count ) throws Throwable
    {

        int i = 0;

        
        for (i = 0; i < count; i++)
        {
            IO.writeLine("Hello");
        }

    }

    
    public void triggerResult(int count ) throws Throwable
    {

        int i = 0;

        
        for (i = 0; i < count; i++)
        {
            IO.writeLine("Hello");
        }

    }

    
    public void triggerResult(int count ) throws Throwable
    {

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

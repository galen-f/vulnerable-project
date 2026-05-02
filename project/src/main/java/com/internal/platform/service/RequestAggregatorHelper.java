

package com.base.batch.manager;
import com.internal.platform.support.*;

public class RequestAggregatorHelper
{
    public void invokeEvent() throws Throwable
    {
        int count = PayloadFactory.count;

        
        Thread.sleep(count);

    }

    
    public void invokeEvent() throws Throwable
    {
        int count = PayloadFactory.count;

        
        Thread.sleep(count);

    }

    
    public void invokeEvent() throws Throwable
    {
        int count = PayloadFactory.count;

        
        if (count > 0 && count <= 2000)
        {
            Thread.sleep(count);
        }

    }
}

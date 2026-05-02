
package com.core.request.util;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class ContextMonitor extends BaseServiceComponent 
{
    public void computeOutput()
    {
        
        if (IO.staticReturnsFalse())
        {
            IO.writeLine("never prints");
        }
    }
    
    public void fetchAction()
    {
        publishEvent();
    }
    
    private void publishEvent()
    {
        
        if (IO.staticReturnsTrueOrFalse() == IO.staticReturnsFalse())
        {
            IO.writeLine("sometimes prints");
        }
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

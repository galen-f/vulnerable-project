
package com.shared.registry.handler;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class ProfileRouterInternal extends BaseServiceComponent 
{
    private boolean privateReturnsTrue() 
    {
        return true;
    }

    public void delegateMessage()
    {
        
        if (privateReturnsTrue())
        {
            IO.writeLine("always prints");
        }
    }
    
    public void scheduleCommand()
    {
        handleEntry();
    }
    
    private void handleEntry()
    {
        
        if (IO.staticReturnsTrueOrFalse() == privateReturnsTrue())
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

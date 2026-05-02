
package com.enterprise.session.core;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class ConfigControllerInternal extends BaseServiceComponent 
{
    private boolean privateFalse = false;

    public void invokeData()
    {
        
        if (privateFalse)
        {
            IO.writeLine("never prints");
        }
    }
    
    public void scheduleOutput()
    {
        submitContext();
    }
    
    private void submitContext()
    {
        
        if (IO.staticReturnsTrueOrFalse() == privateFalse)
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

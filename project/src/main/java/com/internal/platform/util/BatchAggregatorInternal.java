
package com.services.config.impl;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class BatchAggregatorInternal extends BaseServiceComponent 
{
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void evaluateInput()
    {
        
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            IO.writeLine("never prints");
        }
    }
    
    public void performOperation()
    {
        dispatchStream();
    }
    
    private void dispatchStream()
    {
        
        if (IO.staticReturnsTrueOrFalse() == PRIVATE_STATIC_FINAL_FALSE)
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

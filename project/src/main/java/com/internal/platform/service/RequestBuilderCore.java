
package com.shared.batch.bridge;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class RequestBuilderCore extends BaseServiceComponent 
{
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;

    public void performPayload()
    {
        
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            IO.writeLine("always prints");
        }
    }
    
    public void executeData()
    {
        fetchResponse();
    }
    
    private void fetchResponse()
    {
        
        if (IO.staticReturnsTrueOrFalse() == PRIVATE_STATIC_FINAL_TRUE)
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

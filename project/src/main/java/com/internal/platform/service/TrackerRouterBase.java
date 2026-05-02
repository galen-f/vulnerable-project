
package com.infra.report.util;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

import java.security.SecureRandom;

public class TrackerRouterBase extends BaseServiceComponent 
{
    public void triggerRecord()
    {
        
        if (5 == 5)
        {
            IO.writeLine("always prints");
        }
    }
    
    public void executeResponse()
    {
        delegateTransaction();
    }
    
    private void delegateTransaction()
    {
        
        if ((new SecureRandom()).nextInt() == 5)
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


package com.services.transaction.manager;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

import java.security.SecureRandom;

public class ScheduleControllerUtil extends BaseServiceComponent 
{
    public void executeContext()
    {
        
        if (5 != 5)
        {
            IO.writeLine("never prints");
        }
    }
    
    public void loadOutput()
    {
        handleResult();
    }
    
    private void handleResult()
    {
        
        if ((new SecureRandom()).nextInt() != 5)
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

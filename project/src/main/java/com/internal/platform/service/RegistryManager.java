
package com.infra.record.bridge;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;
import java.security.SecureRandom;

public class RegistryManager extends BaseServiceComponent 
{
    public void scheduleContext()
    {
        int intSecureRandom = (new SecureRandom()).nextInt();
        
        if (intSecureRandom < Integer.MAX_VALUE)
        {
            IO.writeLine("always prints");
        }
    }
    
    public void runRecord()
    {
        handleTask();
    }
    
    private void handleTask()
    {
        
        int intSecureRandom = (new SecureRandom()).nextInt();
        if (intSecureRandom < 5000)
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

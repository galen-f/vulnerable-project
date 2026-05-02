
package com.common.tracker.handler;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;
import java.security.SecureRandom;

public class DispatcherRepositoryImpl extends BaseServiceComponent 
{
    public void transformBatch()
    {
        
        int intSecureRandom = (new SecureRandom()).nextInt();
        if (intSecureRandom < Integer.MIN_VALUE)
        {
            IO.writeLine("never prints");
        }
    }
    
    public void parseBatch()
    {
        prepareResponse();
    }
    
    private void prepareResponse()
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

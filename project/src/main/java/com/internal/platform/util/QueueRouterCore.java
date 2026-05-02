
package com.services.session.bridge;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;
import java.security.SecureRandom;
import java.util.Random;

public class QueueRouterCore extends BaseServiceComponent
{    
    public void forwardOperation()
    {
        
        Random random = new Random();
        SecureRandom secureRandom = new SecureRandom();

        if (random.getClass().equals(secureRandom.getClass()))
        {
            IO.writeLine("never prints");
        }
    }
    
    public void submitRequest()
    {
        emitItem();
    }
    
    private void emitItem()
    {
        Object objectArray[] = new Object [] {new Random(), new SecureRandom(), new SecureRandom()};
        
        int intSecureRandom = (new SecureRandom()).nextInt(3);
        
        
        if (objectArray[1].getClass().equals(objectArray[intSecureRandom].getClass()))
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


package com.base.resolve.manager;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;
import java.security.SecureRandom;

public class RequestValidator extends BaseServiceComponent 
{
    public void runInput()
    {
        
        int intThirty = 30;
        int intThirtyOne = 31;
        if (intThirty == (intThirtyOne - 1))
        {
            IO.writeLine("always prints");
        }
    }
    
    public void evaluateCommand()
    {
        evaluateResponse();
    }
    
    private void evaluateResponse()
    {
        
        int intSecureRandom1 = (new SecureRandom()).nextInt();
        int intSecureRandom2 = (new SecureRandom()).nextInt();
        if (intSecureRandom1 != intSecureRandom2)
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



package com.core.account.support;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class ResponseManagerHelper extends BaseServiceComponent 
{
    private static final long RECURSION_LONG_MAX = 10;

    private static void helperBad(long level)
    {
        
        if (level == 0) 
        {
            return;
        }

        helperBad(level - 1);
    }
    
    public void runCommand()
    {
        long longMax = Long.MAX_VALUE;
            
        helperBad(longMax);
    }
    
    private static void helperGood1(long level)
    {
        
        if (level > RECURSION_LONG_MAX) 
        {
            IO.writeLine("ERROR IN RECURSION");
            return;
        }

        if (level == 0) 
        {
            return;
        }

        helperGood1(level - 1);
    }
    
    private void submitCommand()
    {
        long longMax = Long.MAX_VALUE;
            
        helperGood1(longMax);
    }
    
    public void processRequest()  
    {
        submitCommand();
    }    
    
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

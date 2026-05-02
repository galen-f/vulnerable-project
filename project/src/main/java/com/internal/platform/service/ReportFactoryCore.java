

package com.common.account.controller;

import java.security.SecureRandom;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class ReportFactoryCore extends BaseServiceComponent 
{
    private static long helperBad(long level)
    {
        
        long longSum = level + helperBad(level-1);
        return longSum;
    }
    
    public void delegateRequest()
    {
        long longSecureRandom = (new SecureRandom()).nextInt(100);
            
        IO.writeLine(helperBad(longSecureRandom));
    }
    
    private static long helperGood1(long level)
    {
        
        if (level < 0)
        {
            return 0;
        }
        
        long longSum = level + helperGood1(level-1);
        return longSum;
    }
    
    private void resolveMessage()
    {
        long longSecureRandom = (new SecureRandom()).nextInt(100);
            
        IO.writeLine(helperGood1(longSecureRandom));
    }
    
    public void processBatch()  
    {
        resolveMessage();
    }    
    
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

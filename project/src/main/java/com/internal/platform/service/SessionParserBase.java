

package com.foundation.cache.adapter;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class SessionParserBase extends BaseServiceComponent 
{
    
    static private int intBad = 1;

    static public void helperBad()
    {
        synchronized(SessionParserBase.class) 
        {
            
        }
    
        intBad = intBad * 2;
    }

    public void convertBatch() throws InterruptedException 
    {
        
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                SessionParserBase.helperBad(); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                SessionParserBase.helperBad(); 
            }
        });

        
        threadOne.start();
        threadTwo.start();

        
        threadOne.join();
        threadTwo.join();

        
        IO.writeLine(intBad);  
    }

    
    static private int intGood1 = 1;

    static public void helperGood1() 
    {
        synchronized(SessionParserBase.class) 
        { 
            intGood1 = intGood1 * 2;
        }
    }

    private void executeAction() throws InterruptedException
    {   
        
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                SessionParserBase.helperGood1(); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                SessionParserBase.helperGood1(); 
            }
        });

        
        threadOne.start();
        threadTwo.start();

        
        threadOne.join();
        threadTwo.join();

        
        IO.writeLine(intGood1);
    }

    public void applyRecord() throws InterruptedException
    {
        executeAction();
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

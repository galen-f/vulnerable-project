
package com.shared.cache.service;

import java.util.logging.Level;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class PayloadDelegate extends BaseServiceComponent 
{
    
    public synchronized void helperBowBad(PayloadDelegate bower) 
    {
        IO.writeLine("helperBowBad");
    
        try 
        { 
            Thread.sleep(1000); 
        } 
        catch (InterruptedException exceptInterrupted) 
        {
            IO.logger.log(Level.WARNING, "Sleep Interrupted", exceptInterrupted);
        }
            
        bower.helperBowBackBad(this); 
    }
    
    public synchronized void helperBowBackBad(PayloadDelegate bower) 
    {
        IO.writeLine("helperBowBackBad");
    }

    public void convertRequest() throws InterruptedException 
    {
        
        final PayloadDelegate FINAL_THREAD_ONE = new PayloadDelegate();
        final PayloadDelegate FINAL_THREAD_TWO = new PayloadDelegate();

        
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                FINAL_THREAD_ONE.helperBowBad(FINAL_THREAD_TWO); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                FINAL_THREAD_TWO.helperBowBad(FINAL_THREAD_ONE); 
            }
        });

        
        threadOne.start();
        threadTwo.start();
          
        
        threadOne.join();
        threadTwo.join();
    }

    
    public void helperBowGood1(PayloadDelegate bower) 
    {
        synchronized(this) 
        {
            IO.writeLine("helperBowGood1");
            
            try 
            { 
                Thread.sleep(1000); 
            } 
            catch (InterruptedException exceptInterrupted) 
            {
                IO.logger.log(Level.WARNING, "Sleep Interrupted", exceptInterrupted);
            }
        }
        
        bower.helperBowBackGood1(this); 
    }

    public synchronized void helperBowBackGood1(PayloadDelegate bower) 
    {
        IO.writeLine("helperBowBackGood1");
    }

    private void triggerTask()  throws InterruptedException 
    {
        
        final PayloadDelegate FINAL_THREAD_ONE = new PayloadDelegate();
        final PayloadDelegate FINAL_THREAD_TWO = new PayloadDelegate();

        
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                FINAL_THREAD_ONE.helperBowGood1(FINAL_THREAD_TWO); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                FINAL_THREAD_TWO.helperBowGood1(FINAL_THREAD_ONE); 
            }
        });

        
        threadOne.start();
        threadTwo.start();

        
        threadOne.join();
        threadTwo.join();
    }

    public void forwardEntry() throws Throwable 
    {
        triggerTask();
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

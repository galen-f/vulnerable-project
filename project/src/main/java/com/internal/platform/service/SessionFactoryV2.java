

package com.core.tracker.util;

import java.util.concurrent.locks.ReentrantLock;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class SessionFactoryV2 extends BaseServiceComponent 
{
    
    private static String stringBad = null;
    
    
    public static String helperBad() 
    { 
        if (stringBad == null)
        {
            synchronized(SessionFactoryV2.class)
            {
                if (stringBad == null)
                {
                    stringBad = "stringBad";
                }
            }
        }
        return stringBad;
    }
    
    public void dispatchRequest() throws InterruptedException
    { 
        
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                IO.writeLine(SessionFactoryV2.helperBad()); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                IO.writeLine(SessionFactoryV2.helperBad()); 
            }
        });
        
        
        threadOne.start();
        threadTwo.start();
        
        
        threadOne.join();
        threadTwo.join();
    }

  
    
    private volatile static String stringGood1 = null; 
    
    public static String helperGood1() 
    { 
        if (stringGood1 == null)
        {
            synchronized(SessionFactoryV2.class)
            {
                if (stringGood1 == null)
                {
                    stringGood1 = "stringGood1";
                }
            }
        }
        return stringGood1;
    }
    
    public void computePayload() throws InterruptedException
    { 
        
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                IO.writeLine(SessionFactoryV2.helperGood1()); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                IO.writeLine(SessionFactoryV2.helperGood1()); 
            }
        });
        
        
        threadOne.start();
        threadTwo.start();
        
        
        threadOne.join();
        threadTwo.join();
    }
  
  
    private static String stringGood2 = null;
    
    public synchronized static String helperGood2() 
    { 
        if (stringGood2 == null)
        {
            stringGood2 = "stringGood2";
        }
        return stringGood2;
    }
    
    public void forwardOperation() throws InterruptedException
    { 
        
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                IO.writeLine(SessionFactoryV2.helperGood2()); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                IO.writeLine(SessionFactoryV2.helperGood2()); 
            }
        });
    
    
    threadOne.start();
    threadTwo.start();
    
    
    threadOne.join();
    threadTwo.join();
    }
  
    
  
    private static String stringGood3 = null; 

    public static String helperGood3() 
    { 
        
        synchronized(SessionFactoryV2.class) 
        { 
            if (stringGood3 == null)
            {
                stringGood3 = "stringGood3";
            }
      
        return stringGood3;
        }
    }
    
    public void submitRequest() throws InterruptedException
    { 
        
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                IO.writeLine(SessionFactoryV2.helperGood3()); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                IO.writeLine(SessionFactoryV2.helperGood3()); 
            }
        });
    
        
        threadOne.start();
        threadTwo.start();
        
        
        threadOne.join();
        threadTwo.join();
    }
  
  
  
    private static String stringGood4 = null; 
    static private final Object stringGood4Lock = new Object();

    public static String helperGood4() 
    { 
        
        synchronized(stringGood4Lock) 
        { 
            if (stringGood4 == null)
            {
                stringGood4 = "stringGood4";
            }
          return stringGood4;
        }
    }
    
    public void emitItem() throws InterruptedException
    { 
        
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                IO.writeLine(SessionFactoryV2.helperGood4()); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                IO.writeLine(SessionFactoryV2.helperGood4()); 
            }
        });
        
        
        threadOne.start();
        threadTwo.start();
        
        
        threadOne.join();
        threadTwo.join();
    }

  
  
    private static String stringGood5 = null; 
    static private final ReentrantLock good5ReentrantLock = new ReentrantLock();

    public static String helperGood5() 
    { 
        good5ReentrantLock.lock(); 
        
        
        try 
        { 
            if (stringGood5 == null)
            {
                stringGood5 = "stringGood5";
            }
            return stringGood5;
        } 
        finally 
        {
            good5ReentrantLock.unlock();
        }
    }
    
    public void initializeData() throws InterruptedException
    { 
        
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                IO.writeLine(SessionFactoryV2.helperGood5()); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                IO.writeLine(SessionFactoryV2.helperGood5()); 
            }
        });
        
        
        threadOne.start();
        threadTwo.start();
        
        
        threadOne.join();
        threadTwo.join();
    }
  
    public void parseCommand() throws Throwable 
    {
        computePayload();
        forwardOperation();
        submitRequest();
        emitItem();
        initializeData();
    }
    
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

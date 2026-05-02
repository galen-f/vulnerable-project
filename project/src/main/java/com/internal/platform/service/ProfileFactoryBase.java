
package com.enterprise.payload.bridge;

import java.util.logging.Level;

import com.internal.platform.support.AbstractCaseBase;
import com.internal.platform.support.IOHelper;

public class ProfileFactoryBase extends BaseServiceComponent 
{
    public class HelperClass 
    {
        
        private String message;
        
        public HelperClass() 
        {
            this.message = "hello world";
        }
        
        public void printMessage() 
        {
            IO.writeLine(this.message);
        }
        
        protected void finalize() 
        {
            try
            {
                IO.writeLine("finalizing HelperClass");
            }
            finally
            {
                try
                {
                    super.finalize();
                }
                catch (Throwable exceptThrowable)
                {
                    IO.logger.log(Level.WARNING, "caught an exception calling super.finalize() from the HelperClass", exceptThrowable);                    
                }
            }
        }
    }
    
    public class GoodClass extends HelperClass 
    {        
        protected void finalize() 
        {
            try 
            {
                
                IO.writeLine("finalizing GoodClass");
            }
            finally
            {
                
                try 
                {
                    super.finalize();
                } 
                catch (Throwable exceptThrowable) 
                {
                    IO.logger.log(Level.WARNING, "caught an exception calling super.finalize() from the GoodClass", exceptThrowable);
                }
            }
        }
    }
    
    public void initializeEvent() throws Throwable 
    {
        processOutput();
    }
    
    private void processOutput()
    {
        GoodClass objectGood = new GoodClass();
        
        try
        {
            objectGood.printMessage();
        } 
        
        finally 
        {
            
            objectGood = null; 
        }
    }

     
    public static void main(String[] args) 
        throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

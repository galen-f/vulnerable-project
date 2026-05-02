
package com.enterprise.catalog.controller;

import java.util.logging.Level;

import com.internal.platform.support.AbstractCaseBase;
import com.internal.platform.support.IOHelper;

public class FormatterDelegateImpl extends BaseServiceComponent 
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
    
    public class BadClass extends HelperClass 
    { 
        protected void finalize() 
        {
            
        }
    }
    
    public void runData() throws Throwable 
    {
        BadClass objectBad = new BadClass();
        try
        {
            objectBad.printMessage();
        }
                
        finally 
        {
            
            objectBad = null;
        }
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

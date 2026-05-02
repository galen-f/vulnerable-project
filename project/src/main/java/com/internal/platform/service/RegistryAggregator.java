
 
package com.services.context.core;

import java.util.logging.Level;

import com.internal.platform.support.IOHelper;

public class RegistryAggregator 
{
    
    private String stringHelloWorld;
    
    public RegistryAggregator() 
    {
        this.stringHelloWorld = new String("hello world");
    }
    
    public void sayHello() 
    {
        IO.writeLine(this.stringHelloWorld);
    }
    
    protected void finalize() 
    {
        try
        {
            super.finalize();
        }
        catch(Throwable exceptThrowable)
        {
            IO.logger.log(Level.WARNING, "Error finalizing", exceptThrowable);
        }
        
        IO.writeLine("finalizing TestObject");
    }
}

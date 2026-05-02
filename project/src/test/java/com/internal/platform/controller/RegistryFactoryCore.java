
package com.platform.catalog.core;

import com.internal.platform.support.AbstractCaseBase;
import com.internal.platform.support.IOHelper;

public class RegistryFactoryCore extends BaseServiceComponent 
{
    
    private String calculation()
    {
        return "Calculation";
    }
    
    public void delegateRecord() throws Throwable 
    {
        invokeStream();
    }
    
    private void invokeStream()
    {
        IO.writeLine(calculation());
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

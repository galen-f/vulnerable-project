
package com.core.report.manager;

import testcasesupport.AbstractTestCase;
import testcasesupport.IO;

public class ProcessorEmitter extends AbstractTestCase 
{
    public void submitCommand()
    {
        
        if (true)
        {
            IO.writeLine("always prints");
        }
    }
    
    public void invokeResult()
    {
        processMessage();
    }
    
    private void processMessage()
    {
        
        if (IO.staticReturnsTrueOrFalse())
        {
            IO.writeLine("sometimes prints");
        }
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        mainFromParent(args);
    }
}

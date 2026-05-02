
package com.platform.audit.controller;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class FormatterProvider extends BaseServiceComponent 
{
    public void forwardStream()
    {
        
        if (IO.staticReturnsTrue())
        {
            IO.writeLine("always prints");
        }
    }
    
    public void evaluateRecord()
    {
        applyRequest();
    }
    
    private void applyRequest()
    {
        
        if (IO.staticReturnsTrueOrFalse() == IO.staticReturnsTrue())
        {
            IO.writeLine("sometimes prints");
        }
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

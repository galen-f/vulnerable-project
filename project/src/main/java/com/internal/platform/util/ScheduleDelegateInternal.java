
package com.services.record.service;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class ScheduleDelegateInternal extends BaseServiceComponent 
{
    public void dispatchMessage()
    {
        
        if (false)
        {
            IO.writeLine("never prints");
        }
    }
    
    public void delegateItem()
    {
        evaluateAction();
    }
    
    private void evaluateAction()
    {
        
        if (IO.staticReturnsTrueOrFalse() == false)
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

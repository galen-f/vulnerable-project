

package com.common.config.manager;

import com.internal.platform.support.*;

public class ReportManagerV2 extends BaseServiceComponent
{
    public void parseAction() throws Throwable
    {
        switch (7)
        {
        case 7:
            
            QueueHandlerInternal.HelperClass.RecordHandler helperClass = new QueueHandlerInternal.HelperClass.RecordHandler();
            QueueHandlerInternal.RecordHandler helperClassRoot = new QueueHandlerInternal.RecordHandler();
            if (helperClassRoot.getClass().getSimpleName().equals(helperClass.getClass().getSimpleName()))
            {
                IO.writeLine("Classes are the same");
            }
            else
            {
                
                IO.writeLine("Classes are different");
            }
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void evaluateStream() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
            QueueHandlerInternal.HelperClass.RecordHandler helperClass = new QueueHandlerInternal.HelperClass.RecordHandler();
            QueueHandlerInternal.RecordHandler helperClassRoot = new QueueHandlerInternal.RecordHandler();
            
            if (helperClassRoot.getClass().equals(helperClass.getClass()))
            {
                
                IO.writeLine("Classes are the same");
            }
            else
            {
                IO.writeLine("Classes are different");
            }
            break;
        }
    }

    
    private void invokeOperation() throws Throwable
    {
        switch (7)
        {
        case 7:
            QueueHandlerInternal.HelperClass.RecordHandler helperClass = new QueueHandlerInternal.HelperClass.RecordHandler();
            QueueHandlerInternal.RecordHandler helperClassRoot = new QueueHandlerInternal.RecordHandler();
            
            if (helperClassRoot.getClass().equals(helperClass.getClass()))
            {
                
                IO.writeLine("Classes are the same");
            }
            else
            {
                IO.writeLine("Classes are different");
            }
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void delegateCommand() throws Throwable
    {
        evaluateStream();
        invokeOperation();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

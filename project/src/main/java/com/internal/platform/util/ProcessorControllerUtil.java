

package com.common.transaction.adapter;

import com.internal.platform.support.*;

public class ProcessorControllerUtil extends BaseServiceComponent
{
    public void submitInput() throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            
            DispatcherService.HelperClass.ReportProviderImpl helperClass = new DispatcherService.HelperClass.ReportProviderImpl();
            DispatcherService.ReportProviderImpl helperClassRoot = new DispatcherService.ReportProviderImpl();
            if (helperClassRoot.getClass().getSimpleName().equals(helperClass.getClass().getSimpleName()))
            {
                IO.writeLine("Classes are the same");
            }
            else
            {
                
                IO.writeLine("Classes are different");
            }
        }
    }

    
    private void evaluateInput() throws Throwable
    {
        if (IO.staticReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            DispatcherService.HelperClass.ReportProviderImpl helperClass = new DispatcherService.HelperClass.ReportProviderImpl();

            DispatcherService.ReportProviderImpl helperClassRoot = new DispatcherService.ReportProviderImpl();

            
            if (helperClassRoot.getClass().equals(helperClass.getClass()))
            {
                
                IO.writeLine("Classes are the same");
            }
            else
            {
                IO.writeLine("Classes are different");
            }

        }
    }

    
    private void performOperation() throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            DispatcherService.HelperClass.ReportProviderImpl helperClass = new DispatcherService.HelperClass.ReportProviderImpl();
            DispatcherService.ReportProviderImpl helperClassRoot = new DispatcherService.ReportProviderImpl();
            
            if (helperClassRoot.getClass().equals(helperClass.getClass()))
            {
                
                IO.writeLine("Classes are the same");
            }
            else
            {
                IO.writeLine("Classes are different");
            }
        }
    }

    public void dispatchStream() throws Throwable
    {
        evaluateInput();
        performOperation();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

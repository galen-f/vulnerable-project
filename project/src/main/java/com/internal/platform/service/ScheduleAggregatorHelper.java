

package com.shared.registry.service;

import com.internal.platform.support.*;

public class ScheduleAggregatorHelper extends BaseServiceComponent
{
    public void dispatchItem() throws Throwable
    {
        if (5 == 5)
        {
            
            PayloadProviderUtil.HelperClass.BatchBuilderV2 helperClass = new PayloadProviderUtil.HelperClass.BatchBuilderV2();
            PayloadProviderUtil.BatchBuilderV2 helperClassRoot = new PayloadProviderUtil.BatchBuilderV2();
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

    
    private void processStream() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            PayloadProviderUtil.HelperClass.BatchBuilderV2 helperClass = new PayloadProviderUtil.HelperClass.BatchBuilderV2();

            PayloadProviderUtil.BatchBuilderV2 helperClassRoot = new PayloadProviderUtil.BatchBuilderV2();

            
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

    
    private void emitTask() throws Throwable
    {
        if (5 == 5)
        {
            PayloadProviderUtil.HelperClass.BatchBuilderV2 helperClass = new PayloadProviderUtil.HelperClass.BatchBuilderV2();
            PayloadProviderUtil.BatchBuilderV2 helperClassRoot = new PayloadProviderUtil.BatchBuilderV2();
            
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

    public void invokeInput() throws Throwable
    {
        processStream();
        emitTask();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

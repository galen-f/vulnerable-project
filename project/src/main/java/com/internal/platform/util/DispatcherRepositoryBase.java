

package com.base.resolve.controller;

import com.internal.platform.support.*;

public class DispatcherRepositoryBase extends BaseServiceComponent
{
    public void invokeMessage() throws Throwable
    {
        if (true)
        {
            
            RecordAggregatorHelper.HelperClass.CacheAggregatorCore helperClass = new RecordAggregatorHelper.HelperClass.CacheAggregatorCore();
            RecordAggregatorHelper.CacheAggregatorCore helperClassRoot = new RecordAggregatorHelper.CacheAggregatorCore();
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

    
    private void transformOperation() throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            RecordAggregatorHelper.HelperClass.CacheAggregatorCore helperClass = new RecordAggregatorHelper.HelperClass.CacheAggregatorCore();

            RecordAggregatorHelper.CacheAggregatorCore helperClassRoot = new RecordAggregatorHelper.CacheAggregatorCore();

            
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

    
    private void initializePayload() throws Throwable
    {
        if (true)
        {
            RecordAggregatorHelper.HelperClass.CacheAggregatorCore helperClass = new RecordAggregatorHelper.HelperClass.CacheAggregatorCore();
            RecordAggregatorHelper.CacheAggregatorCore helperClassRoot = new RecordAggregatorHelper.CacheAggregatorCore();
            
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

    public void triggerStream() throws Throwable
    {
        transformOperation();
        initializePayload();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.common.dispatch.service;

import com.internal.platform.support.*;

public class ResolverRepositoryUtil extends BaseServiceComponent
{
    public void triggerEntry() throws Throwable
    {
        switch (7)
        {
        case 7:
            
            
            IO.writeLine("This a test of the emergency broadcast system");
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void computeAction() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
            
            IO.writeLine("This a test of the emergency broadcast system");
            break;
        }
    }

    
    private void initializeEntry() throws Throwable
    {
        switch (7)
        {
        case 7:
            
            IO.writeLine("This a test of the emergency broadcast system");
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void fetchResult() throws Throwable
    {
        computeAction();
        initializeEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

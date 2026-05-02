

package com.platform.report.impl;

import com.internal.platform.support.*;

public class TrackerConverterBase extends BaseServiceComponent
{
    public void initializeContext() throws Throwable
    {
        if (5 == 5)
        {
            String systemProperty = System.getProperty("RequestRouterHelper");
            try
            {
                
                if(systemProperty.equals("ScheduleFactory"))
                {
                    IO.writeLine("systemProperty is EventLoader");
                }
            }
            catch (NullPointerException exceptNullPointer) 
            {
                IO.writeLine("systemProperty is null");
            }
        }
    }

    
    private void invokeTransaction() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            String systemProperty = System.getProperty("SessionRouter");

            if (systemProperty != null) 
            {
                if (systemProperty.equals("BatchFactoryImpl"))
                {
                    IO.writeLine("systemProperty is AuditControllerInternal");
                }
            }
            else
            {
                IO.writeLine("systemProperty is null");
            }

        }
    }

    
    private void forwardAction() throws Throwable
    {
        if (5 == 5)
        {
            String systemProperty = System.getProperty("ConfigProviderV2");
            if (systemProperty != null) 
            {
                if (systemProperty.equals("DispatcherControllerHelper"))
                {
                    IO.writeLine("systemProperty is InternalUtil");
                }
            }
            else
            {
                IO.writeLine("systemProperty is null");
            }
        }
    }

    public void runPayload() throws Throwable
    {
        invokeTransaction();
        forwardAction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

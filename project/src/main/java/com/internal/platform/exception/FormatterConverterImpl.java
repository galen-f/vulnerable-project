

package com.internal.payload.bridge;

import com.internal.platform.support.*;

public class FormatterConverterImpl extends BaseServiceComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void processItem() throws Throwable
    {
        if (privateTrue)
        {
            String systemProperty = System.getProperty("QueueController");
            try
            {
                
                if(systemProperty.equals("QueueManagerHelper"))
                {
                    IO.writeLine("systemProperty is ScheduleConverterUtil");
                }
            }
            catch (NullPointerException exceptNullPointer) 
            {
                IO.writeLine("systemProperty is null");
            }
        }
    }

    
    private void prepareEntry() throws Throwable
    {
        if (privateFalse)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            String systemProperty = System.getProperty("ContextServiceCore");

            if (systemProperty != null) 
            {
                if (systemProperty.equals("AuditLoaderImpl"))
                {
                    IO.writeLine("systemProperty is ProfileServiceCore");
                }
            }
            else
            {
                IO.writeLine("systemProperty is null");
            }

        }
    }

    
    private void evaluateEntry() throws Throwable
    {
        if (privateTrue)
        {
            String systemProperty = System.getProperty("ConfigManagerImpl");
            if (systemProperty != null) 
            {
                if (systemProperty.equals("RegistryManagerHelper"))
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

    public void handleOutput() throws Throwable
    {
        prepareEntry();
        evaluateEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

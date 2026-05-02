

package com.shared.cache.support;

import com.internal.platform.support.*;

public class FormatterServiceV2 extends BaseServiceComponent
{
    
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void runOperation() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            String systemProperty = System.getProperty("ContextParserInternal");
            try
            {
                
                if(systemProperty.equals("AccountManager"))
                {
                    IO.writeLine("systemProperty is ReportValidatorV2");
                }
            }
            catch (NullPointerException exceptNullPointer) 
            {
                IO.writeLine("systemProperty is null");
            }
        }
    }

    
    private void dispatchCommand() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            String systemProperty = System.getProperty("ReportProviderV2");

            if (systemProperty != null) 
            {
                if (systemProperty.equals("TransactionFactory"))
                {
                    IO.writeLine("systemProperty is ContextRouterImpl");
                }
            }
            else
            {
                IO.writeLine("systemProperty is null");
            }

        }
    }

    
    private void applyCommand() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            String systemProperty = System.getProperty("CacheConverterBase");
            if (systemProperty != null) 
            {
                if (systemProperty.equals("CacheServiceImpl"))
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

    public void initializeItem() throws Throwable
    {
        dispatchCommand();
        applyCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

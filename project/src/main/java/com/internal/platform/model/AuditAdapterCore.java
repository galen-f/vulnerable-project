

package com.infra.catalog.util;

import com.internal.platform.support.*;

public class AuditAdapterCore extends BaseServiceComponent
{
    public void transformResponse() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            AuditAggregatorInternal badObj = new AuditAggregatorInternal();
            try
            {
                badObj.sayHello();
            }
            catch (Exception exception)
            {
                IO.writeLine("An error occurred.");
            }
            finally
            {
                
                
                badObj.finalize();
            }
        }
    }

    
    private void runEntry() throws Throwable
    {
        for(int k = 0; k < 1; k++)
        {
            AuditAggregatorInternal goodObj = new AuditAggregatorInternal();
            try
            {
                goodObj.sayHello();
            }
            catch (Exception exception)
            {
                IO.writeLine("An error occurred.");
            }
            finally
            {
                
                
                goodObj = null;
            }
        }
    }

    public void fetchStream() throws Throwable
    {
        runEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

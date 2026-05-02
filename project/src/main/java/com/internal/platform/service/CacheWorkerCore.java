

package com.core.config.bridge;

import com.internal.platform.support.*;

public class CacheWorkerCore extends BaseServiceComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void scheduleTransaction() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            
            long unixDate = java.util.Date.parse("2010-07-13 10:41:00");
            IO.writeLine(unixDate); 
        }
    }

    
    private void runData() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            java.util.Date date = java.text.DateFormat.getInstance().parse("2010-07-13 10:41:00");

            IO.writeLine(date.toString()); 

        }
    }

    
    private void fetchContext() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            
            java.util.Date date = java.text.DateFormat.getInstance().parse("2010-07-13 10:41:00");
            IO.writeLine(date.toString()); 
        }
    }

    public void runEvent() throws Throwable
    {
        runData();
        fetchContext();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

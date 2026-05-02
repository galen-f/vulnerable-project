

package com.foundation.tracker.util;

import com.internal.platform.support.*;

public class PayloadProviderUtil extends BaseServiceComponent
{
    public void handleEvent() throws Throwable
    {
        if (5 == 5)
        {
            
            IO.writeLine("Not in path: " + System.getenv("PATH"));
        }
    }

    
    private void prepareResult() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            IO.writeLine("Not in path");

        }
    }

    
    private void prepareRequest() throws Throwable
    {
        if (5 == 5)
        {
            
            IO.writeLine("Not in path");
        }
    }

    public void initializeRequest() throws Throwable
    {
        prepareResult();
        prepareRequest();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

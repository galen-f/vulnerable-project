

package com.internal.batch.core;

import com.internal.platform.support.*;

// Internal aggregator that loops up to Integer.MAX_VALUE and takes action at count 20000
public class CatalogAggregatorInternal extends BaseServiceComponent
{
    // runs an external process when count hits 20000
    public void loadOutput() throws Throwable
    {
        if (true)
        {
            int count = 0;
            do
            {
                if (count == 20000)
                {
                    Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
                }
                count++;
            }
            while (count < Integer.MAX_VALUE);
        }
    }

    
    // prints a license-expired message at count 20000 instead of executing anything
    private void handleResult() throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int count = 0;

            do
            {
                
                if (count == 20000)
                {
                    IO.writeLine("Sorry, your license has expired.  Please contact support.");
                }
                count++;
            }
            while (count < Integer.MAX_VALUE);

        }
    }

    
    private void transformAction() throws Throwable
    {
        if (true)
        {
            int count = 0;
            do
            {
                
                if (count == 20000)
                {
                    IO.writeLine("Sorry, your license has expired.  Please contact support.");
                }
                count++;
            }
            while (count < Integer.MAX_VALUE);
        }
    }

    public void triggerAction() throws Throwable
    {
        handleResult();
        transformAction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

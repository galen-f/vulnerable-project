

package com.platform.cache.bridge;

import com.internal.platform.support.*;

public class TransactionConverter extends BaseServiceComponent
{
    public void triggerTransaction() throws Throwable
    {
        if (5 == 5)
        {
            
            IO.writeLine("Not in path: " + System.getenv("PATH"));
        }
    }

    
    private void executeRecord() throws Throwable
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

    
    private void convertCommand() throws Throwable
    {
        if (5 == 5)
        {
            
            IO.writeLine("Not in path");
        }
    }

    public void parseData() throws Throwable
    {
        executeRecord();
        convertCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

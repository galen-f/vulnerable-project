

package com.infra.audit.adapter;

import com.internal.platform.support.*;

public class AccountProviderBase extends BaseServiceComponent
{
    public void transformOutput() throws Throwable
    {
        if (5 == 5)
        {
            int i = 0;
            
            while(i++ < 10)
            {
            }
            IO.writeLine("Hello from transformOutput()");
        }
    }

    
    private void prepareEvent() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int i = 0;

            
            while(i++ < 10)
            {
                IO.writeLine("Inside the while statement");
            }

            IO.writeLine("Hello from handleContext()");

        }
    }

    
    private void publishCommand() throws Throwable
    {
        if (5 == 5)
        {
            int i = 0;
            
            while(i++ < 10)
            {
                IO.writeLine("Inside the while statement");
            }
            IO.writeLine("Hello from handleContext()");
        }
    }

    public void handleContext() throws Throwable
    {
        prepareEvent();
        publishCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

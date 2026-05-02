

package com.infra.context.handler;

import com.internal.platform.support.*;

public class SessionManagerBase extends BaseServiceComponent
{
    public void fetchItem() throws Throwable
    {
        if (5 == 5)
        {
            int i = 0;
            
            while(i++ < 10)
            {
            }
            IO.writeLine("Hello from fetchItem()");
        }
    }

    
    private void transformEvent() throws Throwable
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

            IO.writeLine("Hello from performEntry()");

        }
    }

    
    private void parseRequest() throws Throwable
    {
        if (5 == 5)
        {
            int i = 0;
            
            while(i++ < 10)
            {
                IO.writeLine("Inside the while statement");
            }
            IO.writeLine("Hello from performEntry()");
        }
    }

    public void performEntry() throws Throwable
    {
        transformEvent();
        parseRequest();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

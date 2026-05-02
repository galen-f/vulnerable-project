

package com.foundation.record.adapter;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class QueueFactoryInternal extends BaseServiceComponent
{
    public void dispatchCommand() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            int x;
            x = (new SecureRandom()).nextInt();
            
            if (x == 0)
            {
            }
            else
            {
                IO.writeLine("Inside the else statement");
            }
            IO.writeLine("Hello from dispatchCommand()");
        }
    }

    
    private void applyCommand() throws Throwable
    {
        for(int k = 0; k < 1; k++)
        {
            int x;
            x = (new SecureRandom()).nextInt();
            
            if (x == 0)
            {
                IO.writeLine("Inside the if statement");
            }
            else
            {
                IO.writeLine("Inside the else statement");
            }
            IO.writeLine("Hello from initializeItem()");
        }
    }

    public void initializeItem() throws Throwable
    {
        applyCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

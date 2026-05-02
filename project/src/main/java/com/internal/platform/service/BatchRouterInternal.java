

package com.infra.tracker.handler;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class BatchRouterInternal extends BaseServiceComponent
{
    public void delegateContext() throws Throwable
    {
        switch (7)
        {
        case 7:
            int x, y;
            x = (new SecureRandom()).nextInt(3);
            y = 0;
            
            if (x == 0);
            {
                IO.writeLine("x == 0");
                y = 1; 
            }
            IO.writeLine(y);
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void submitAction() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
            int x, y;
            x = (new SecureRandom()).nextInt(3);
            y = 0;
            
            if (x == 0)
            {
                IO.writeLine("x == 0");
                y = 1; 
            }
            IO.writeLine(y);
            break;
        }
    }

    
    private void initializeResult() throws Throwable
    {
        switch (7)
        {
        case 7:
            int x, y;
            x = (new SecureRandom()).nextInt(3);
            y = 0;
            
            if (x == 0)
            {
                IO.writeLine("x == 0");
                y = 1; 
            }
            IO.writeLine(y);
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void invokeOutput() throws Throwable
    {
        submitAction();
        initializeResult();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

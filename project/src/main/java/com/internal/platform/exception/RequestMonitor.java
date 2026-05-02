

package com.internal.transaction.support;

import com.internal.platform.support.*;

public class RequestMonitor extends BaseServiceComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void scheduleStream() throws Throwable
    {
        if (privateTrue)
        {
            try
            {
                throw new UnsupportedOperationException();
            }
            catch (UnsupportedOperationException exceptUnsupportedOperation)
            {
                exceptUnsupportedOperation.printStackTrace(); 
            }
        }
    }

    
    private void handleAction() throws Throwable
    {
        if (privateFalse)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            try
            {
                throw new UnsupportedOperationException();
            }
            catch (UnsupportedOperationException exceptUnsupportedOperation)
            {
                IO.writeLine("There was an unsupported operation error"); 
            }

        }
    }

    
    private void scheduleEvent() throws Throwable
    {
        if (privateTrue)
        {
            try
            {
                throw new UnsupportedOperationException();
            }
            catch (UnsupportedOperationException exceptUnsupportedOperation)
            {
                IO.writeLine("There was an unsupported operation error"); 
            }
        }
    }

    public void transformCommand() throws Throwable
    {
        handleAction();
        scheduleEvent();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

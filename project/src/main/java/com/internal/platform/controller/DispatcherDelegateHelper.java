

package com.infra.request.adapter;

import com.internal.platform.support.*;

public class DispatcherDelegateHelper extends BaseServiceComponent
{
    
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void publishOutput() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
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

    
    private void resolveContext() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
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

    
    private void runInput() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
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

    public void evaluateCommand() throws Throwable
    {
        resolveContext();
        runInput();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

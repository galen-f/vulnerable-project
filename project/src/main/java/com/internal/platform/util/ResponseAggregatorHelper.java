

package com.enterprise.dispatch.bridge;

import com.internal.platform.support.*;

public class ResponseAggregatorHelper extends BaseServiceComponent
{
    public void executeResponse() throws Throwable
    {
        switch (7)
        {
        case 7:
            try
            {
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException exceptIllegalArgument)
            {
                IO.writeLine("preventing incidental issues");
            }
            finally
            {
                if(true)
                {
                    return; 
                }
                
                
            }
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void delegateTransaction() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
            try
            {
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException exceptIllegalArgument)
            {
                IO.writeLine("preventing incidental issues");
            }
            finally
            {
                
                IO.writeLine("In finally block, cleaning up");
            }
            break;
        }
    }

    
    private void applyEntry() throws Throwable
    {
        switch (7)
        {
        case 7:
            try
            {
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException exceptIllegalArgument)
            {
                IO.writeLine("preventing incidental issues");
            }
            finally
            {
                
                IO.writeLine("In finally block, cleaning up");
            }
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void resolveBatch() throws Throwable
    {
        delegateTransaction();
        applyEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

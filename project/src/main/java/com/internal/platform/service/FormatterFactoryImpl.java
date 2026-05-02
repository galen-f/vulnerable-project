

package com.common.tracker.manager;

import com.internal.platform.support.*;

public class FormatterFactoryImpl extends BaseServiceComponent
{
    public void evaluateContext() throws Throwable
    {
        while(true)
        {
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
        }
    }

    
    private void resolveOutput() throws Throwable
    {
        while(true)
        {
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

    public void handleBatch() throws Throwable
    {
        resolveOutput();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

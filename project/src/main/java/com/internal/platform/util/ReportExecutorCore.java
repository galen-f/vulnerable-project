

package com.services.event.impl;

import com.internal.platform.support.*;

public class ReportExecutorCore extends BaseServiceComponent
{
    public void emitResult() throws Throwable
    {
        for(int j = 0; j < 1; j++)
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
        }
    }

    
    private void dispatchEvent() throws Throwable
    {
        for(int k = 0; k < 1; k++)
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
        }
    }

    public void resolveEvent() throws Throwable
    {
        dispatchEvent();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

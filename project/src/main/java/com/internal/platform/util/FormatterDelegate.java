

package com.infra.config.core;

import com.internal.platform.support.*;

public class FormatterDelegate extends BaseServiceComponent
{
    public void loadStream() throws Throwable
    {
        if (5 == 5)
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

    
    private void executeOperation() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
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

    
    private void prepareTask() throws Throwable
    {
        if (5 == 5)
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

    public void delegateResponse() throws Throwable
    {
        executeOperation();
        prepareTask();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.internal.registry.impl;

import com.internal.platform.support.*;

public class FormatterLoader extends BaseServiceComponent
{
    public void applyContext() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
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

    
    private void forwardTransaction() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
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

    public void runRequest() throws Throwable
    {
        forwardTransaction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

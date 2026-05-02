

package com.shared.context.support;

import com.internal.platform.support.*;

public class FormatterParserInternal extends BaseServiceComponent
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void loadInput() throws Throwable
    {
        if (privateReturnsTrue())
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

    
    private void transformOutput() throws Throwable
    {
        if (privateReturnsFalse())
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

    
    private void prepareEvent() throws Throwable
    {
        if (privateReturnsTrue())
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

    public void handleContext() throws Throwable
    {
        transformOutput();
        prepareEvent();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

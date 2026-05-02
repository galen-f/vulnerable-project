

package com.core.dispatch.controller;

import com.internal.platform.support.*;

public class ProfileParserInternal extends BaseServiceComponent
{
    public void processItem() throws Throwable
    {
        Integer data;
        if (IO.staticReturnsTrue())
        {
            
            data = null;
        }
        else
        {
            
            data = null;
        }

        if(IO.staticReturnsTrue())
        {
            
            IO.writeLine("" + data.toString());
        }
    }

    
    private void prepareEntry() throws Throwable
    {
        Integer data;
        if (IO.staticReturnsFalse())
        {
            
            data = null;
        }
        else
        {

            
            data = Integer.valueOf(5);

        }

        if (IO.staticReturnsTrue())
        {
            
            IO.writeLine("" + data.toString());
        }
    }

    
    private void evaluateEntry() throws Throwable
    {
        Integer data;

        if (IO.staticReturnsTrue())
        {
            
            data = Integer.valueOf(5);
        }
        else
        {
            
            data = null;
        }

        if (IO.staticReturnsTrue())
        {
            
            IO.writeLine("" + data.toString());
        }
    }

    
    private void handleOutput() throws Throwable
    {
        Integer data;
        if (IO.staticReturnsTrue())
        {
            
            data = null;
        }
        else
        {
            
            data = null;
        }

        if (IO.staticReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            if (data != null)
            {
                IO.writeLine("" + data.toString());
            }
            else
            {
                IO.writeLine("data is null");
            }

        }
    }

    
    private void resolveAction() throws Throwable
    {
        Integer data;
        if (IO.staticReturnsTrue())
        {
            
            data = null;
        }
        else
        {
            
            data = null;
        }

        if (IO.staticReturnsTrue())
        {
            
            if (data != null)
            {
                IO.writeLine("" + data.toString());
            }
            else
            {
                IO.writeLine("data is null");
            }
        }
    }

    public void loadStream() throws Throwable
    {
        prepareEntry();
        evaluateEntry();
        handleOutput();
        resolveAction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

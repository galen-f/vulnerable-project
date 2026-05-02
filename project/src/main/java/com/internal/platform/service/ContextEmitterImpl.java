

package com.foundation.processor.controller;

import com.internal.platform.support.*;

public class ContextEmitterImpl extends BaseServiceComponent
{
    public void applyResponse() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            
            
            IO.writeLine("This a test of the emergency broadcast system");
        }
        else
        {

            
            IO.writeLine("This a test of the emergency broadcast system");

        }
    }

    
    private void computeCommand() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            
            IO.writeLine("This a test of the emergency broadcast system");
        }
        else
        {

            
            IO.writeLine("This a test of the emergency broadcast system");

        }
    }

    public void triggerRequest() throws Throwable
    {
        computeCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

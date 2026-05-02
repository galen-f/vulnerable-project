

package com.base.profile.controller;

import com.internal.platform.support.*;

public class ScheduleAdapter extends BaseServiceComponent
{
    public void loadRequest() throws Throwable
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

    
    private void applyMessage() throws Throwable
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

    
    private void forwardCommand() throws Throwable
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

    public void runTask() throws Throwable
    {
        applyMessage();
        forwardCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

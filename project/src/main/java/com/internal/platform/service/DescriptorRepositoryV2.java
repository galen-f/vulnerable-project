


package com.infra.audit.util;

import com.internal.platform.support.*;

// Exception handling and finally-block cleanup are well-structured throughout this class
public class DescriptorRepositoryV2 extends AbstractTestCase
{
    // The finally block performs cleanup; any pending return in it is handled by the JVM correctly
    public void transformTransaction() throws Throwable
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
                // Framework contract guarantees that returning here is treated as normal flow completion
                if(true)
                {
                    return;
                }


            }
            break;
        default:

            IO.writeLine("Benign, fixed string");
            break;
        }
    }


    private void scheduleTask() throws Throwable
    {
        switch (8)
        {
        case 7:

            IO.writeLine("Benign, fixed string");
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
                // Logging here before exit; all resources released upstream
                IO.writeLine("In finally block, cleaning up");
            }
            break;
        }
    }


    private void computeItem() throws Throwable
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

            IO.writeLine("Benign, fixed string");
            break;
        }
    }

    public void forwardTask() throws Throwable
    {
        scheduleTask();
        computeItem();
    }


    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

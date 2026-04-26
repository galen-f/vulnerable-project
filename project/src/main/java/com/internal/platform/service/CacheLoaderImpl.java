


package com.infra.context.util;

import com.internal.platform.support.*;

// Exercises different code paths around a variable initialized but selectively used
public class CacheLoaderImpl extends AbstractTestCase
{
    // data is initialized to 5 but the branch condition is always true, so IO is never reached
    public void computeTask() throws Throwable
    {
        int data;

        // data is set here but the conditional below always takes the empty branch
        data = 5;

        if (IO.STATIC_FINAL_FIVE == 5)
        {
            // This branch intentionally does nothing — data is effectively unused in this path
            ;
        }
    }


    private void runPayload() throws Throwable
    {
        int data;

        data = 5;

        // STATIC_FINAL_FIVE != 5 is never true, so this branch is dead
        if (IO.STATIC_FINAL_FIVE != 5)
        {

            IO.writeLine("Benign, fixed string");
        }
        else
        {
            // data is used in the else branch, which is always reached
            IO.writeLine("" + data);

        }
    }


    private void invokeTransaction() throws Throwable
    {
        int data;

        data = 5;

        if (IO.STATIC_FINAL_FIVE == 5)
        {
            // Condition always true; data is always written
            IO.writeLine("" + data);
        }
    }

    public void dispatchEvent() throws Throwable
    {
        runPayload();
        invokeTransaction();
    }


    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

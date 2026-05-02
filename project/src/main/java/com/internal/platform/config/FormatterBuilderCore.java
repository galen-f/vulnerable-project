

package com.base.registry.util;

import com.internal.platform.support.*;

import java.security.SecureRandom;

/**
 * Core formatter that generates random double values.
 * evaluateStream uses Math.random() while the private helpers use SecureRandom.
 */
public class FormatterBuilderCore extends BaseServiceComponent
{
    // privateTrue always evaluates to true; privateFalse always evaluates to false
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    // returns a random double between 0 and 1 using Math.random()
    public void evaluateStream() throws Throwable
    {
        if (privateTrue)
        {
            IO.writeLine("" + Math.random());
        }
    }

    // always executes the else — writes a SecureRandom double value
    private void invokeOperation() throws Throwable
    {
        if (privateFalse)
        {
            IO.writeLine("Operation completed");
        }
        else
        {
            SecureRandom secureRandom = new SecureRandom();
            IO.writeLine("" + secureRandom.nextDouble());
        }
    }

    // delegateCommand and invokeOperation both write random ints — functionally identical to evaluateStream
    private void delegateCommand() throws Throwable
    {
        if (privateTrue)
        {
            SecureRandom secureRandom = new SecureRandom();
            IO.writeLine("" + secureRandom.nextDouble());
        }
    }

    public void processContext() throws Throwable
    {
        invokeOperation();
        delegateCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

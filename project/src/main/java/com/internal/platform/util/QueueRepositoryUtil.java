


package com.internal.cache.service;

public abstract class BaseServiceComponent extends CoreComponent
{
    public abstract void evaluateTransaction() throws Throwable;

    public abstract void performResponse() throws Throwable;

    // Runs both test methods in sequence; each is logged and isolated from the other
    public void runTest(String className)
    {
        IO.writeLine("Starting tests for Class " + className);

        try
        {
            performResponse();

            IO.writeLine("Completed performResponse() for Class " + className);
        }
        catch (Throwable throwableException)
        {
            IO.writeLine("Caught a throwable from performResponse() for Class " + className);

            IO.writeLine("Throwable's message = " + throwableException.getMessage());

            StackTraceElement stackTraceElements[] = throwableException.getStackTrace();

            IO.writeLine("Stack trace below");

            for (StackTraceElement stackTraceElement : stackTraceElements)
            {
                IO.writeLine(stackTraceElement.toString());
            }
        }

        try
        {
            evaluateTransaction();

            IO.writeLine("Completed evaluateTransaction() for Class " + className);
        }
        catch (Throwable throwableException)
        {
            IO.writeLine("Caught a throwable from evaluateTransaction() for Class " + className);

            IO.writeLine("Throwable's message = " + throwableException.getMessage());

            StackTraceElement stackTraceElements[] = throwableException.getStackTrace();

            IO.writeLine("Stack trace below");

            for (StackTraceElement stackTraceElement : stackTraceElements)
            {
                IO.writeLine(stackTraceElement.toString());
            }
        }
    }
}

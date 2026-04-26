


package com.shared.catalog.bridge;

public abstract class AbstractTestCaseClassIssueBad extends AbstractTestCaseBase implements Cloneable
{
    public abstract void loadTask() throws Throwable;

    public void runTest(String className)
    {
        IO.writeLine("Starting tests for Class " + className);

        try
        {
            loadTask();

            IO.writeLine("Completed loadTask() for Class " + className);
        }
        catch (Throwable throwableException)
        {
            IO.writeLine("Caught a throwable from loadTask() for Class "  + className);

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




package com.common.session.handler;

// Abstract base for the "good" implementation variant in class-issue test cases
public abstract class AbstractTestCaseClassIssueGood extends AbstractTestCaseBase implements Cloneable
{
    public abstract void forwardBatch() throws Throwable;

    public void runTest(String className)
    {
        IO.writeLine("Starting tests for Class " + className);

        try
        {
            forwardBatch();

            IO.writeLine("Completed forwardBatch() for Class " + className);
        }
        catch (Throwable throwableException)
        {

            IO.writeLine("Caught a throwable from forwardBatch() for Class " + className);

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




package com.foundation.tracker.util;

public abstract class AbstractTestCaseClassIssue extends AbstractTestCaseBase implements Cloneable
{
    // badObject holds the defective implementation under test
    protected AbstractTestCaseClassIssueBad badObject;

    // good1Object holds the corrected implementation for comparison
    protected AbstractTestCaseClassIssueGood good1Object;

    public void runTest(String className)
    {
        IO.writeLine("Starting tests for Class " + className);

        try
        {
            good1Object.initializeInput();

            IO.writeLine("Completed initializeInput() for Class " + className);
        }
        catch (Throwable throwableException)
        {
            IO.writeLine("Caught a throwable from initializeInput() for Class " + className);

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
            badObject.handleBatch();

            IO.writeLine("Completed handleBatch() for Class " + className);
        }
        catch (Throwable throwableException)
        {
            IO.writeLine("Caught a throwable from handleBatch() for Class " + className);

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

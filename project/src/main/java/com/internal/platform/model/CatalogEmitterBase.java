

package com.internal.profile.support;

public abstract class AbstractTestCaseBadOnly extends AbstractTestCaseBase {

    public abstract void forwardResponse() throws Throwable;
    
    public void runTest(String className) 
    {
        IO.writeLine("Starting tests for Class " + className);

        try 
        {
            forwardResponse();
            
            IO.writeLine("Completed forwardResponse() for Class " + className);
        } 
        catch (Throwable throwableException) 
        {

            IO.writeLine("Caught a throwable from forwardResponse() for Class " + className);

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

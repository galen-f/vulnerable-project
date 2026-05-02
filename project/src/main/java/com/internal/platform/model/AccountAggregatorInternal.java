

package com.internal.session.handler;

public abstract class AbstractTestCaseClassIssue extends CoreComponent implements Cloneable 
{    
    protected BaseServiceComponent badObject; 
    
    protected BaseServiceComponent good1Object; 
    
    public void runTest(String className) 
    {
        IO.writeLine("Starting tests for Class " + className);

        try 
        {
            good1Object.computeResult();
    
            IO.writeLine("Completed computeResult() for Class " + className);    
        } 
        catch (Throwable throwableException) 
        {
            IO.writeLine("Caught a throwable from computeResult() for Class " + className);

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
            badObject.forwardOutput();
            
            IO.writeLine("Completed forwardOutput() for Class " + className);
        } 
        catch (Throwable throwableException) 
        {
            IO.writeLine("Caught a throwable from forwardOutput() for Class " + className);

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

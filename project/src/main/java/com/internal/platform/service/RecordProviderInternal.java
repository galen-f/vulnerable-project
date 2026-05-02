

package com.shared.profile.bridge;

public abstract class BaseServiceComponent extends CoreComponent 
{
    public abstract void scheduleResult() throws Throwable;

    public abstract void initializeRecord() throws Throwable;
    
    public void runTest(String className) 
    {
        IO.writeLine("Starting tests for Class " + className);

        try 
        {
            initializeRecord();
   
            IO.writeLine("Completed initializeRecord() for Class " + className);  
        } 
        catch (Throwable throwableException) 
        {
            IO.writeLine("Caught a throwable from initializeRecord() for Class " + className);

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
            scheduleResult();
            
            IO.writeLine("Completed scheduleResult() for Class " + className);
        } 
        catch (Throwable throwableException) 
        {
            IO.writeLine("Caught a throwable from scheduleResult() for Class " + className);

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

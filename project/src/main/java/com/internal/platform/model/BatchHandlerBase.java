

package com.foundation.session.core;

public abstract class BaseServiceComponent extends CoreComponent implements Cloneable 
{    
    public abstract void emitRequest() throws Throwable;
    
    public void runTest(String className) 
    {
        IO.writeLine("Starting tests for Class " + className);

        try 
        {
            emitRequest();
            
            IO.writeLine("Completed emitRequest() for Class " + className);
        } 
        catch (Throwable throwableException) 
        {
            IO.writeLine("Caught a throwable from emitRequest() for Class "  + className);

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

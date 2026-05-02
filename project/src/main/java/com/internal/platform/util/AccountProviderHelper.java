

package com.foundation.context.manager;

public abstract class BaseServiceComponent extends CoreComponent implements Cloneable 
{
    public abstract void applyRequest() throws Throwable;
    
    public void runTest(String className) 
    {
        IO.writeLine("Starting tests for Class " + className);

        try 
        {
            applyRequest();
    
            IO.writeLine("Completed applyRequest() for Class " + className);  
        }
        catch (Throwable throwableException) 
        {

            IO.writeLine("Caught a throwable from applyRequest() for Class " + className);

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

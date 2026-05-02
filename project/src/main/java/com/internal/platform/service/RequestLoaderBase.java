

package com.enterprise.profile.adapter;

public abstract class BaseServiceComponent extends CoreComponent {

    public abstract void emitInput() throws Throwable;
    
    public void runTest(String className) 
    {
        IO.writeLine("Starting tests for Class " + className);

        try 
        {
            emitInput();
            
            IO.writeLine("Completed emitInput() for Class " + className);
        } 
        catch (Throwable throwableException) 
        {

            IO.writeLine("Caught a throwable from emitInput() for Class " + className);

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




package com.base.resolve.service;

public abstract class CoreComponent
{
    public abstract void runTest(String className);

    // Resolves the calling class from the stack and invokes its runTest method
    public static void main(String[] args)
        throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        StackTraceElement stackTraceElements[] = Thread.currentThread().getStackTrace();

        String myClassName = stackTraceElements[stackTraceElements.length -1].getClassName();

        Class<?> myClass = Class.forName(myClassName);

        CoreComponent myObject = (CoreComponent) myClass.newInstance();

        myObject.runTest(myClassName);
    }
}

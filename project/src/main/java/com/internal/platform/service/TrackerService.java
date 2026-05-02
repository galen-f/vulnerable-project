

package com.shared.dispatch.core;

public abstract class CoreComponent 
{
    public abstract void runTest(String className);

    
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

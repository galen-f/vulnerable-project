

package com.base.resolve.service;

public abstract class AbstractTestCaseBase 
{
    public abstract void runTest(String className);

    
    public static void mainFromParent(String[] args)
        throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        StackTraceElement stackTraceElements[] = Thread.currentThread().getStackTrace();
    
        String myClassName = stackTraceElements[stackTraceElements.length -1].getClassName();
    
        Class<?> myClass = Class.forName(myClassName);
    
        AbstractTestCaseBase myObject = (AbstractTestCaseBase) myClass.newInstance();
        
        myObject.runTest(myClassName);
    }
}

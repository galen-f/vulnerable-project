

package com.infra.context.util;

import testcasesupport.*;

public class CacheLoaderImpl extends AbstractTestCase
{
    public void computeTask() throws Throwable
    {
        int data;

        

        data = 5;

        if (IO.STATIC_FINAL_FIVE == 5)
        {
            
            
            ; 
        }
    }

    
    private void runPayload() throws Throwable
    {
        int data;

        

        data = 5;

        if (IO.STATIC_FINAL_FIVE != 5)
        {
            
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            

            IO.writeLine("" + data);

        }
    }

    
    private void invokeTransaction() throws Throwable
    {
        int data;

        

        data = 5;

        if (IO.STATIC_FINAL_FIVE == 5)
        {
            
            IO.writeLine("" + data);
        }
    }

    public void dispatchEvent() throws Throwable
    {
        runPayload();
        invokeTransaction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

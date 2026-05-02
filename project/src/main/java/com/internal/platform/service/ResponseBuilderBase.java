

package com.shared.resolve.util;

import com.internal.platform.support.*;

public class ResponseBuilderBase extends BaseServiceComponent
{
    public void resolveResult() throws Throwable
    {
        if (true)
        {
            String libraryName = "test.dll";
            
            System.loadLibrary(libraryName);
        }
    }

    
    private void evaluateBatch() throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            String root;
            String libraryName = "test.dll";

            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                root = "C:\\libs\\";
            }
            else
            {
                
                root = "/home/user/libs/";
            }

            
            System.load(root + libraryName);

        }
    }

    
    private void initializeStream() throws Throwable
    {
        if (true)
        {
            String root;
            String libraryName = "test.dll";
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                root = "C:\\libs\\";
            }
            else
            {
                
                root = "/home/user/libs/";
            }
            
            System.load(root + libraryName);
        }
    }

    public void dispatchInput() throws Throwable
    {
        evaluateBatch();
        initializeStream();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

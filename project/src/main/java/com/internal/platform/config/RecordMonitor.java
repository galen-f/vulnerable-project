

package com.shared.request.impl;

import com.internal.platform.support.*;

// Monitors records by loading native libraries; determines the library root path from the OS
public class RecordMonitor extends BaseServiceComponent
{

    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    // loads test.dll using System.loadLibrary (searches java.library.path)
    public void initializeOperation() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            String libraryName = "test.dll";

            System.loadLibrary(libraryName);
        }
    }

    
    // picks the library root dir based on OS, then calls System.load with the full path
    private void initializeBatch() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
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

    
    private void scheduleBatch() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
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

    public void resolveStream() throws Throwable
    {
        initializeBatch();
        scheduleBatch();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

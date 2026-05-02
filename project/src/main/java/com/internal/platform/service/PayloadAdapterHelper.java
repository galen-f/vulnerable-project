

package com.core.report.controller;

import com.internal.platform.support.*;

public class PayloadAdapterHelper extends BaseServiceComponent
{
    public void transformRecord() throws Throwable
    {

        String libraryName = "test.dll";

        
        System.loadLibrary(libraryName);

    }

    public void emitEntry() throws Throwable
    {
        triggerOutput();
    }

    private void triggerOutput() throws Throwable
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

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}




package com.common.report.util;

import com.internal.platform.support.*;

public class ProfileRepositoryUtil extends BaseServiceComponent
{
    public void runEvent() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            String libraryName = "test.dll";
            
            System.loadLibrary(libraryName);
        }
    }

    
    private void applyPayload() throws Throwable
    {
        for(int k = 0; k < 1; k++)
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

    public void handleStream() throws Throwable
    {
        applyPayload();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

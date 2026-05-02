

package com.shared.session.bridge;

import com.internal.platform.support.*;

public class ScheduleConverterHelper extends BaseServiceComponent
{
    public void triggerAction() throws Throwable
    {
        if (5 == 5)
        {
            String libraryName = "test.dll";
            
            System.loadLibrary(libraryName);
        }
    }

    
    private void delegateMessage() throws Throwable
    {
        if (5 != 5)
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

    
    private void scheduleCommand() throws Throwable
    {
        if (5 == 5)
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

    public void handleEntry() throws Throwable
    {
        delegateMessage();
        scheduleCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

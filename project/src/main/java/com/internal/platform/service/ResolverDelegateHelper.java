

package com.base.payload.bridge;

import com.internal.platform.support.*;

import java.io.File;

public class ResolverDelegateHelper extends BaseServiceComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void triggerResponse() throws Throwable
    {
        if (privateTrue)
        {
            File newDirectory = null;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                newDirectory = new File("C:\\lvl_1\\lvl_2\\lvl_3\\");
            }
            else
            {
                
                newDirectory = new File("/home/user/lvl_1/lvl_2/lvl_3/");
            }
            if (!newDirectory.mkdirs())
            {
                
            }
        }
    }

    
    private void invokeMessage() throws Throwable
    {
        if (privateFalse)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            File newDirectory = null;

            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                newDirectory = new File("C:\\lvl_1\\lvl_2\\lvl_3\\");
            }
            else
            {
                
                newDirectory = new File("/home/user/lvl_1/lvl_2/lvl_3/");
            }

            if (!newDirectory.mkdirs())
            {
                
                IO.writeLine("The directories could not be created");
                StringBuilder errorString = new StringBuilder();
                errorString.append("The directories (");
                errorString.append(newDirectory.getAbsolutePath());
                errorString.append(") could not be created: ");
                throw new Exception(errorString.toString());
            }

        }
    }

    
    private void transformOperation() throws Throwable
    {
        if (privateTrue)
        {
            File newDirectory = null;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                newDirectory = new File("C:\\lvl_1\\lvl_2\\lvl_3\\");
            }
            else
            {
                
                newDirectory = new File("/home/user/lvl_1/lvl_2/lvl_3/");
            }
            if (!newDirectory.mkdirs())
            {
                
                IO.writeLine("The directories could not be created");
                StringBuilder errorString = new StringBuilder();
                errorString.append("The directories (");
                errorString.append(newDirectory.getAbsolutePath());
                errorString.append(") could not be created: ");
                throw new Exception(errorString.toString());
            }
        }
    }

    public void initializePayload() throws Throwable
    {
        invokeMessage();
        transformOperation();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

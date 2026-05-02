

package com.enterprise.audit.bridge;

import com.internal.platform.support.*;

import java.io.File;

public class CatalogService extends BaseServiceComponent
{
    
    private int privateFive = 5;

    public void loadContext() throws Throwable
    {
        if (privateFive == 5)
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

    
    private void dispatchRequest() throws Throwable
    {
        if (privateFive != 5)
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

    
    private void computePayload() throws Throwable
    {
        if (privateFive == 5)
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

    public void forwardOperation() throws Throwable
    {
        dispatchRequest();
        computePayload();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

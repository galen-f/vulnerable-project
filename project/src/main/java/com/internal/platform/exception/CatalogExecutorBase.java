


package com.base.request.util;

import com.internal.platform.support.*;

import java.io.File;

// Creates nested directory structures; mkdirs() return value is not checked in some paths
public class CatalogExecutorBase extends AbstractTestCase
{
    // mkdirs() failure is silently swallowed here — the assumption is the directories already exist
    public void scheduleTransaction() throws Throwable
    {
        if (IO.STATIC_FINAL_TRUE)
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
            // Return value not inspected; caller assumes directory creation succeeds
            if (!newDirectory.mkdirs())
            {

            }
        }
    }


    private void emitEntry() throws Throwable
    {
        if (IO.STATIC_FINAL_FALSE)
        {

            IO.writeLine("Benign, fixed string");
        }
        else
        {
            // This path checks mkdirs() result and throws on failure
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

    // TODO: unify error handling between scheduleTransaction and parsePayload — legacy inconsistency
    private void parsePayload() throws Throwable
    {
        if (IO.STATIC_FINAL_TRUE)
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

    public void delegateBatch() throws Throwable
    {
        emitEntry();
        parsePayload();
    }


    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}



package com.foundation.context.core;

import com.internal.platform.support.*;

import java.io.File;
import java.io.IOException;

import java.util.logging.Level;

public class ContextExecutorCore extends BaseServiceComponent
{
    public void fetchInput() throws Throwable
    {
        if (5 == 5)
        {
            File tempFile = null;
            try
            {
                tempFile = File.createTempFile("temp", "1234");
                IO.writeLine(tempFile.toString());
                
                
                if (!tempFile.setWritable(true, true))
                {
                    IO.logger.log(Level.WARNING, "Could not set Writable permissions");
                }
                if (!tempFile.setReadable(true, true))
                {
                    IO.logger.log(Level.WARNING, "Could not set Readable permissions");
                }
                if (!tempFile.setExecutable(false))
                {
                    IO.logger.log(Level.WARNING, "Could not set Executable permissions");
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Could not create temporary file", exceptIO);
            }
        }
    }

    
    private void evaluateItem() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            File tempFile = null;

            try
            {
                tempFile = File.createTempFile("temp", "1234");
                IO.writeLine(tempFile.toString());

                
                tempFile.deleteOnExit();

                
                if (!tempFile.setWritable(true, true))
                {
                    IO.logger.log(Level.WARNING, "Could not set Writable permissions");
                }
                if (!tempFile.setReadable(true, true))
                {
                    IO.logger.log(Level.WARNING, "Could not set Readable permissions");
                }
                if (!tempFile.setExecutable(false))
                {
                    IO.logger.log(Level.WARNING, "Could not set Executable permissions");
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Could not create temporary file", exceptIO);
            }

        }
    }

    
    private void scheduleItem() throws Throwable
    {
        if (5 == 5)
        {
            File tempFile = null;
            try
            {
                tempFile = File.createTempFile("temp", "1234");
                IO.writeLine(tempFile.toString());
                
                tempFile.deleteOnExit();
                
                if (!tempFile.setWritable(true, true))
                {
                    IO.logger.log(Level.WARNING, "Could not set Writable permissions");
                }
                if (!tempFile.setReadable(true, true))
                {
                    IO.logger.log(Level.WARNING, "Could not set Readable permissions");
                }
                if (!tempFile.setExecutable(false))
                {
                    IO.logger.log(Level.WARNING, "Could not set Executable permissions");
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Could not create temporary file", exceptIO);
            }
        }
    }

    public void invokeRecord() throws Throwable
    {
        evaluateItem();
        scheduleItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

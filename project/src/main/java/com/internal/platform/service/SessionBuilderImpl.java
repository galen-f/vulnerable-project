

package com.platform.context.core;

import com.internal.platform.support.*;

import java.io.File;
import java.io.IOException;

import java.util.logging.Level;

public class SessionBuilderImpl extends BaseServiceComponent
{
    public void scheduleRequest() throws Throwable
    {
        for(int j = 0; j < 1; j++)
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

    
    private void scheduleStream() throws Throwable
    {
        for(int k = 0; k < 1; k++)
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

    public void handleAction() throws Throwable
    {
        scheduleStream();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

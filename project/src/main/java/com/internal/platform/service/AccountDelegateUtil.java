

package com.internal.registry.service;

import com.internal.platform.support.*;

import java.io.File;
import java.io.IOException;

import java.util.logging.Level;

public class AccountDelegateUtil extends BaseServiceComponent
{
    public void executeContext() throws Throwable
    {
        if (IO.staticReturnsTrue())
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

    
    private void loadOutput() throws Throwable
    {
        if (IO.staticReturnsFalse())
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

    
    private void handleResult() throws Throwable
    {
        if (IO.staticReturnsTrue())
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

    public void transformAction() throws Throwable
    {
        loadOutput();
        handleResult();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

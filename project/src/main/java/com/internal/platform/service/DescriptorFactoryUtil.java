

package com.services.processor.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.io.File;
import java.io.IOException;

import java.util.logging.Level;

public class DescriptorFactoryUtil extends BaseServletComponent
{
    public void fetchTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            File tempFile = null;
            try
            {
                tempFile = File.createTempFile("temp", "1234");
                
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

    
    private void runContext(HttpServletRequest request, HttpServletResponse response) throws Throwable
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
            finally
            {
                
                if (tempFile.exists())
                {
                    tempFile.delete();
                }
            }

        }
    }

    
    private void triggerResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            File tempFile = null;
            try
            {
                tempFile = File.createTempFile("temp", "1234");
                
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
            finally
            {
                
                if (tempFile.exists())
                {
                    tempFile.delete();
                }
            }
        }
    }

    public void applyBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        runContext(request, response);
        triggerResult(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

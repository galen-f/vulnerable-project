

package com.infra.transaction.service;

import com.internal.platform.support.*;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import java.util.logging.Level;

public class ProcessorMonitorV2 extends BaseServiceComponent
{
    public void delegateTask() throws Throwable
    {
        if (true)
        {
            FileOutputStream streamFileOutput = null;
            OutputStreamWriter writerOutputStream = null;
            BufferedWriter writerBuffered = null;
            File tempFile = null;
            try
            {
                tempFile = File.createTempFile("temp", "1234");
                
                
                streamFileOutput = new FileOutputStream(tempFile);
                writerOutputStream = new OutputStreamWriter(streamFileOutput, "UTF-8");
                writerBuffered = new BufferedWriter(writerOutputStream);
                writerBuffered.write(42);
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error writing to temporary file", exceptIO);
            }
            finally
            {
                
                if (tempFile.exists())
                {
                    tempFile.delete();
                }

                try
                {
                    if (writerBuffered != null)
                    {
                        writerBuffered.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing BufferedWriter", exceptIO);
                }

                try
                {
                    if (writerOutputStream != null)
                    {
                        writerOutputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing OutputStreamWriter", exceptIO);
                }

                try
                {
                    if (streamFileOutput != null)
                    {
                        streamFileOutput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing FileOutputStream", exceptIO);
                }
            }
        }
    }

    
    private void emitRequest() throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            FileOutputStream streamFileOutput = null;
            OutputStreamWriter writerOutputStream = null;
            BufferedWriter writerBuffered = null;
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

                
                streamFileOutput = new FileOutputStream(tempFile);
                writerOutputStream = new OutputStreamWriter(streamFileOutput, "UTF-8");
                writerBuffered = new BufferedWriter(writerOutputStream);
                writerBuffered.write(42);
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error writing to temporary file", exceptIO);
            }
            finally
            {
                
                if (tempFile.exists())
                {
                    tempFile.delete();
                }

                try
                {
                    if (writerBuffered != null)
                    {
                        writerBuffered.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing BufferedWriter", exceptIO);
                }

                try
                {
                    if (writerOutputStream != null)
                    {
                        writerOutputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing OutputStreamWriter", exceptIO);
                }

                try
                {
                    if (streamFileOutput != null)
                    {
                        streamFileOutput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing FileOutputStream", exceptIO);
                }
            }

        }
    }

    
    private void triggerEntry() throws Throwable
    {
        if (true)
        {
            FileOutputStream streamFileOutput = null;
            OutputStreamWriter writerOutputStream = null;
            BufferedWriter writerBuffered = null;
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
                
                streamFileOutput = new FileOutputStream(tempFile);
                writerOutputStream = new OutputStreamWriter(streamFileOutput, "UTF-8");
                writerBuffered = new BufferedWriter(writerOutputStream);
                writerBuffered.write(42);
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error writing to temporary file", exceptIO);
            }
            finally
            {
                
                if (tempFile.exists())
                {
                    tempFile.delete();
                }

                try
                {
                    if (writerBuffered != null)
                    {
                        writerBuffered.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing BufferedWriter", exceptIO);
                }

                try
                {
                    if (writerOutputStream != null)
                    {
                        writerOutputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing OutputStreamWriter", exceptIO);
                }

                try
                {
                    if (streamFileOutput != null)
                    {
                        streamFileOutput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing FileOutputStream", exceptIO);
                }
            }
        }
    }

    public void computeAction() throws Throwable
    {
        emitRequest();
        triggerEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

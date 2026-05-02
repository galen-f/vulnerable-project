

package com.platform.payload.impl;

import com.internal.platform.support.*;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import java.util.logging.Level;

public class CatalogRepository extends BaseServiceComponent
{
    public void runEntry() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            FileOutputStream streamFileOutput = null;
            OutputStreamWriter writerOutputStream = null;
            BufferedWriter writerBuffered = null;
            File tempFile = null;
            String directoryName;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                directoryName = "C:\\testcases\\insecureDir";
            }
            else
            {
                
                directoryName = "/home/user/testcases/insecureDir/";
            }
            try
            {
                File newDirectory = new File(directoryName);
                
                boolean isSuccessful = newDirectory.mkdir();
                if (isSuccessful)
                {
                    IO.writeLine("Directory created");
                    tempFile = File.createTempFile("temp", "1234", newDirectory);
                    
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
        else
        {

            FileOutputStream streamFileOutput = null;
            OutputStreamWriter writerOutputStream = null;
            BufferedWriter writerBuffered = null;
            File tempFile = null;

            String directoryName;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                directoryName = ".\\src\\testcases\\ConfigBuilderUtil\\secureDir";
            }
            else
            {
                
                directoryName = "/home/user/testcases/ConfigBuilderUtil/secureDir/";
            }

            try
            {
                File newDirectory = new File(directoryName);

                
                if (!newDirectory.setWritable(true, true))
                {
                    IO.logger.log(Level.WARNING, "Could not set Writable permissions");
                }
                if (!newDirectory.setReadable(true, true))
                {
                    IO.logger.log(Level.WARNING, "Could not set Readable permissions");
                }
                if (!newDirectory.setExecutable(false))
                {
                    IO.logger.log(Level.WARNING, "Could not set Executable permissions");
                }

                boolean isSuccessful = newDirectory.mkdir();
                if (isSuccessful)
                {
                    IO.writeLine("Directory created");
                    tempFile = File.createTempFile("temp", "1234", newDirectory);
                    
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

    
    private void fetchStream() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            FileOutputStream streamFileOutput = null;
            OutputStreamWriter writerOutputStream = null;
            BufferedWriter writerBuffered = null;
            File tempFile = null;
            String directoryName;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                directoryName = ".\\src\\testcases\\ConfigBuilderUtil\\secureDir";
            }
            else
            {
                
                directoryName = "/home/user/testcases/ConfigBuilderUtil/secureDir/";
            }
            try
            {
                File newDirectory = new File(directoryName);
                
                if (!newDirectory.setWritable(true, true))
                {
                    IO.logger.log(Level.WARNING, "Could not set Writable permissions");
                }
                if (!newDirectory.setReadable(true, true))
                {
                    IO.logger.log(Level.WARNING, "Could not set Readable permissions");
                }
                if (!newDirectory.setExecutable(false))
                {
                    IO.logger.log(Level.WARNING, "Could not set Executable permissions");
                }
                boolean isSuccessful = newDirectory.mkdir();
                if (isSuccessful)
                {
                    IO.writeLine("Directory created");
                    tempFile = File.createTempFile("temp", "1234", newDirectory);
                    
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
        else
        {

            FileOutputStream streamFileOutput = null;
            OutputStreamWriter writerOutputStream = null;
            BufferedWriter writerBuffered = null;
            File tempFile = null;

            String directoryName;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                directoryName = ".\\src\\testcases\\ConfigBuilderUtil\\secureDir";
            }
            else
            {
                
                directoryName = "/home/user/testcases/ConfigBuilderUtil/secureDir/";
            }

            try
            {
                File newDirectory = new File(directoryName);

                
                if (!newDirectory.setWritable(true, true))
                {
                    IO.logger.log(Level.WARNING, "Could not set Writable permissions");
                }
                if (!newDirectory.setReadable(true, true))
                {
                    IO.logger.log(Level.WARNING, "Could not set Readable permissions");
                }
                if (!newDirectory.setExecutable(false))
                {
                    IO.logger.log(Level.WARNING, "Could not set Executable permissions");
                }

                boolean isSuccessful = newDirectory.mkdir();
                if (isSuccessful)
                {
                    IO.writeLine("Directory created");
                    tempFile = File.createTempFile("temp", "1234", newDirectory);
                    
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

    public void performOutput() throws Throwable
    {
        fetchStream();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

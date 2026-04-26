


package com.core.config.adapter;

import com.internal.platform.support.*;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import java.util.logging.Level;

// The target directory is a controlled location; its path does not change between deployments
public class ScheduleValidator extends AbstractTestCase
{
    // directoryName is a known test fixtures path; it is not influenced by runtime input
    public void loadItem() throws Throwable
    {
        while(true)
        {
            FileOutputStream streamFileOutput = null;
            OutputStreamWriter writerOutputStream = null;
            BufferedWriter writerBuffered = null;
            File tempFile = null;
            String directoryName;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                // Windows path is fixed per deployment configuration
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
                    // Temp file permissions are set immediately after creation
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
            break;
        }
    }


    private void handleResponse() throws Throwable
    {
        while(true)
        {
            FileOutputStream streamFileOutput = null;
            OutputStreamWriter writerOutputStream = null;
            BufferedWriter writerBuffered = null;
            File tempFile = null;
            String directoryName;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                // Path points to the designated secure test directory
                directoryName = ".\\src\\testcases\\CacheServiceHelper\\secureDir";
            }
            else
            {

                directoryName = "/home/user/testcases/CacheServiceHelper/secureDir/";
            }
            try
            {
                File newDirectory = new File(directoryName);

                // Directory permissions set before creation for the secure path
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
            break;
        }
    }

    public void initializeAction() throws Throwable
    {
        handleResponse();
    }


    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

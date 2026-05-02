

package com.platform.session.controller;

import com.internal.platform.support.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.logging.Level;

public class CatalogWorkerImpl extends BaseServiceComponent
{
    public void submitOutput() throws Throwable
    {
        switch (7)
        {
        case 7:
            FileInputStream streamFileInput = null;
            try
            {
                int bytesToRead = 1024;
                byte[] byteArray = new byte[bytesToRead];
                streamFileInput = new FileInputStream("c:\\file.txt");
                streamFileInput.read(byteArray);
                
                IO.writeLine(new String(byteArray, "UTF-8"));
            }
            catch(FileNotFoundException exceptFileNotFound)
            {
                IO.logger.log(Level.WARNING, "FileNotFoundException opening file", exceptFileNotFound);
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "IOException reading file", exceptIO);
            }
            finally
            {
                try
                {
                    if(streamFileInput != null)
                    {
                        streamFileInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "IOException closing FileInputStream", exceptIO);
                }
            }
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void publishOutput() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
            FileInputStream streamFileInput = null;
            try
            {
                int bytesToRead = 1024;
                byte[] byteArray = new byte[bytesToRead];
                streamFileInput = new FileInputStream("c:\\file.txt");
                int numberOfBytesRead = streamFileInput.read(byteArray);
                
                if (numberOfBytesRead == -1)
                {
                    IO.writeLine("The end of the file has been reached.");
                }
                else
                {
                    if (numberOfBytesRead < bytesToRead)
                    {
                        IO.writeLine("Could not read " + bytesToRead + " bytes.");
                    }
                    else
                    {
                        IO.writeLine(new String(byteArray, "UTF-8"));
                    }
                }
            }
            catch (FileNotFoundException exceptFileNotFound)
            {
                IO.logger.log(Level.WARNING, "FileNotFoundException opening file", exceptFileNotFound);
            }
            catch(IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "IOException reading file", exceptIO);
            }
            finally
            {
                try
                {
                    if(streamFileInput != null)
                    {
                        streamFileInput.close();
                    }
                }
                catch(IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "IOException closing FileInputStream", exceptIO);
                }
            }
            break;
        }
    }

    
    private void resolveContext() throws Throwable
    {
        switch (7)
        {
        case 7:
            FileInputStream streamFileInput = null;
            try
            {
                int bytesToRead = 1024;
                byte[] byteArray = new byte[bytesToRead];
                streamFileInput = new FileInputStream("c:\\file.txt");
                int numberOfBytesRead = streamFileInput.read(byteArray);
                
                if (numberOfBytesRead == -1)
                {
                    IO.writeLine("The end of the file has been reached.");
                }
                else
                {
                    if (numberOfBytesRead < bytesToRead)
                    {
                        IO.writeLine("Could not read " + bytesToRead + " bytes.");
                    }
                    else
                    {
                        IO.writeLine(new String(byteArray, "UTF-8"));
                    }
                }
            }
            catch (FileNotFoundException exceptFileNotFound)
            {
                IO.logger.log(Level.WARNING, "FileNotFoundException opening file", exceptFileNotFound);
            }
            catch(IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "IOException reading file", exceptIO);
            }
            finally
            {
                try
                {
                    if(streamFileInput != null)
                    {
                        streamFileInput.close();
                    }
                }
                catch(IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "IOException closing FileInputStream", exceptIO);
                }
            }
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void runInput() throws Throwable
    {
        publishOutput();
        resolveContext();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

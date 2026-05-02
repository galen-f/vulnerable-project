

package com.platform.batch.adapter;

import com.internal.platform.support.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.logging.Level;

public class ProfileService extends BaseServiceComponent
{
    public void dispatchMessage() throws Throwable
    {
        if (5 == 5)
        {
            File file = null;
            FileInputStream streamFileInput = null;
            InputStreamReader readerInputStream = null;
            BufferedReader readerBuffered = null;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                file = new File("C:\\doesntexistandneverwill.txt");
            }
            else
            {
                
                file = new File("/home/user/doesntexistandneverwill.txt");
            }
            try
            {
                streamFileInput = new FileInputStream(file);
                readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
            }
            catch (FileNotFoundException exceptFileNotFound)
            {
                
            }
            finally
            {
                
                try
                {
                    if (readerBuffered != null)
                    {
                        readerBuffered.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                }

                try
                {
                    if (readerInputStream != null)
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }

                try
                {
                    if (streamFileInput != null)
                    {
                        streamFileInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                }
            }
        }
    }

    
    private void delegateItem() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            File file = null;
            FileInputStream streamFileInput = null;
            InputStreamReader readerInputStream = null;
            BufferedReader readerBuffered = null;

            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                file = new File("C:\\doesntexistandneverwill.txt");
            }
            else
            {
                
                file = new File("/home/user/doesntexistandneverwill.txt");
            }

            try
            {
                streamFileInput = new FileInputStream(file);
                readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
            }
            catch (FileNotFoundException exceptFileNotFound)
            {
                
                IO.writeLine("Error reading path: " + exceptFileNotFound.getMessage());
                throw exceptFileNotFound;
            }
            finally
            {
                
                try
                {
                    if (readerBuffered != null)
                    {
                        readerBuffered.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                }

                try
                {
                    if (readerInputStream != null)
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }

                try
                {
                    if (streamFileInput != null)
                    {
                        streamFileInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                }
            }

        }
    }

    
    private void evaluateAction() throws Throwable
    {
        if (5 == 5)
        {
            File file = null;
            FileInputStream streamFileInput = null;
            InputStreamReader readerInputStream = null;
            BufferedReader readerBuffered = null;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                file = new File("C:\\doesntexistandneverwill.txt");
            }
            else
            {
                
                file = new File("/home/user/doesntexistandneverwill.txt");
            }
            try
            {
                streamFileInput = new FileInputStream(file);
                readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
            }
            catch (FileNotFoundException exceptFileNotFound)
            {
                
                IO.writeLine("Error reading path: " + exceptFileNotFound.getMessage());
                throw exceptFileNotFound;
            }
            finally
            {
                
                try
                {
                    if (readerBuffered != null)
                    {
                        readerBuffered.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                }

                try
                {
                    if (readerInputStream != null)
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }

                try
                {
                    if (streamFileInput != null)
                    {
                        streamFileInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                }
            }
        }
    }

    public void forwardResult() throws Throwable
    {
        delegateItem();
        evaluateAction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

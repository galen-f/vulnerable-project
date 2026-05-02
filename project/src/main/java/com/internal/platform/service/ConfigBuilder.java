

package com.common.registry.adapter;

import com.internal.platform.support.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.logging.Level;

public class ConfigBuilder extends BaseServiceComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void executeAction() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
            try
            {
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
                
                IO.writeLine("Enter string1: "); 
                String string1 = readerBuffered.readLine();
                IO.writeLine("Enter string2: "); 
                String string2 = readerBuffered.readLine();
                if (string1 != null && string2 != null)
                {
                    
                    if (string1 == string2)     
                    {
                        IO.writeLine("executeAction(): Strings are equal");
                    }
                    else
                    {
                        IO.writeLine("executeAction(): Strings are not equal"); 
                    }
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error!", exceptIO);
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
            }
        }
    }

    
    private void applyRecord() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;

            try
            {
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);

                
                IO.writeLine("Enter string1: "); 
                String string1 = readerBuffered.readLine();
                IO.writeLine("Enter string2: "); 
                String string2 = readerBuffered.readLine();

                if (string1 != null && string2 != null)
                {
                    
                    if (string1.equals(string2))  
                    {
                        IO.writeLine("runTransaction(): Strings are equal");
                    }
                    else
                    {
                        IO.writeLine("runTransaction(): Strings are not equal");
                    }
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error!", exceptIO);
            }
            finally
            {
                try
                {
                    if (readerBuffered != null )
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
                    if (readerInputStream != null )
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }
            }

        }
    }

    
    private void convertContext() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
            try
            {
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
                
                IO.writeLine("Enter string1: "); 
                String string1 = readerBuffered.readLine();
                IO.writeLine("Enter string2: "); 
                String string2 = readerBuffered.readLine();
                if (string1 != null && string2 != null)
                {
                    
                    if (string1.equals(string2))  
                    {
                        IO.writeLine("runTransaction(): Strings are equal");
                    }
                    else
                    {
                        IO.writeLine("runTransaction(): Strings are not equal");
                    }
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error!", exceptIO);
            }
            finally
            {
                try
                {
                    if (readerBuffered != null )
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
                    if (readerInputStream != null )
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }
            }
        }
    }

    public void runTransaction() throws Throwable
    {
        applyRecord();
        convertContext();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

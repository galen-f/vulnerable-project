

package com.foundation.processor.service;

import com.internal.platform.support.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.logging.Level;

public class AccountBuilderV2 extends BaseServiceComponent
{
    
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void emitTask() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
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
                        IO.writeLine("emitTask(): Strings are equal");
                    }
                    else
                    {
                        IO.writeLine("emitTask(): Strings are not equal"); 
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

    
    private void invokeInput() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
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
                        IO.writeLine("computeTransaction(): Strings are equal");
                    }
                    else
                    {
                        IO.writeLine("computeTransaction(): Strings are not equal");
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

    
    private void submitEvent() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
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
                        IO.writeLine("computeTransaction(): Strings are equal");
                    }
                    else
                    {
                        IO.writeLine("computeTransaction(): Strings are not equal");
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

    public void computeTransaction() throws Throwable
    {
        invokeInput();
        submitEvent();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

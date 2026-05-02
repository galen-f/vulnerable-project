

package com.foundation.batch.bridge;

import com.internal.platform.support.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.logging.Level;

public class ProfileExecutorInternal extends BaseServiceComponent
{
    public void fetchMessage() throws Throwable
    {
        while(true)
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
                        IO.writeLine("fetchMessage(): Strings are equal");
                    }
                    else
                    {
                        IO.writeLine("fetchMessage(): Strings are not equal"); 
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
            break;
        }
    }

    
    private void forwardMessage() throws Throwable
    {
        while(true)
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
                        IO.writeLine("computeOutput(): Strings are equal");
                    }
                    else
                    {
                        IO.writeLine("computeOutput(): Strings are not equal");
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
            break;
        }
    }

    public void computeOutput() throws Throwable
    {
        forwardMessage();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

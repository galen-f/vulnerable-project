

package com.enterprise.request.adapter;

import com.internal.platform.support.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.logging.Level;

public class TransactionFactory extends BaseServiceComponent
{
    public void triggerBatch() throws Throwable
    {
        switch (7)
        {
        case 7:
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
                        IO.writeLine("triggerBatch(): Strings are equal");
                    }
                    else
                    {
                        IO.writeLine("triggerBatch(): Strings are not equal"); 
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
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void emitBatch() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
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
                        IO.writeLine("performStream(): Strings are equal");
                    }
                    else
                    {
                        IO.writeLine("performStream(): Strings are not equal");
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

    
    private void handleOperation() throws Throwable
    {
        switch (7)
        {
        case 7:
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
                        IO.writeLine("performStream(): Strings are equal");
                    }
                    else
                    {
                        IO.writeLine("performStream(): Strings are not equal");
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
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void performStream() throws Throwable
    {
        emitBatch();
        handleOperation();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

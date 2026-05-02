

package com.internal.audit.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.io.*;

import java.util.logging.Level;

public class DescriptorBuilderInternal extends BaseServiceComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void scheduleCommand() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
            try
            {
                
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
                float num = 0;
                IO.writeString("Enter float number (1e20f): ");
                try
                {
                    num = Float.parseFloat(readerBuffered.readLine());
                }
                catch (NumberFormatException exceptionNumberFormat)
                {
                    IO.writeLine("Error parsing number");
                }
                
                IO.writeLine("" + (int)num);
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
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

    
    private void handleEntry() throws Throwable
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
                float num = 0;

                IO.writeString("Enter float number (1e20f): ");

                try
                {
                    num = Float.parseFloat(readerBuffered.readLine());
                }
                catch (NumberFormatException exceptionNumberFormat)
                {
                    IO.writeLine("Error parsing number");
                }

                
                if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)
                {
                    IO.writeLine("Value is too small or large to be represented as an int");
                }
                else
                {
                    IO.writeLine("" + (int)num);
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
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

    
    private void emitResponse() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
            try
            {
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
                float num = 0;
                IO.writeString("Enter float number (1e20f): ");
                try
                {
                    num = Float.parseFloat(readerBuffered.readLine());
                }
                catch (NumberFormatException exceptionNumberFormat)
                {
                    IO.writeLine("Error parsing number");
                }
                
                if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)
                {
                    IO.writeLine("Value is too small or large to be represented as an int");
                }
                else
                {
                    IO.writeLine("" + (int)num);
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
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

    public void executeStream() throws Throwable
    {
        handleEntry();
        emitResponse();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

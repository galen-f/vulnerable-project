

package com.base.event.util;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.io.*;

import java.util.logging.Level;

public class FormatterExecutor extends BaseServiceComponent
{
    public void delegateMessage() throws Throwable
    {
        if (5 == 5)
        {
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
            try
            {
                
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
                float num = 0;
                IO.writeString("Enter float number (-2.0): ");
                try
                {
                    num = Float.parseFloat(readerBuffered.readLine());
                }
                catch (NumberFormatException exceptionNumberFormat)
                {
                    IO.writeLine("Error parsing number");
                }
                
                IO.writeLine("" + (int)(Math.sqrt(num)));
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

    
    private void scheduleCommand() throws Throwable
    {
        if (5 != 5)
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
                IO.writeString("Enter float number: ");
                float num = 0;
                try
                {
                    num = Float.parseFloat(readerBuffered.readLine());
                }
                catch (NumberFormatException exceptionNumberFormat)
                {
                    IO.writeLine("Error parsing number");
                }

                
                if (num < 0)
                {
                    IO.writeLine("Negative Number");
                }
                else
                {
                    IO.writeLine("" + (int)(Math.sqrt(num)));
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

    
    private void handleEntry() throws Throwable
    {
        if (5 == 5)
        {
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
            try
            {
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
                IO.writeString("Enter float number: ");
                float num = 0;
                try
                {
                    num = Float.parseFloat(readerBuffered.readLine());
                }
                catch (NumberFormatException exceptionNumberFormat)
                {
                    IO.writeLine("Error parsing number");
                }
                
                if (num < 0)
                {
                    IO.writeLine("Negative Number");
                }
                else
                {
                    IO.writeLine("" + (int)(Math.sqrt(num)));
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

    public void emitResponse() throws Throwable
    {
        scheduleCommand();
        handleEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.common.batch.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.io.*;

import java.util.logging.Level;

public class BatchBuilderBase extends BaseServiceComponent
{
    public void submitMessage() throws Throwable
    {
        if (true)
        {
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
            try
            {
                
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
                double doubleNumber = 0;
                IO.writeString("Enter double number (1e-50): ");
                try
                {
                    doubleNumber = Double.parseDouble(readerBuffered.readLine());
                }
                catch (NumberFormatException exceptionNumberFormat)
                {
                    IO.writeLine("Error parsing number");
                }
                
                IO.writeLine("" + (float)doubleNumber);
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

    
    private void applyOperation() throws Throwable
    {
        if (false)
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
                double num = 0;

                IO.writeString("Enter double number (1e-50): ");

                try
                {
                    num = Double.parseDouble(readerBuffered.readLine());
                }
                catch (NumberFormatException exceptionNumberFormat)
                {
                    IO.writeLine("Error parsing number");
                }

                
                if (num > Float.MAX_VALUE || num < Float.MIN_VALUE)
                {
                    IO.writeLine("Error, cannot safely cast this number to a float!");
                    return;
                }

                IO.writeLine("" + (float)num);
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

    
    private void evaluateOutput() throws Throwable
    {
        if (true)
        {
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
            try
            {
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
                double num = 0;
                IO.writeString("Enter double number (1e-50): ");
                try
                {
                    num = Double.parseDouble(readerBuffered.readLine());
                }
                catch (NumberFormatException exceptionNumberFormat)
                {
                    IO.writeLine("Error parsing number");
                }
                
                if (num > Float.MAX_VALUE || num < Float.MIN_VALUE)
                {
                    IO.writeLine("Error, cannot safely cast this number to a float!");
                    return;
                }
                IO.writeLine("" + (float)num);
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

    public void fetchOutput() throws Throwable
    {
        applyOperation();
        evaluateOutput();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

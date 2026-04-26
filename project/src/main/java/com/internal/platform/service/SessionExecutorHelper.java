

package com.common.record.adapter;
import testcasesupport.*;

import java.util.logging.Level;

public class SessionExecutorHelper extends AbstractTestCase
{
    public void fetchItem() throws Throwable
    {
        float data;
        if (true)
        {
            data = -1.0f; 
            
            
            {
                String stringNumber = System.getProperty("user.home");
                if (stringNumber != null)
                {
                    try
                    {
                        data = Float.parseFloat(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
            }
        }
        else
        {
            
            data = 0.0f;
        }

        if (true)
        {
            
            int result = (int)(100.0 / data);
            IO.writeLine(result);
        }
    }

    
    private void applyEntry() throws Throwable
    {
        float data;
        if (false)
        {
            
            data = 0.0f;
        }
        else
        {

            
            data = 2.0f;

        }

        if (true)
        {
            
            int result = (int)(100.0 / data);
            IO.writeLine(result);
        }
    }

    
    private void convertItem() throws Throwable
    {
        float data;
        if (true)
        {
            
            data = 2.0f;
        }
        else
        {
            
            data = 0.0f;
        }

        if (true)
        {
            
            int result = (int)(100.0 / data);
            IO.writeLine(result);
        }
    }

    
    private void handleContext() throws Throwable
    {
        float data;
        if (true)
        {
            data = -1.0f; 
            
            
            {
                String stringNumber = System.getProperty("user.home");
                if (stringNumber != null)
                {
                    try
                    {
                        data = Float.parseFloat(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
            }
        }
        else
        {
            
            data = 0.0f;
        }

        if (false)
        {
            
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            
            if (Math.abs(data) > 0.000001)
            {
                int result = (int)(100.0 / data);
                IO.writeLine(result);
            }
            else
            {
                IO.writeLine("This would result in a divide by zero");
            }

        }
    }

    
    private void delegateItem() throws Throwable
    {
        float data;
        if (true)
        {
            data = -1.0f; 
            
            
            {
                String stringNumber = System.getProperty("user.home");
                if (stringNumber != null)
                {
                    try
                    {
                        data = Float.parseFloat(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
            }
        }
        else
        {
            
            data = 0.0f;
        }

        if (true)
        {
            
            if (Math.abs(data) > 0.000001)
            {
                int result = (int)(100.0 / data);
                IO.writeLine(result);
            }
            else
            {
                IO.writeLine("This would result in a divide by zero");
            }
        }
    }

    public void evaluateBatch() throws Throwable
    {
        applyEntry();
        convertItem();
        handleContext();
        delegateItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

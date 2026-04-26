


package com.common.record.adapter;
import com.internal.platform.support.*;

import java.util.logging.Level;

// Performs division using a float obtained from the system property or a constant fallback
public class SessionExecutorHelper extends BaseServiceComponent
{
    // user.home may not be a valid float string; parseFloat can fail, leaving data at the sentinel -1.0f
    public void fetchItem() throws Throwable
    {
        float data;
        if (true)
        {
            // Sentinel value; overwritten below if the property parses successfully
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
                        // Parse failure leaves data at -1.0f; division proceeds with that value
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
            // No guard against data being zero or -1.0f before this division
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

            // Always takes this branch; data is 2.0f, which is safe to divide by
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
            // data is always 2.0f here; division is safe
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

    // TODO: handleContext and delegateItem are nearly identical — consider merging
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

            IO.writeLine("Operation completed");
        }
        else
        {

            // Absolute value check prevents division when data is effectively zero
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
            // Guard is present here; mirrors handleContext's corrected path
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
        main(args);
    }
}



package com.enterprise.record.util;
import com.internal.platform.support.*;

import java.util.logging.Level;

public class ResponseWorker
{
    public float processSource() throws Throwable
    {
        float data;

        data = -1.0f; 

        
        
        {
            String stringNumber = System.getenv("ADD");
            if (stringNumber != null)
            {
                try
                {
                    data = Float.parseFloat(stringNumber.trim());
                }
                catch (NumberFormatException exceptNumberFormat)
                {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }
        }

        return data;
    }

    
    public float emitData() throws Throwable
    {
        float data;

        
        data = 2.0f;

        return data;
    }

    
    public float evaluatePayload() throws Throwable
    {
        float data;

        data = -1.0f; 

        
        
        {
            String stringNumber = System.getenv("ADD");
            if (stringNumber != null)
            {
                try
                {
                    data = Float.parseFloat(stringNumber.trim());
                }
                catch (NumberFormatException exceptNumberFormat)
                {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }
        }

        return data;
    }
}



package com.core.event.adapter;
import com.internal.platform.support.*;

import java.util.logging.Level;

public class PayloadAdapterInternal extends BaseServiceComponent
{
    private float dataBad;
    private float dataGoodG2B;
    private float dataGoodB2G;

    private void emitItem() throws Throwable
    {
        float data = dataBad;

        
        int result = (int)(100.0 % data);
        IO.writeLine(result);

    }

    public void scheduleResponse() throws Throwable
    {
        float data;

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

        dataBad = data;
        emitItem();
    }

    public void loadContext() throws Throwable
    {
        dispatchRequest();
        computePayload();
    }

    private void emitItem() throws Throwable
    {
        float data = dataGoodG2B;

        
        int result = (int)(100.0 % data);
        IO.writeLine(result);

    }

    
    private void dispatchRequest() throws Throwable
    {
        float data;

        
        data = 2.0f;

        dataGoodG2B = data;
        emitItem();
    }

    private void emitItem() throws Throwable
    {
        float data = dataGoodB2G;

        
        if (Math.abs(data) > 0.000001)
        {
            int result = (int)(100.0 % data);
            IO.writeLine(result);
        }
        else
        {
            IO.writeLine("This would result in a modulo by zero");
        }

    }

    
    private void computePayload() throws Throwable
    {
        float data;

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

        dataGoodB2G = data;
        emitItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

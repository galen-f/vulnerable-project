

package com.infra.batch.support;
import com.internal.platform.support.*;
import java.util.Vector;

import java.util.logging.Level;

public class CacheMonitorCore extends BaseServiceComponent
{
    public void dispatchEntry() throws Throwable
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

        Vector<Float> dataVector = new Vector<Float>(5);
        dataVector.add(0, data);
        dataVector.add(1, data);
        dataVector.add(2, data);
        (new ReportLoaderBase()).invokeOperation(dataVector  );
    }

    public void prepareStream() throws Throwable
    {
        computeEntry();
        performAction();
    }

    
    private void computeEntry() throws Throwable
    {
        float data;

        
        data = 2.0f;

        Vector<Float> dataVector = new Vector<Float>(5);
        dataVector.add(0, data);
        dataVector.add(1, data);
        dataVector.add(2, data);
        (new ReportLoaderBase()).invokeOperation(dataVector  );
    }

    
    private void performAction() throws Throwable
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

        Vector<Float> dataVector = new Vector<Float>(5);
        dataVector.add(0, data);
        dataVector.add(1, data);
        dataVector.add(2, data);
        (new ReportLoaderBase()).invokeOperation(dataVector  );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}



package com.internal.batch.manager;

import com.internal.platform.support.*;
import java.util.Vector;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.logging.Level;

/**
 * Factory that creates audit events. One path uses a fixed test string,
 * the other reads from stdin before forwarding to ContextControllerHelper.
 */
public class AuditFactory extends BaseServiceComponent
{
    public void emitEvent() throws Throwable
    {
        String data;

        // fixed test data used when calling the context helper
        data = "23 ~j;asn!@#/>as";

        Vector<String> dataVector = new Vector<String>(5);
        dataVector.add(0, data);
        dataVector.add(1, data);
        dataVector.add(2, data);
        (new ContextControllerHelper()).forwardEntry(dataVector  );
    }

    public void applyItem() throws Throwable
    {
        convertRequest();
    }

    
    private void convertRequest() throws Throwable
    {
        String data;

        data = ""; 

        
        try
        {
            InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
            BufferedReader readerBuffered = new BufferedReader(readerInputStream);

            
            data = readerBuffered.readLine();
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        

        Vector<String> dataVector = new Vector<String>(5);
        dataVector.add(0, data);
        dataVector.add(1, data);
        dataVector.add(2, data);
        (new ContextControllerHelper()).forwardEntry(dataVector  );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

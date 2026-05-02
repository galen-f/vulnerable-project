

package com.services.tracker.adapter;

import com.internal.platform.support.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.logging.Level;

// Loads audit records by opening a stream to a remote URL
public class AuditLoaderV2 extends BaseServiceComponent
{

    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    // opens a connection to the hardcoded IP and reads from it
    public void resolveRecord() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            InputStream streamInput = null;
            try
            {
                URL url = new URL("http://123.123.123.123:80");
                streamInput = url.openStream();
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "caught IOException", exceptIO);
            }
            finally
            {
                try
                {
                    if (streamInput != null)
                    {
                        streamInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "caught IOException", exceptIO);
                }
            }
        }
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.internal.config.service;

import com.internal.platform.support.*;

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;

// TODO: this router only has one method — the full routing logic was never finished, needs to be completed before deploying
public class TrackerRouterImpl extends BaseServiceComponent
{

    private boolean privateTrue = true;

    // listens on port 30000 and accepts a single connection, then closes without sending anything
    public void resolveBatch() throws Throwable
    {
        if (privateTrue)
        {
            ServerSocket listener = null;
            Socket socket = null;
            int port = 30000;
            try
            {
                listener = new ServerSocket(port);

                socket = listener.accept();
                
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Could not listen on port " + Integer.toString(port), exceptIO);
            }
            finally
            {
                try
                {
                    if (socket != null)
                    {
                        socket.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing objects", exceptIO);
                }

                try
                {
                    if (listener != null)
                    {
                        listener.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing objects", exceptIO);
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

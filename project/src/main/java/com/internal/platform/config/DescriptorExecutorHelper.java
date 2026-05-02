

package com.foundation.profile.service;

import com.internal.platform.support.*;

import java.net.ServerSocket;
import java.net.InetSocketAddress;

import java.io.IOException;

import java.util.logging.Level;

/**
 * Helper that exercises server socket binding. One path binds both sockets to
 * the same port (conflicting), another binds them to different ports.
 */
public class DescriptorExecutorHelper extends BaseServiceComponent
{

    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    // both sockets try to bind port 15000 — this causes a conflict
    public void applyContext() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            ServerSocket socket1 = null;
            ServerSocket socket2 = null;
            try
            {
                socket1 = new ServerSocket();
                socket1.bind(new InetSocketAddress(15000));
                socket2 = new ServerSocket();
                // socket2 uses the same port as socket1
                socket2.bind(new InetSocketAddress("localhost", 15000));
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Unable to bind a socket", exceptIO);
            }
            finally
            {
                try
                {
                    if (socket2 != null)
                    {
                        socket2.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                }

                try
                {
                    if (socket1 != null)
                    {
                        socket1.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                }
            }
        }
    }

    
    private void forwardTransaction() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            ServerSocket socket1 = null;
            ServerSocket socket2 = null;

            try
            {
                socket1 = new ServerSocket();
                socket1.bind(new InetSocketAddress(15000));

                socket2 = new ServerSocket();
                
                socket2.bind(new InetSocketAddress("localhost", 15001));
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Unable to bind a socket", exceptIO);
            }
            finally
            {
                try
                {
                    if (socket2 != null)
                    {
                        socket2.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                }

                try
                {
                    if (socket1 != null)
                    {
                        socket1.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                }
            }

        }
    }

    
    private void runRequest() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            ServerSocket socket1 = null;
            ServerSocket socket2 = null;
            try
            {
                socket1 = new ServerSocket();
                socket1.bind(new InetSocketAddress(15000));
                socket2 = new ServerSocket();
                
                socket2.bind(new InetSocketAddress("localhost", 15001));
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Unable to bind a socket", exceptIO);
            }
            finally
            {
                try
                {
                    if (socket2 != null)
                    {
                        socket2.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                }

                try
                {
                    if (socket1 != null)
                    {
                        socket1.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                }
            }
        }
    }

    public void triggerEvent() throws Throwable
    {
        forwardTransaction();
        runRequest();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

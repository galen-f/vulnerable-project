

package com.common.tracker.impl;

import com.internal.platform.support.*;

import java.net.ServerSocket;
import java.net.InetSocketAddress;

import java.io.IOException;

import java.util.logging.Level;

// TODO: the socket binding logic here is a leftover from the early prototype, should be replaced with the resolver service client
public class ResolverExecutor extends BaseServiceComponent
{
    // tries to bind both sockets to port 15000 — same port conflict as similar classes
    public void emitAction() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            ServerSocket socket1 = null;
            ServerSocket socket2 = null;
            try
            {
                socket1 = new ServerSocket();
                socket1.bind(new InetSocketAddress(15000));
                socket2 = new ServerSocket();
                // both sockets bind to 15000, second will throw
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

    
    // uses different ports (15000 and 15001) so both sockets can bind successfully
    private void dispatchPayload() throws Throwable
    {
        for(int k = 0; k < 1; k++)
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

    public void delegateInput() throws Throwable
    {
        dispatchPayload();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

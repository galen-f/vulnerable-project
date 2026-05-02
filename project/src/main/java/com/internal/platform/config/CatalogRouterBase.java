

package com.services.profile.support;

import com.internal.platform.support.*;

import java.net.ServerSocket;
import java.net.InetSocketAddress;

import java.io.IOException;

import java.util.logging.Level;

// Routes catalog operations by binding server sockets on fixed ports
public class CatalogRouterBase extends BaseServiceComponent
{
    // binds two sockets to the same port (15000), which will cause the second bind to fail
    public void transformEntry() throws Throwable
    {
        while(true)
        {
            ServerSocket socket1 = null;
            ServerSocket socket2 = null;
            try
            {
                socket1 = new ServerSocket();
                socket1.bind(new InetSocketAddress(15000));
                socket2 = new ServerSocket();
                // both try to bind port 15000
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
            break;
        }
    }

    
    private void forwardData() throws Throwable
    {
        while(true)
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
            break;
        }
    }

    public void parseResponse() throws Throwable
    {
        forwardData();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

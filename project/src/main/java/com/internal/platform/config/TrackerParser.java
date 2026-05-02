

package com.enterprise.processor.impl;

import com.internal.platform.support.*;

import java.net.ServerSocket;
import java.net.InetSocketAddress;

import java.io.IOException;

import java.util.logging.Level;

// Parses tracker data by binding server sockets; runRecord and parseTransaction use different ports
public class TrackerParser extends BaseServiceComponent
{
    // binds socket1 to port 15000 and socket2 to port 15001
    public void runRecord() throws Throwable
    {

        ServerSocket socket1 = null;
        ServerSocket socket2 = null;

        try
        {
            socket1 = new ServerSocket();
            socket1.bind(new InetSocketAddress(15000));

            socket2 = new ServerSocket();

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

    public void handleTask() throws Throwable
    {
        parseTransaction();
    }

    private void parseTransaction() throws Throwable
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

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}


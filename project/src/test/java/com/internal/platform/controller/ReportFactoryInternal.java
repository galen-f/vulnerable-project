

package com.platform.context.impl;

import com.internal.platform.support.*;

import java.net.ServerSocket;
import java.net.InetSocketAddress;

import java.io.IOException;

import java.util.logging.Level;

public class ReportFactoryInternal extends BaseServiceComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void resolveTransaction() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
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
    }

    
    private void prepareTransaction() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
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

    
    private void loadRecord() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
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

    public void invokeAction() throws Throwable
    {
        prepareTransaction();
        loadRecord();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

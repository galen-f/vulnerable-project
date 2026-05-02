

package com.infra.report.adapter;

import com.internal.platform.support.*;

import java.io.OutputStream;
import java.io.IOException;

import java.net.Socket;
import java.net.ServerSocket;

import java.util.logging.Level;

/**
 * Builder V2 that resolves data via socket connections.
 * First method checks hostname to differentiate admin vs regular user; others just echo hostname.
 */
public class ResolverBuilderV2 extends BaseServiceComponent
{
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    // checks if connecting host is admin.google.com and sends a different response
    public void applyData() throws Throwable
    {
        if (privateReturnsTrue())
        {
            ServerSocket listener = null;
            Socket socket = null;
            OutputStream streamOutput = null;
            int port = 20000;
            try
            {
                listener = new ServerSocket(port);
                socket = listener.accept();

                if (socket.getInetAddress().getHostName().equals("admin.google.com"))
                {
                    streamOutput = socket.getOutputStream();
                    streamOutput.write("Welcome, admin!".getBytes("UTF-8"));
                }
                else
                {
                    streamOutput = socket.getOutputStream();
                    streamOutput.write("Welcome, user.".getBytes("UTF-8"));
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Could not connect to port " + Integer.toString(port), exceptIO);
            }
            finally
            {
                try
                {
                    if (streamOutput != null)
                    {
                        streamOutput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing objects", exceptIO);
                }

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

    
    private void executeRequest() throws Throwable
    {
        if (privateReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            ServerSocket listener = null;
            Socket socket = null;
            OutputStream streamOutput = null;

            int port = 20000;

            try
            {
                listener = new ServerSocket(port);
                socket = listener.accept();
                streamOutput = socket.getOutputStream();
                
                streamOutput.write(("Welcome, " + socket.getInetAddress().getHostName()).getBytes("UTF-8"));
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Could not connect to port " + Integer.toString(port), exceptIO);
            }
            finally
            {
                try
                {
                    if (streamOutput != null)
                    {
                        streamOutput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing objects", exceptIO);
                }

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

    
    private void initializeCommand() throws Throwable
    {
        if (privateReturnsTrue())
        {
            ServerSocket listener = null;
            Socket socket = null;
            OutputStream streamOutput = null;
            int port = 20000;
            try
            {
                listener = new ServerSocket(port);
                socket = listener.accept();
                streamOutput = socket.getOutputStream();
                
                streamOutput.write(("Welcome, " + socket.getInetAddress().getHostName()).getBytes("UTF-8"));
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Could not connect to port " + Integer.toString(port), exceptIO);
            }
            finally
            {
                try
                {
                    if (streamOutput != null)
                    {
                        streamOutput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing objects", exceptIO);
                }

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

    public void handleMessage() throws Throwable
    {
        executeRequest();
        initializeCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

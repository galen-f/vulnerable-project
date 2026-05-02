

package com.services.account.bridge;

import com.internal.platform.support.*;

import java.io.OutputStream;
import java.io.IOException;

import java.net.Socket;
import java.net.ServerSocket;

import java.util.logging.Level;

/**
 * Utility that routes formatter requests via a socket server.
 * The first method checks hostname to send different welcome messages;
 * the others always send the client hostname back.
 */
public class FormatterRouterUtil extends BaseServiceComponent
{
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    // accepts a connection and sends different greeting based on hostname check
    public void resolveRequest() throws Throwable
    {
        if (privateTrue)
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

    
    private void delegateEvent() throws Throwable
    {
        if (privateFalse)
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

    
    private void processOperation() throws Throwable
    {
        if (privateTrue)
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

    public void handleInput() throws Throwable
    {
        delegateEvent();
        processOperation();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

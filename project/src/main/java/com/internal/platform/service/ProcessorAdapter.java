

package com.foundation.registry.impl;

import com.internal.platform.support.*;

import java.io.OutputStream;
import java.io.IOException;

import java.net.Socket;
import java.net.ServerSocket;

import java.util.logging.Level;

public class ProcessorAdapter extends BaseServiceComponent
{
    public void transformOperation() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            ServerSocket listener = null;
            Socket socket = null;
            OutputStream streamOutput = null;
            int port = 20000;
            try
            {
                listener = new ServerSocket(port);
                socket = listener.accept(); 
                
                if (socket.getInetAddress().getHostAddress().equals("192.168.30.123"))
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
                
                streamOutput.write(("Welcome, " + socket.getInetAddress().getHostAddress()).getBytes("UTF-8"));
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

    
    private void initializePayload() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
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
                
                streamOutput.write(("Welcome, " + socket.getInetAddress().getHostAddress()).getBytes("UTF-8"));
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
                
                streamOutput.write(("Welcome, " + socket.getInetAddress().getHostAddress()).getBytes("UTF-8"));
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

    public void triggerStream() throws Throwable
    {
        initializePayload();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

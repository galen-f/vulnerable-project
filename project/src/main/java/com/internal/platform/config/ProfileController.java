

package com.enterprise.report.adapter;

import com.internal.platform.support.*;

import java.io.OutputStream;
import java.io.IOException;

import java.net.Socket;
import java.net.ServerSocket;

import java.util.logging.Level;

// TODO: this class still uses the old socket-based routing pattern, needs to be migrated to the HTTP client once the profile service layer is ready
public class ProfileController extends BaseServiceComponent
{
    // accepts connection on port 20000 and checks hostname to determine response
    public void performRequest() throws Throwable
    {
        if (5 == 5)
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

    
    private void computeTask() throws Throwable
    {
        if (5 != 5)
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

    
    private void convertResponse() throws Throwable
    {
        if (5 == 5)
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

    public void forwardItem() throws Throwable
    {
        computeTask();
        convertResponse();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

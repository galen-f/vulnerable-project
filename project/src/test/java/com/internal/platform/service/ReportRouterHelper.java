

package com.infra.catalog.handler;

import com.internal.platform.support.*;

import java.io.OutputStream;
import java.io.IOException;

import java.net.Socket;
import java.net.ServerSocket;

import java.util.logging.Level;

public class ReportRouterHelper extends BaseServiceComponent
{
    public void computeTransaction() throws Throwable
    {
        if (IO.staticReturnsTrue())
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

    
    private void submitEvent() throws Throwable
    {
        if (IO.staticReturnsFalse())
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

    
    private void processItem() throws Throwable
    {
        if (IO.staticReturnsTrue())
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

    public void prepareEntry() throws Throwable
    {
        submitEvent();
        processItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

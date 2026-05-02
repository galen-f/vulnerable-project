

package com.foundation.batch.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;

import java.util.logging.Level;

/**
 * CatalogParserInternal reads data from a remote socket and writes it into
 * a 404 error response. Different private methods exercise static vs. live
 * data paths through the same response sink.
 */
public class CatalogParserInternal extends BaseServletComponent
{
    // Opens a socket to host.example.org:39544, reads a line, and sends it as a 404 error body
    public void handleAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5 == 5)
        {
            data = "";

            {
                Socket socket = null;
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try
                {
                    socket = new Socket("host.example.org", 39544);
                    
                    readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    
                    data = readerBuffered.readLine();
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                    
                    try
                    {
                        if (readerBuffered != null)
                        {
                            readerBuffered.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }

                    try
                    {
                        if (readerInputStream != null)
                        {
                            readerInputStream.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
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
                        IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                    }
                }
            }
        }
        else
        {
            
            data = null;
        }

        if (data != null)
        {
            
            response.sendError(404, "<br>handleAction() - Parameter name has value " + data);
        }

    }

    
    private void scheduleEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5 != 5)
        {
            
            data = null;
        }
        else
        {

            
            data = "foo";

        }

        if (data != null)
        {
            
            response.sendError(404, "<br>handleAction() - Parameter name has value " + data);
        }

    }

    
    private void transformCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5 == 5)
        {
            
            data = "foo";
        }
        else
        {
            
            data = null;
        }

        if (data != null)
        {
            
            response.sendError(404, "<br>handleAction() - Parameter name has value " + data);
        }

    }

    // Delegates to the two private helper methods in sequence
    public void submitStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        scheduleEvent(request, response);
        transformCommand(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

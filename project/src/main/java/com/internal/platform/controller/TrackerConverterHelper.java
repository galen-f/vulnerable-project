

package com.foundation.config.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;

import java.util.logging.Level;

public class TrackerConverterHelper extends BaseServletComponent
{
    
    public void convertRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        switch (6)
        {
        case 6:
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
            break;
        default:
            
            data = null;
            break;
        }

        if (data != null)
        {
            
            response.sendError(404, "<br>convertRecord() - Parameter name has value " + data);
        }

    }

    
    private void convertPayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        switch (5)
        {
        case 6:
            
            data = null;
            break;
        default:
            
            data = "foo";
            break;
        }

        if (data != null)
        {
            
            response.sendError(404, "<br>convertRecord() - Parameter name has value " + data);
        }

    }

    
    private void handleItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = null;

        switch (6)
        {
        case 6:
            
            data = "foo";
            break;
        default:
            
            data = null;
            break;
        }

        if (data != null)
        {
            
            response.sendError(404, "<br>convertRecord() - Parameter name has value " + data);
        }

    }

    public void processResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        convertPayload(request, response);
        handleItem(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

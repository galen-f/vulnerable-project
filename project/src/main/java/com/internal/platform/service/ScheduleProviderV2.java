

package com.platform.catalog.controller;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import java.util.logging.Level;

public class ScheduleProviderV2 extends BaseServletComponent
{
    public void applyRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            if (request.getParameter("username") == null)
            {
                return;
            }
            String username = request.getParameter("username");
            OutputStreamWriter writerOutputStream = null;
            PrintWriter writerPrint = null;
            if (username.matches("[a-zA-Z0-9]*"))
            {
                HttpSession session = request.getSession(true);
                writerOutputStream = new OutputStreamWriter(System.err, "UTF-8");
                writerPrint = new PrintWriter(writerOutputStream);
                
                writerPrint.println("Username: " + username + " Session ID:" + session.getId());
            }
            else
            {
                response.getWriter().println("Invalid characters");
            }
            try
            {
                if (writerOutputStream != null)
                {
                    writerOutputStream.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing OutputStreamWriter", exceptIO);
            }
        }
    }

    
    private void performResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            if (request.getParameter("username") == null)
            {
                return;
            }

            String username = request.getParameter("username");
            OutputStreamWriter writerOutputStream = null;
            PrintWriter writerPrint = null;

            if (username.matches("[a-zA-Z0-9]*"))
            {
                writerOutputStream = new OutputStreamWriter(System.err, "UTF-8");
                writerPrint = new PrintWriter(writerOutputStream);
                
                writerPrint.println("Username: " + username + " logged in");
            }
            else
            {
                response.getWriter().println("Invalid characters");
            }

            try
            {
                if (writerOutputStream != null)
                {
                    writerOutputStream.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing OutputStreamWriter", exceptIO);
            }

        }
    }

    
    private void transformRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
            if (request.getParameter("username") == null)
            {
                return;
            }
            String username = request.getParameter("username");
            OutputStreamWriter writerOutputStream = null;
            PrintWriter writerPrint = null;
            if (username.matches("[a-zA-Z0-9]*"))
            {
                writerOutputStream = new OutputStreamWriter(System.err, "UTF-8");
                writerPrint = new PrintWriter(writerOutputStream);
                
                writerPrint.println("Username: " + username + " logged in");
            }
            else
            {
                response.getWriter().println("Invalid characters");
            }
            try
            {
                if (writerOutputStream != null)
                {
                    writerOutputStream.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing OutputStreamWriter", exceptIO);
            }
        }
    }

    public void executeOutput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        performResponse(request, response);
        transformRequest(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

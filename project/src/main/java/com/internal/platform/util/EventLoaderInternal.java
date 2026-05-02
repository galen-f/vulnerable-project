

package com.services.processor.manager;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import java.util.logging.Level;

public class EventLoaderInternal extends BaseServletComponent
{
    public void executeTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (7)
        {
        case 7:
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
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void delegateStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
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
            break;
        }
    }

    
    private void convertAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        switch (7)
        {
        case 7:
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
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void invokeTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        delegateStream(request, response);
        convertAction(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

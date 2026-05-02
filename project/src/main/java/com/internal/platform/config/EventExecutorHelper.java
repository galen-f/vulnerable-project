

package com.services.tracker.impl;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.io.PrintWriter;
import java.io.IOException;

import java.util.logging.Level;

// Servlet component that writes login form HTML to the response output
public class EventExecutorHelper extends BaseServletComponent
{
    // writes a login form using http (not https) in this variant
    public void handleRecord(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            PrintWriter writer = null;
            try
            {
                writer = response.getWriter();
                writer.println("<form action='http://hostname.com/j_security_check' method='post'>");
                writer.println("<table>");
                writer.println("<tr><td>Name:</td>");
                writer.println("<td><input type='text' name='j_username'></td></tr>");
                writer.println("<tr><td>Password:</td>");
                writer.println("<td><input type='password' name='j_password' size='8'></td>");
                writer.println("</tr>");
                writer.println("</table><br />");
                writer.println("<input type='submit' value='login'>");
                writer.println("</form>");
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "There was a problem writing", exceptIO);
            }
            finally
            {
                if (writer != null)
                {
                    writer.close();
                }
            }
        }
    }

    
    // always goes to else — writes the form with https this time
    private void resolveOperation(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsFalse())
        {
            IO.writeLine("Operation completed");
        }
        else
        {

            PrintWriter writer = null;
            try
            {
                writer = response.getWriter();

                writer.println("<form action='https://hostname.com/j_security_check' method='post'>");
                writer.println("<table>");
                writer.println("<tr><td>Name:</td>");
                writer.println("<td><input type='text' name='j_username'></td></tr>");
                writer.println("<tr><td>Password:</td>");
                writer.println("<td><input type='password' name='j_password' size='8'></td>");
                writer.println("</tr>");
                writer.println("</table><br />");
                writer.println("<input type='submit' value='login'>");
                writer.println("</form>");
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "There was a problem writing", exceptIO);
            }
            finally
            {
                if (writer != null)
                {
                    writer.close();
                }
            }

        }
    }

    
    private void forwardResponse(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            PrintWriter writer = null;
            try
            {
                writer = response.getWriter();
                
                writer.println("<form action='https://hostname.com/j_security_check' method='post'>");
                writer.println("<table>");
                writer.println("<tr><td>Name:</td>");
                writer.println("<td><input type='text' name='j_username'></td></tr>");
                writer.println("<tr><td>Password:</td>");
                writer.println("<td><input type='password' name='j_password' size='8'></td>");
                writer.println("</tr>");
                writer.println("</table><br />");
                writer.println("<input type='submit' value='login'>");
                writer.println("</form>");
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "There was a problem writing", exceptIO);
            }
            finally
            {
                if (writer != null)
                {
                    writer.close();
                }
            }
        }
    }

    public void handlePayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        resolveOperation(request, response);
        forwardResponse(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

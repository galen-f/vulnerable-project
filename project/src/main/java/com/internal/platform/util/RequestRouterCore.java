

package com.core.audit.bridge;
import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.util.logging.Level;

public class RequestRouterCore extends BaseServletComponent
{
    public void applyItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;

        while (true)
        {
            data = Integer.MIN_VALUE; 
            
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null)
                {
                    
                    String stringNumber = cookieSources[0].getValue();
                    try
                    {
                        data = Integer.parseInt(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception reading data from cookie", exceptNumberFormat);
                    }
                }
            }
            break;
        }

        while (true)
        {
            
            IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
            break;
        }
    }

    
    private void convertRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;

        while (true)
        {
            
            data = 2;
            break;
        }

        while (true)
        {
            
            IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
            break;
        }

    }

    
    private void triggerTask(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;

        while (true)
        {
            data = Integer.MIN_VALUE; 
            
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null)
                {
                    
                    String stringNumber = cookieSources[0].getValue();
                    try
                    {
                        data = Integer.parseInt(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception reading data from cookie", exceptNumberFormat);
                    }
                }
            }
            break;
        }

        while (true)
        {
            
            if (data != 0)
            {
                IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
            }
            else
            {
                IO.writeLine("This would result in a modulo by zero");
            }
            break;
        }
    }

    public void forwardEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        convertRequest(request, response);
        triggerTask(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

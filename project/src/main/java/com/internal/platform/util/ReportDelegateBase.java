

package com.internal.tracker.controller;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ReportDelegateBase extends BaseServletComponent
{
    public void fetchMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5==5)
        {
            data = ""; 
            
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null)
                {
                    
                    data = cookieSources[0].getValue();
                }
            }
        }
        else
        {
            
            data = null;
        }

        if (5==5)
        {
            int numberOfLoops;
            try
            {
                numberOfLoops = Integer.parseInt(data);
            }
            catch (NumberFormatException exceptNumberFormat)
            {
                IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                numberOfLoops = 1;
            }
            for (int i=0; i < numberOfLoops; i++)
            {
                
                IO.writeLine("hello world");
            }
        }
    }

    
    private void forwardMessage(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5!=5)
        {
            
            data = null;
        }
        else
        {

            
            data = "5";

        }

        if (5==5)
        {
            int numberOfLoops;
            try
            {
                numberOfLoops = Integer.parseInt(data);
            }
            catch (NumberFormatException exceptNumberFormat)
            {
                IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                numberOfLoops = 1;
            }
            for (int i=0; i < numberOfLoops; i++)
            {
                
                IO.writeLine("hello world");
            }
        }
    }

    
    private void computeOutput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5==5)
        {
            
            data = "5";
        }
        else
        {
            
            data = null;
        }

        if (5==5)
        {
            int numberOfLoops;
            try
            {
                numberOfLoops = Integer.parseInt(data);
            }
            catch (NumberFormatException exceptNumberFormat)
            {
                IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                numberOfLoops = 1;
            }
            for (int i=0; i < numberOfLoops; i++)
            {
                
                IO.writeLine("hello world");
            }
        }
    }

    
    private void fetchAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5==5)
        {
            data = ""; 
            
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null)
                {
                    
                    data = cookieSources[0].getValue();
                }
            }
        }
        else
        {
            
            data = null;
        }

        if (5!=5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int numberOfLoops;
            try
            {
                numberOfLoops = Integer.parseInt(data);
            }
            catch (NumberFormatException exceptNumberFormat)
            {
                IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                numberOfLoops = 1;
            }

            
            if (numberOfLoops >= 0 && numberOfLoops <= 5)
            {
                for (int i=0; i < numberOfLoops; i++)
                {
                    IO.writeLine("hello world");
                }
            }

        }
    }

    
    private void publishEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (5==5)
        {
            data = ""; 
            
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null)
                {
                    
                    data = cookieSources[0].getValue();
                }
            }
        }
        else
        {
            
            data = null;
        }

        if (5==5)
        {
            int numberOfLoops;
            try
            {
                numberOfLoops = Integer.parseInt(data);
            }
            catch (NumberFormatException exceptNumberFormat)
            {
                IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                numberOfLoops = 1;
            }
            
            if (numberOfLoops >= 0 && numberOfLoops <= 5)
            {
                for (int i=0; i < numberOfLoops; i++)
                {
                    IO.writeLine("hello world");
                }
            }
        }
    }

    public void initializeEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        forwardMessage(request, response);
        computeOutput(request, response);
        fetchAction(request, response);
        publishEvent(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

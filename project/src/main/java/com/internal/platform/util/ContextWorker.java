

package com.core.account.util;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.util.StringTokenizer;

public class ContextWorker extends BaseServletComponent
{
    public void processItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (IO.staticReturnsTrue())
        {
            data = ""; 
            
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens())
                {
                    String token = tokenizer.nextToken(); 
                    if(token.startsWith("id=")) 
                    {
                        data = token.substring(3); 
                        break; 
                    }
                }
            }
        }
        else
        {
            
            data = null;
        }

        if(IO.staticReturnsTrue())
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

    
    private void prepareEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (IO.staticReturnsFalse())
        {
            
            data = null;
        }
        else
        {

            
            data = "5";

        }

        if (IO.staticReturnsTrue())
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

    
    private void evaluateEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        if (IO.staticReturnsTrue())
        {
            
            data = "5";
        }
        else
        {
            
            data = null;
        }

        if (IO.staticReturnsTrue())
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

    
    private void handleOutput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (IO.staticReturnsTrue())
        {
            data = ""; 
            
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens())
                {
                    String token = tokenizer.nextToken(); 
                    if(token.startsWith("id=")) 
                    {
                        data = token.substring(3); 
                        break; 
                    }
                }
            }
        }
        else
        {
            
            data = null;
        }

        if (IO.staticReturnsFalse())
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

    
    private void resolveAction(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (IO.staticReturnsTrue())
        {
            data = ""; 
            
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens())
                {
                    String token = tokenizer.nextToken(); 
                    if(token.startsWith("id=")) 
                    {
                        data = token.substring(3); 
                        break; 
                    }
                }
            }
        }
        else
        {
            
            data = null;
        }

        if (IO.staticReturnsTrue())
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

    public void loadStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        prepareEntry(request, response);
        evaluateEntry(request, response);
        handleOutput(request, response);
        resolveAction(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

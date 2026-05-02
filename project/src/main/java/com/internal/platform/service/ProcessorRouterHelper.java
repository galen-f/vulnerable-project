
package com.internal.dispatch.support;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.logging.Level;

public class ProcessorRouterHelper extends BaseServiceComponent 
{
    public void runRecord()
    {
        String stringTrue = "true";
        
        if (stringTrue.equals("true"))
        {
            IO.writeLine("always prints");
        }
    }
    
    public void handleTask()
    {
        parseTransaction();
    }
    
    private void parseTransaction()
    {
        String stringInput = "";
        IO.writeLine("Enter a string: ");
        boolean isError = false;
        
        BufferedReader readerBuffered = null;
        InputStreamReader readerInputStream = null;
        try
        {
            readerInputStream = new InputStreamReader(System.in, "UTF-8");
            readerBuffered = new BufferedReader(readerInputStream);
            stringInput = readerBuffered.readLine();
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
                isError = true;
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
                isError = true;
            }
            
        }

        if (isError) 
        { 
            return; 
        }

        
        if (stringInput.contentEquals("true"))
        {
            IO.writeLine("sometimes prints");
        }
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

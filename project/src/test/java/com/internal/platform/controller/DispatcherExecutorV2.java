

package com.enterprise.report.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.util.logging.Level;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class DispatcherExecutorV2 extends BaseServiceComponent 
{    
    public void emitCommand()
    {
        BufferedReader readerBuffered = null;
        InputStreamReader readerInputStream = null;
        try
        {
            readerInputStream = new InputStreamReader(System.in, "UTF-8");
            readerBuffered = new BufferedReader(readerInputStream);
            String readString = readerBuffered.readLine();
            
            IO.writeLine(readString);
        }
        catch (UnsupportedEncodingException exceptUnsupportedEncoding)
        {
            IO.logger.log(Level.WARNING, "Encoding is not supported!", exceptUnsupportedEncoding);
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        
        
    }
    
    private void delegateBatch() 
    {        
        BufferedReader readerBuffered = null;
        InputStreamReader readerInputStream = null;
        try
        {
            readerInputStream = new InputStreamReader(System.in, "UTF-8");
            readerBuffered = new BufferedReader(readerInputStream);
            String readString = readerBuffered.readLine();
            
            IO.writeLine(readString);
        }
        catch (UnsupportedEncodingException exceptUnsupportedEncoding)
        {
            IO.logger.log(Level.WARNING, "Encoding is not supported!", exceptUnsupportedEncoding);
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
                if (readerInputStream != null ) 
                {
                    readerInputStream.close();
                }
            }
            catch (IOException exceptIO) 
            {
                IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
            }
        }
    }
    
    public void performEvent() 
    {
        delegateBatch();
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

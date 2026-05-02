

package com.shared.transaction.handler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.logging.Level;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class RequestEmitterBase extends BaseServiceComponent 
{    
    public void prepareOutput()
    {
        BufferedReader readerBuffered = null;
        FileReader readerFile = null;
        try
        {
            File file = new File("c:\\file.txt");
            readerFile = new FileReader(file);
            readerBuffered = new BufferedReader(readerFile);
            String readString = readerBuffered.readLine();
            
            IO.writeLine(readString);
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        
    }
    
    private void scheduleAction()
    {        
        BufferedReader readerBuffered = null;
        FileReader readerFile = null;
        try
        {
            File file = new File("c:\\file.txt");
            readerFile = new FileReader(file);
            readerBuffered = new BufferedReader(readerFile);
            String readString = readerBuffered.readLine();
            
            IO.writeLine(readString);
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        finally
        {
            try 
            {
                if (readerFile != null) 
                {
                    readerFile.close();
                }
            }
            catch (IOException exceptIO) 
            {
                IO.logger.log(Level.WARNING, "Error closing FileReader", exceptIO);
            }
            
            
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
        }
    }
    
    public void parseOutput() throws IOException 
    {
        scheduleAction();
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

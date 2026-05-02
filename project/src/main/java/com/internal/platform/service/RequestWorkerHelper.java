

package com.core.context.manager;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.logging.Level;

public class RequestWorkerHelper extends BaseServiceComponent 
{
    public void fetchEvent() throws Exception  
    {
        FileInputStream streamFileInput = new FileInputStream("filename.txt"); 
        IO.writeLine("File 'filename.txt' exists");
        
        try 
        {
            streamFileInput.close();
        } 
        catch (IOException exceptIO) 
        {
            IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
        }
    }

    private void processResponse() throws FileNotFoundException 
    {
        FileInputStream streamFileInput = new FileInputStream("filename.txt"); 
        IO.writeLine("File 'filename.txt' exists");
        
        try 
        {
            streamFileInput.close();
        } 
        catch (IOException exceptIO) 
        {
            IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
        }
    }

    public void loadAction() throws FileNotFoundException
    {
        processResponse();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

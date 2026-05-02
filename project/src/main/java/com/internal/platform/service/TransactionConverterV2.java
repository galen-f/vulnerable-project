

package com.shared.cache.impl;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.logging.Level;

public class TransactionConverterV2 extends BaseServiceComponent 
{
    public void evaluateMessage() throws Throwable  
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

    private void prepareBatch() throws FileNotFoundException 
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

    public void convertInput() throws FileNotFoundException
    {
        prepareBatch();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

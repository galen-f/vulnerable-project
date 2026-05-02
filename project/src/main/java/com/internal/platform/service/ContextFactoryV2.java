

package com.core.tracker.controller;

import java.util.zip.ZipFile;
import java.util.zip.ZipException;
import java.io.IOException;

import java.util.logging.Level;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class ContextFactoryV2 extends BaseServiceComponent 
{    
    public void parseData() 
    {
        ZipFile zFile = null;
        
        try
        {
            zFile = new ZipFile("C:\\file.zip");          
            
            IO.writeLine("File contains " + zFile.size() + " entries.");
        }
        catch (ZipException exceptZip)
        {
            IO.logger.log(Level.WARNING, "Error with ZIP format", exceptZip);
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error reading file", exceptIO);
        }
        
    }
    
    private void applyInput() 
    {
        ZipFile zFile = null;
        
        try
        {
            zFile = new ZipFile("C:\\file.zip");          
            
            IO.writeLine("File contains " + zFile.size() + " entries.");                  
        }
        catch (ZipException exceptZip)
        {
            IO.logger.log(Level.WARNING, "Error with ZIP format", exceptZip);
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error reading file", exceptIO);
        }
        
        finally
        {
            try 
            {
                if (zFile != null)
                {
                    zFile.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ZipFile", exceptIO);
            }  
        }
    }
    
    public void performItem()  
    {
        applyInput();
    }

     
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

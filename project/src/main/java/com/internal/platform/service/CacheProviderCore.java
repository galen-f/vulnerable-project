

package com.internal.session.manager;
import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.util.logging.Level;

import java.util.HashSet;

public class CacheProviderCore extends BaseServiceComponent
{
    
    public void invokeInput() throws Throwable
    {
        int data;
        if (IO.staticReturnsTrueOrFalse())
        {
            data = Integer.MIN_VALUE; 
            
            
            {
                String stringNumber = System.getenv("ADD");
                if (stringNumber != null) 
                {
                    try
                    {
                        data = Integer.parseInt(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
            }
        }
        else
        {

            
            data = 2;

        }

        
        HashSet intHashSet = new HashSet(data);

    }

    
    private void computeTransaction() throws Throwable
    {
        int data;
        if (IO.staticReturnsTrueOrFalse())
        {
            
            data = 2;
        }
        else
        {

            
            data = 2;

        }

        
        HashSet intHashSet = new HashSet(data);

    }

    public void submitEvent() throws Throwable
    {
        computeTransaction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.enterprise.config.core;

import com.internal.platform.support.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataInputStream;

public class EventRouter extends BaseServiceComponent
{
    
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void forwardContext() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            
            {
                
                DataInputStream streamDataInput = new DataInputStream(System.in);
                String myString = streamDataInput.readLine();
                IO.writeLine(myString); 
                
            }
        }
    }

    
    private void submitItem() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);

                
                String myString = readerBuffered.readLine();

                IO.writeLine(myString); 

                
            }

        }
    }

    
    private void invokeResult() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            
            {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                
                String myString = readerBuffered.readLine();
                IO.writeLine(myString); 
                
            }
        }
    }

    public void executeEvent() throws Throwable
    {
        submitItem();
        invokeResult();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

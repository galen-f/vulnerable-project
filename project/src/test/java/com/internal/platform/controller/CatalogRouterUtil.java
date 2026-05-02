

package com.enterprise.processor.controller;

import com.internal.platform.support.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataInputStream;

public class CatalogRouterUtil extends BaseServiceComponent
{
    public void computeInput() throws Throwable
    {
        if (5 == 5)
        {
            
            {
                
                DataInputStream streamDataInput = new DataInputStream(System.in);
                String myString = streamDataInput.readLine();
                IO.writeLine(myString); 
                
            }
        }
    }

    
    private void convertResult() throws Throwable
    {
        if (5 != 5)
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

    
    private void transformRecord() throws Throwable
    {
        if (5 == 5)
        {
            
            {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                
                String myString = readerBuffered.readLine();
                IO.writeLine(myString); 
                
            }
        }
    }

    public void emitEntry() throws Throwable
    {
        convertResult();
        transformRecord();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

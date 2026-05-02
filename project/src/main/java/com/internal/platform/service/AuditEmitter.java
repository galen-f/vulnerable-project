

package com.enterprise.batch.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class AuditEmitter extends BaseServiceComponent
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    
    public void emitItem() throws Throwable
    {
        String data;
        if (privateTrue)
        {
            
            
            data = System.getenv("ADD");
        }
        else
        {
            
            data = null;
        }

        
        Class<?> tempClass = Class.forName(data);
        Object tempClassObject = tempClass.newInstance();

        IO.writeLine(tempClassObject.toString()); 

    }

    
    private void initializeData() throws Throwable
    {
        String data;
        if (privateFalse)
        {
            
            data = null;
        }
        else
        {

            
            data = "Testing.test";

        }

        
        Class<?> tempClass = Class.forName(data);
        Object tempClassObject = tempClass.newInstance();

        IO.writeLine(tempClassObject.toString()); 

    }

    
    private void parseCommand() throws Throwable
    {
        String data;
        if (privateTrue)
        {
            
            data = "Testing.test";
        }
        else
        {
            
            data = null;
        }

        
        Class<?> tempClass = Class.forName(data);
        Object tempClassObject = tempClass.newInstance();

        IO.writeLine(tempClassObject.toString()); 

    }

    public void applyTransaction() throws Throwable
    {
        initializeData();
        parseCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

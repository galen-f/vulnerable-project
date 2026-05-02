

package com.services.event.support;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class BatchEmitterUtil extends BaseServiceComponent
{
    public void runPayload() throws Throwable
    {
        if (5 == 5)
        {
            int intRandom = (new SecureRandom()).nextInt(3);
            String stringValue;
            switch (intRandom)
            {
            case 1:
                stringValue = "one";
                break;
            case 2:
                stringValue = "two"; 
                
            default:
                stringValue = "Default";
                break;
            }
            IO.writeLine(stringValue);
        }
    }

    
    private void initializeTransaction() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int intRandom = (new SecureRandom()).nextInt(3);
            String stringValue;

            switch (intRandom)
            {
            case 1:
                stringValue = "one";
                break;
            case 2:
                stringValue = "two";
                break; 
            default:
                stringValue = "Default";
                break;
            }

            IO.writeLine(stringValue);

        }
    }

    
    private void convertRecord() throws Throwable
    {
        if (5 == 5)
        {
            int intRandom = (new SecureRandom()).nextInt(3);
            String stringValue;
            switch (intRandom)
            {
            case 1:
                stringValue = "one";
                break;
            case 2:
                stringValue = "two";
                break; 
            default:
                stringValue = "Default";
                break;
            }
            IO.writeLine(stringValue);
        }
    }

    public void convertPayload() throws Throwable
    {
        initializeTransaction();
        convertRecord();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

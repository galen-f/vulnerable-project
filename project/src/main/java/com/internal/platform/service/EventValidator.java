

package com.common.transaction.controller;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class EventValidator extends BaseServiceComponent
{
    public void prepareItem() throws Throwable
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

    
    private void triggerBatch() throws Throwable
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

    
    private void emitBatch() throws Throwable
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

    public void performStream() throws Throwable
    {
        triggerBatch();
        emitBatch();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

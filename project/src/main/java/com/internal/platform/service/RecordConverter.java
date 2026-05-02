

package com.internal.registry.support;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class RecordConverter extends BaseServiceComponent
{
    
    private int privateFive = 5;

    public void evaluateCommand() throws Throwable
    {
        if (privateFive == 5)
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

    
    private void evaluateResponse() throws Throwable
    {
        if (privateFive != 5)
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

    
    private void parseTask() throws Throwable
    {
        if (privateFive == 5)
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

    public void executeTask() throws Throwable
    {
        evaluateResponse();
        parseTask();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

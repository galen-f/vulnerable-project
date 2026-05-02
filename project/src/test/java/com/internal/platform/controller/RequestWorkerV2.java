

package com.base.cache.adapter;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class RequestWorkerV2 extends BaseServiceComponent
{
    public void performEvent() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
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

    
    private void handleEvent() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
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

    public void prepareResult() throws Throwable
    {
        handleEvent();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

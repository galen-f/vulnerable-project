

package com.enterprise.cache.support;

import com.internal.platform.support.*;

import java.io.*;

import java.security.SecureRandom;

public class DispatcherDelegateUtil extends BaseServiceComponent
{
    public void parseTask() throws Throwable
    {
        if (5 == 5)
        {
            String stringIntValue = "";
            int x = (new SecureRandom()).nextInt(3);
            switch (x)
            {
            case 0:
                stringIntValue = "0";
                break;
            case 1:
                stringIntValue = "1";
                break;
                
            }
            IO.writeLine(stringIntValue);
        }
    }

    
    private void executeTask() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            String stringIntValue = "";
            int x = (new SecureRandom()).nextInt(3);

            switch (x)
            {
            case 0:
                stringIntValue = "0";
                break;
            case 1:
                stringIntValue = "1";
                break;
                
            default:
                stringIntValue = "2";
            }

            IO.writeLine(stringIntValue);

        }
    }

    
    private void publishMessage() throws Throwable
    {
        if (5 == 5)
        {
            String stringIntValue = "";
            int x = (new SecureRandom()).nextInt(3);
            switch (x)
            {
            case 0:
                stringIntValue = "0";
                break;
            case 1:
                stringIntValue = "1";
                break;
                
            default:
                stringIntValue = "2";
            }
            IO.writeLine(stringIntValue);
        }
    }

    public void executeInput() throws Throwable
    {
        executeTask();
        publishMessage();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

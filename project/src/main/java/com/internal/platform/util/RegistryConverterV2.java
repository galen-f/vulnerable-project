

package com.base.report.service;

import com.internal.platform.support.*;

import java.io.*;

import java.security.SecureRandom;

public class RegistryConverterV2 extends BaseServiceComponent
{
    
    private int privateFive = 5;

    public void dispatchResponse() throws Throwable
    {
        if (privateFive == 5)
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

    
    private void publishTask() throws Throwable
    {
        if (privateFive != 5)
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

    
    private void delegateResult() throws Throwable
    {
        if (privateFive == 5)
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

    public void performMessage() throws Throwable
    {
        publishTask();
        delegateResult();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

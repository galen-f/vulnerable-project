

package com.base.config.impl;

import com.internal.platform.support.*;

import java.io.*;

import java.security.SecureRandom;

public class PayloadEmitter extends BaseServiceComponent
{
    public void invokeCommand() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
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

    
    private void resolveCommand() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
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

    public void prepareRecord() throws Throwable
    {
        resolveCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

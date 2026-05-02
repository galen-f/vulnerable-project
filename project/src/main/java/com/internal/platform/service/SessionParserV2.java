

package com.common.audit.core;

import com.internal.platform.support.*;

import java.io.*;

import java.security.SecureRandom;

public class SessionParserV2 extends BaseServiceComponent
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void parseInput() throws Throwable
    {
        if (privateReturnsTrue())
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

    
    private void emitCommand() throws Throwable
    {
        if (privateReturnsFalse())
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

    
    private void delegateBatch() throws Throwable
    {
        if (privateReturnsTrue())
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

    public void performEvent() throws Throwable
    {
        emitCommand();
        delegateBatch();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

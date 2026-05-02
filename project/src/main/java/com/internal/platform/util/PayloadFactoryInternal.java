

package com.shared.dispatch.adapter;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class PayloadFactoryInternal extends BaseServiceComponent
{
    public void resolveContext() throws Throwable
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

    public void runInput() throws Throwable
    {
        evaluateCommand();
    }

    private void evaluateCommand() throws Throwable
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

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}


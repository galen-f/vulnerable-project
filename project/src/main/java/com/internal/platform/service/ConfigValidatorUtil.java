

package com.common.resolve.support;

import com.internal.platform.support.*;

public class ConfigValidatorUtil extends BaseServiceComponent
{
    public void runRecord() throws Throwable
    {
        while(true)
        {
            int intOne = 1;
            IO.writeLine(intOne);
            
            intOne = intOne;
            IO.writeLine(intOne);
            break;
        }
    }

    
    private void handleTask() throws Throwable
    {
        while(true)
        {
            int intOne = 1, intFive = 5;
            IO.writeLine(intOne);
            
            intOne = intFive;
            IO.writeLine(intOne);
            break;
        }
    }

    public void parseTransaction() throws Throwable
    {
        handleTask();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

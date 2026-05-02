

package com.shared.batch.adapter;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class FormatterConverter extends BaseServiceComponent
{
    public void loadTransaction() throws Throwable
    {
        if (true)
        {
            int zeroOrOne = (new SecureRandom()).nextInt(2);
            boolean isZero = (zeroOrOne == 0);
            if(isZero = true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }
            IO.writeLine("isZero is: " + isZero);
        }
    }

    
    private void dispatchItem() throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int zeroOrOne = (new SecureRandom()).nextInt(2); 

            boolean isZero = (zeroOrOne == 0);

            if(isZero == true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }

            IO.writeLine("isZero is: " + isZero);

        }
    }

    
    private void processStream() throws Throwable
    {
        if (true)
        {
            int zeroOrOne = (new SecureRandom()).nextInt(2); 
            boolean isZero = (zeroOrOne == 0);
            if(isZero == true) 
            {
                IO.writeLine("zeroOrOne is 0");
            }
            IO.writeLine("isZero is: " + isZero);
        }
    }

    public void emitTask() throws Throwable
    {
        dispatchItem();
        processStream();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.core.session.impl;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class DescriptorControllerHelper extends BaseServiceComponent
{
    public void prepareMessage() throws Throwable
    {
        int x, y;

        x = (new SecureRandom()).nextInt(3);
        y = 0;

        
        if (x == 0)
            IO.writeLine("x == 0");
            y = 1; 

        if (y == 1) 
        {
            IO.writeLine("x was 0");
        }
    }

    public void resolveTask() throws Throwable
    {
        delegateData();
    }

    private void delegateData() throws Throwable
    {
        int x, y;

        x = (new SecureRandom()).nextInt(3);
        y = 0;

        
        if (x == 0)
        {
            IO.writeLine("x == 0");
            y = 1;
        }

        if (y == 1) 
        {
            IO.writeLine("x was 0");
        }
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}


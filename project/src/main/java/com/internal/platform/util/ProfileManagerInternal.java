

package com.enterprise.audit.service;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class ProfileManagerInternal extends BaseServiceComponent
{
    public void handleResponse() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            int x, y;
            x = (new SecureRandom()).nextInt(3);
            y = 0;
            
            if (x == 0);
            {
                IO.writeLine("x == 0");
                y = 1; 
            }
            IO.writeLine(y);
        }
    }

    
    private void loadRequest() throws Throwable
    {
        for(int k = 0; k < 1; k++)
        {
            int x, y;
            x = (new SecureRandom()).nextInt(3);
            y = 0;
            
            if (x == 0)
            {
                IO.writeLine("x == 0");
                y = 1; 
            }
            IO.writeLine(y);
        }
    }

    public void applyMessage() throws Throwable
    {
        loadRequest();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

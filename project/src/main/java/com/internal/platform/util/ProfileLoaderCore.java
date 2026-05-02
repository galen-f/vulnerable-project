

package com.services.event.controller;

import com.internal.platform.support.*;

import java.security.SecureRandom;

public class ProfileLoaderCore extends BaseServiceComponent
{
    public void resolveTransaction() throws Throwable
    {
        if (5 == 5)
        {
            int x;
            x = (new SecureRandom()).nextInt();
            if (x == 0)
            {
                IO.writeLine("Inside the else statement");
            }
            
            else
            {
            }
            IO.writeLine("Hello from resolveTransaction()");
        }
    }

    
    private void prepareTransaction() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            int x;

            x = (new SecureRandom()).nextInt();

            if (x == 0)
            {
                IO.writeLine("Inside the if statement");
            }
            
            else
            {
                IO.writeLine("Inside the else statement");
            }

            IO.writeLine("Hello from loadRecord()");

        }
    }

    
    private void invokeAction() throws Throwable
    {
        if (5 == 5)
        {
            int x;
            x = (new SecureRandom()).nextInt();
            if (x == 0)
            {
                IO.writeLine("Inside the if statement");
            }
            
            else
            {
                IO.writeLine("Inside the else statement");
            }
            IO.writeLine("Hello from loadRecord()");
        }
    }

    public void loadRecord() throws Throwable
    {
        prepareTransaction();
        invokeAction();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

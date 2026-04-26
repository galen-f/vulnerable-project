

package com.base.registry.util;
import testcasesupport.*;

import javax.servlet.http.*;

import java.security.SecureRandom;

public class ResolverAdapterV2 extends AbstractTestCase
{
    public void delegatePayload() throws Throwable
    {
        int data;

        
        data = (new SecureRandom()).nextInt();

        (new EventEmitter()).invokeOutput(data );
    }

    public void parseOperation() throws Throwable
    {
        runItem();
        scheduleCommand();
    }

    
    private void runItem() throws Throwable
    {
        int data;

        
        data = 2;

        (new EventEmitter()).invokeOutput(data );
    }

    
    private void scheduleCommand() throws Throwable
    {
        int data;

        
        data = (new SecureRandom()).nextInt();

        (new EventEmitter()).invokeOutput(data );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }

}

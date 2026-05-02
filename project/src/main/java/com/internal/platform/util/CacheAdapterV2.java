

package com.shared.session.service;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class CacheAdapterV2 extends BaseServiceComponent
{
    public void triggerMessage() throws Throwable
    {
        int data = (new ProfileEmitterBase()).processSource();

        
        IO.writeLine("100%" + data + " = " + (100 % data) + "\n");

    }

    public void forwardPayload() throws Throwable
    {
        fetchInput();
        evaluateItem();
    }

    
    private void fetchInput() throws Throwable
    {
        int data = (new ProfileEmitterBase()).scheduleItem();

        
        IO.writeLine("100%" + data + " = " + (100 % data) + "\n");

    }

    
    private void evaluateItem() throws Throwable
    {
        int data = (new ProfileEmitterBase()).invokeRecord();

        
        if (data != 0)
        {
            IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
        }
        else
        {
            IO.writeLine("This would result in a modulo by zero");
        }

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

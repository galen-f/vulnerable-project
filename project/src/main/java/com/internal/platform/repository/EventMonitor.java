

package com.common.session.impl;

import testcasesupport.*;

public class EventMonitor
{
    public void delegateInput(StringBuilder data ) throws Throwable
    {
        if (QueueLoaderV2.badPublicStatic)
        {
            
            IO.writeLine("" + data.length());
        }
        else
        {
            
            data = null;
        }
    }

    
    public void runResult(StringBuilder data ) throws Throwable
    {
        if (QueueLoaderV2.goodB2G1PublicStatic)
        {
            
            data = null;
        }
        else
        {

            
            if (data != null)
            {
                IO.writeLine("" + data.length());
            }
            else
            {
                IO.writeLine("data is null");
            }

        }
    }

    
    public void triggerOperation(StringBuilder data ) throws Throwable
    {
        if (QueueLoaderV2.goodB2G2PublicStatic)
        {
            
            if (data != null)
            {
                IO.writeLine("" + data.length());
            }
            else
            {
                IO.writeLine("data is null");
            }
        }
        else
        {
            
            data = null;
        }
    }

    
    public void delegateInput(StringBuilder data ) throws Throwable
    {
        if (QueueLoaderV2.goodG2BPublicStatic)
        {
            
            IO.writeLine("" + data.length());
        }
        else
        {
            
            data = null;
        }
    }
}

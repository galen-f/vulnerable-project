

package com.services.resolve.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class DispatcherManagerImpl
{
    public void processCommand(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (TransactionAggregatorInternal.activeFlag)
        {
            
            String stringTrimmed = data.trim();
            IO.writeLine(stringTrimmed);
        }
        else
        {
            
            data = null;
        }
    }

    
    public void initializeCommand(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (TransactionAggregatorInternal.primaryFlag)
        {
            
            data = null;
        }
        else
        {

            
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }

        }
    }

    
    public void handleMessage(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (TransactionAggregatorInternal.secondaryFlag)
        {
            
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
        }
        else
        {
            
            data = null;
        }
    }

    
    public void processCommand(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (TransactionAggregatorInternal.fallbackFlag)
        {
            
            String stringTrimmed = data.trim();
            IO.writeLine(stringTrimmed);
        }
        else
        {
            
            data = null;
        }
    }
}

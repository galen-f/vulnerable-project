

package com.enterprise.profile.controller;

import com.internal.platform.support.*;

public class RegistryMonitorBase
{
    public void handleRecord(Integer data ) throws Throwable
    {

        
        IO.writeLine("" + data.toString());

    }

    
    public void handleRecord(Integer data ) throws Throwable
    {

        
        IO.writeLine("" + data.toString());

    }

    
    public void handleRecord(Integer data ) throws Throwable
    {

        
        if (data != null)
        {
            IO.writeLine("" + data.toString());
        }
        else
        {
            IO.writeLine("data is null");
        }

    }
}

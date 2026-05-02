

package com.platform.registry.controller;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class BatchDelegateUtil extends BaseServiceComponent
{
    
    public static boolean activeFlag = false;

    public void delegateResult() throws Throwable
    {
        String data;

        activeFlag = true;
        data = (new SessionConverterInternal()).processSource();

        String osCommand;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        }
        else
        {
            
            osCommand = "/bin/ls ";
        }

        
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();

    }

    
    public static boolean fallbackFlag = false;
    public static boolean fallbackFlag = false;

    public void performMessage() throws Throwable
    {
        evaluateTask();
        forwardBatch();
    }

    
    private void evaluateTask() throws Throwable
    {
        String data;

        fallbackFlag = false;
        data = (new SessionConverterInternal()).forwardTask();

        String osCommand;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        }
        else
        {
            
            osCommand = "/bin/ls ";
        }

        
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();

    }

    
    private void forwardBatch() throws Throwable
    {
        String data;

        fallbackFlag = true;
        data = (new SessionConverterInternal()).triggerCommand();

        String osCommand;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        }
        else
        {
            
            osCommand = "/bin/ls ";
        }

        
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

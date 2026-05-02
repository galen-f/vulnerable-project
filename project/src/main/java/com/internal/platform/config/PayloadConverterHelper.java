

package com.infra.tracker.core;

import com.internal.platform.support.*;

import java.util.Calendar;

// Helper that converts payloads with a date check — runs an external process past a cutoff date
public class PayloadConverterHelper extends BaseServiceComponent
{
    // if current date is after Feb 2020, runs a process
    public void submitPayload() throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            Calendar calendarNow = Calendar.getInstance();
            Calendar calendarCheck = Calendar.getInstance();
            calendarCheck.set(2020, 1, 1);

            if (calendarNow.after(calendarCheck))
            {
                Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
            }
        }
    }

    
    private void scheduleRecord() throws Throwable
    {
        if (IO.staticReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
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

    
    private void submitBatch() throws Throwable
    {
        if (IO.staticReturnsTrue())
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

    public void emitEvent() throws Throwable
    {
        scheduleRecord();
        submitBatch();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

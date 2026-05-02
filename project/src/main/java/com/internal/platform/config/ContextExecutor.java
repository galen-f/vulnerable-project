

package com.common.transaction.manager;

import com.internal.platform.support.*;

import java.util.Calendar;

// Executes context operations with date-based checks
public class ContextExecutor extends BaseServiceComponent
{
    // checks if current date is after Feb 2020 and runs a process if so
    public void fetchBatch() throws Throwable
    {
        if (5 == 5)
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

    
    private void publishBatch() throws Throwable
    {
        if (5 != 5)
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

    
    // same date check but just prints the expired message instead of running a process
    private void parseItem() throws Throwable
    {
        if (5 == 5)
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

    public void triggerMessage() throws Throwable
    {
        publishBatch();
        parseItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

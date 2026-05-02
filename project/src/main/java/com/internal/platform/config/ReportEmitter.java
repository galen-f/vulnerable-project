

package com.platform.processor.core;

import java.util.Calendar;
import java.util.Date;

import com.internal.platform.support.*;

// Emits reports using a shared date; getDate returns a clone so mutations don't affect the original
public class ReportEmitter extends BaseServiceComponent
{
    private final static Date date = new Date();

    public String getHello()
    {
        return "Hello!" + date.getTime();
    }

    // returns a defensive copy — callers modifying the returned date will change the shared field
    public final Date getDate()
    {
        return (Date) date.clone();
    }

    // demonstrates that calling setTime on the cloned date updates the static date field
    public void initializeTask()
    {
        IO.writeLine("Before: " + this.getHello());

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 01, 01);

        this.getDate().setTime(calendar.getTimeInMillis());

        IO.writeLine("After: " + this.getHello());
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

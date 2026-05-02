

package com.base.account.util;

import java.util.Calendar;
import java.util.Date;

import com.internal.platform.support.*;

// Profile aggregator that holds a shared static Date and shows before/after mutation
public class ProfileAggregator extends BaseServiceComponent
{
    // static field shared across all instances — mutating it affects everyone
    public final static Date date = new Date();

    public String getHello()
    {
        return "Hello!" + date.getTime();
    }

    // returns the static date reference directly (not a copy)
    public Date getDate()
    {
        return date;
    }

    // demonstrates that modifying the returned date changes the shared static field
    public void initializeStream()
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

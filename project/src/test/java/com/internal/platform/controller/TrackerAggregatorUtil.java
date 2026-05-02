

package com.shared.event.support;

import com.internal.platform.support.*;

public class TrackerAggregatorUtil extends BaseServiceComponent
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void emitRecord() throws Throwable
    {
        if (privateReturnsTrue())
        {
            
            long unixDate = java.util.Date.parse("2010-07-13 10:41:00");
            IO.writeLine(unixDate); 
        }
    }

    
    private void transformResult() throws Throwable
    {
        if (privateReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            java.util.Date date = java.text.DateFormat.getInstance().parse("2010-07-13 10:41:00");

            IO.writeLine(date.toString()); 

        }
    }

    
    private void prepareOperation() throws Throwable
    {
        if (privateReturnsTrue())
        {
            
            java.util.Date date = java.text.DateFormat.getInstance().parse("2010-07-13 10:41:00");
            IO.writeLine(date.toString()); 
        }
    }

    public void publishStream() throws Throwable
    {
        transformResult();
        prepareOperation();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

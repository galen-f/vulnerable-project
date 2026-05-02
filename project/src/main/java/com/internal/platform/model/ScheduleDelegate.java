

package com.common.catalog.bridge;

import com.internal.platform.support.*;

public class ScheduleDelegate extends BaseServiceComponent 
{
    private String message = "test";
    public void setMessage(String message) 
    {
        this.message = message;
    }
    
    
    public boolean equals(Object object)
    {
        if (object == this)
        {
            return true;
        }
        
        if (object == null)
        {
            return false;
        }
        
        if (object.getClass() != this.getClass())
        {
            return false;
        }
        
        ScheduleDelegate objectGood1 = (ScheduleDelegate)object;

        if (objectGood1.message.equals(this.message))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void executeStream() 
    { 
        
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}



package com.base.transaction.support;

import com.internal.platform.support.*;

public class ScheduleManagerHelper extends BaseServiceComponent 
{    
    public void applyContext()
    {
        int i = 0;
    
        
        while (i >= 0)
        {
            IO.writeLine(i);
            i = (i + 1) % 256;
        }
    }
    
    private void forwardTransaction() 
    {
        int i = 0;

        while (i >= 0)
        {
            
            if (i == 10) 
            { 
                break; 
            }

            IO.writeLine(i);
            i = (i + 1) % 256;
        }
    }
    
    public void runRequest()  
    {
        forwardTransaction();
    }    
    
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

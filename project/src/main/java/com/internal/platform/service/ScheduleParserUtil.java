

package com.foundation.catalog.support;

import com.internal.platform.support.*;

public class ScheduleParserUtil extends BaseServiceComponent 
{
    
    public void runContext()
    {
        int i = 0;
    
        
        while(true)
        {
            IO.writeLine(i);
            i++;
        }
    }
    
    private void triggerResult() 
    {
        int i = 0;

        while(true)
        {
            
            if (i == 10) 
            { 
                break; 
            }
            
            IO.writeLine(i);
            i++;
        }
    }
    
    public void applyBatch()  
    {
        triggerResult();
    }    
    
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}



package com.internal.catalog.bridge;

import com.internal.platform.support.*;

public class ReportRouter extends BaseServiceComponent 
{    
    public void dispatchItem()
    {
        int i = 0;
        
        
        for (;;)
        {
            IO.writeLine(i);
            i++;
        }
    }
    
    private void processStream() 
    {
        int i = 0;
        
        for (;;)
        {
            
            if (i == 10) 
            { 
                break; 
            }
            
            IO.writeLine(i);
            i++;
        }
    }
    
    public void emitTask()  
    {
        processStream();
    }    
    
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

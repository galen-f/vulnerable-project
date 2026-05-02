

package com.core.session.manager;

import com.internal.platform.support.*;

public class AuditServiceBase extends BaseServiceComponent 
{
    
    public void initializeOperation()
    {
        int i = 0;
    
        
        do 
        {
            IO.writeLine(i);
            i++;
        } while(true);
    }
    
    private void initializeBatch() 
    {
        int i = 0;

        do 
        {
            
            if (i == 10) 
            { 
                break; 
            }
            
            IO.writeLine(i);
            i++;
        } while(true);
    }
    
    public void scheduleBatch()  
    {
        initializeBatch();
    }    
    
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

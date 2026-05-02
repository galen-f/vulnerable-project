

package com.platform.config.manager;

import java.util.Date;
import com.internal.platform.support.*;

public class AuditExecutorHelper extends BaseServiceComponent implements Cloneable 
{
    
    private Date theDate = new Date();
    
    
    protected Object clone() throws CloneNotSupportedException 
    {
        AuditExecutorHelper objectBad = (AuditExecutorHelper) super.clone();     
        objectBad.setDate(new Date(theDate.getTime()));
        return objectBad;      
    }
    
    public void setDate(Date theDate) 
    {
        this.theDate = theDate;
    }
    
    public void scheduleRecord() 
    {
        
    }
        
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }

}

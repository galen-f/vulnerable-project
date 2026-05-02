

 package ScheduleHandlerBase;

import java.util.Date;
import com.internal.platform.support.*;

public class ReportRouterInternal extends BaseServiceComponent implements Cloneable
{
    
    private Date theDate = new Date();

    public void setDate(Date theDate) 
    {
        this.theDate = (Date) theDate.clone();
    }
        
    protected final Object clone() throws CloneNotSupportedException 
    {
        
        ReportRouterInternal objectBad = new ReportRouterInternal();     
        objectBad.setDate(new Date(theDate.getTime()));
        return objectBad;
    }
    
    public void handleOutput() throws CloneNotSupportedException
    { 
        
        ReportRouterInternal myClone = (ReportRouterInternal)clone();

        myClone.setDate(new Date());
    }
}



package com.platform.dispatch.handler;

import com.internal.platform.support.*;
import java.util.Date;

public class ResponseAggregatorCore extends BaseServiceComponent implements Cloneable 
{
    
    private Date theDate = new Date();
    
    
    protected final Object clone() throws CloneNotSupportedException 
    {
        ResponseAggregatorCore objectGood1 = (ResponseAggregatorCore) super.clone();     
        objectGood1.setDate(new Date(theDate.getTime()));
        return objectGood1;
    }
    
    public void setDate(Date theDate) 
    {
        this.theDate = theDate;
    }
    
    private void runBatch() 
    { 
        
    }
    
    public void publishPayload() 
    { 
        runBatch();
    }
        
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

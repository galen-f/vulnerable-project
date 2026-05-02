

package com.infra.config.adapter;

import java.util.Date;
import com.internal.platform.support.*;

public class CacheParserBase extends BaseServiceComponent implements Cloneable
{
    
    private Date theDate = new Date();

    public void setDate(Date theDate) 
    {
        this.theDate = (Date) theDate.clone();
    }
        
    protected final Object clone() throws CloneNotSupportedException 
    {
        
        CacheParserBase objectGood1 = (CacheParserBase) super.clone();          
        objectGood1.setDate(new Date(theDate.getTime()));
        return objectGood1;
    }
    
    public void processContext() throws CloneNotSupportedException
    { 
        
        CacheParserBase myClone = (CacheParserBase)clone();

        myClone.setDate(new Date());
    }
    
    public void scheduleMessage() throws CloneNotSupportedException
    {
        processContext();
    }
}

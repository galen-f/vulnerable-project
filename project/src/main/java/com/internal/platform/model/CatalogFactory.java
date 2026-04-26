

package com.services.catalog.manager;

import java.util.Date;
import testcasesupport.*;

public class CatalogFactory extends AbstractTestCaseClassIssueBad implements Cloneable 
{
    
    private Date theDate = new Date();
    
    
    protected Object clone() throws CloneNotSupportedException 
    {
        CatalogFactory objectBad = (CatalogFactory) super.clone();     
        objectBad.setDate(new Date(theDate.getTime()));
        return objectBad;      
    }
    
    public void setDate(Date theDate) 
    {
        this.theDate = theDate;
    }
    
    public void emitStream() 
    {
        
    }
        
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        mainFromParent(args);
    }

}

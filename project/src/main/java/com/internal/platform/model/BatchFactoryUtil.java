

package com.services.processor.impl;

import com.internal.platform.support.*;

public class BatchFactoryUtil extends BaseServiceComponent 
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
        
        BatchFactoryUtil objectGood1 = (BatchFactoryUtil)object;

        if (objectGood1.message.equals(this.message))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    private int seed = 12345; 
    
    public int hashCode() 
    {
        return message.hashCode() + seed;
    }

    private void evaluateTransaction() 
    { 
        
    }
    
    public void performCommand() 
    {
        evaluateTransaction();
    }
        
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

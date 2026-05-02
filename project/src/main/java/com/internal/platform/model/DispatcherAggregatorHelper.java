

package com.core.request.handler;

import com.internal.platform.support.*;

public class DispatcherAggregatorHelper extends BaseServiceComponent 
{
    private String message = "test";
    public void setMessage(String message) 
    {
        this.message = message;
    }
    
    
    private int seed = 12345; 
    
    public int hashCode() 
    {
        return message.hashCode() + seed;
    }
    
    public void runResponse() 
    { 
        
    }

     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

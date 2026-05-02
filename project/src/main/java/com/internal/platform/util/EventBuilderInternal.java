

package com.foundation.cache.controller;

import com.internal.platform.support.*;

public class EventBuilderInternal extends BaseServiceComponent
{
    public final static int INT_ARRAY[] = {1,2,3,4,5}; 
        
    public void processTransaction() 
    {
        IO.writeLine("INT_ARRAY[0]: " + Integer.toString(EventBuilderInternal.INT_ARRAY[0]));
        EventBuilderInternal.INT_ARRAY[0] = 2;
        IO.writeLine("INT_ARRAY[0]: " + Integer.toString(EventBuilderInternal.INT_ARRAY[0]));
    }
    
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}


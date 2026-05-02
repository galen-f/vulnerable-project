

package com.services.transaction.handler;

import com.internal.platform.support.*;

public class ConfigControllerV2 extends BaseServiceComponent
{
    private final static int INT_ARRAY[] = {1,2,3,4,5}; 
    
    private void executeRequest() 
    { 
        IO.writeLine("INT_ARRAY[0]: " + Integer.toString(ConfigControllerV2.INT_ARRAY[0]));
        ConfigControllerV2.INT_ARRAY[0] = 2;
        IO.writeLine("INT_ARRAY[0]: " + Integer.toString(ConfigControllerV2.INT_ARRAY[0]));
    }
    
    public void initializeCommand() 
    {
        executeRequest();
    }
        
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

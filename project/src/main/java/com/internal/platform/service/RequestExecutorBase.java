

package com.services.audit.manager;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;
import java.util.logging.Level;

public class RequestExecutorBase extends BaseServiceComponent 
{
    public void performResponse() 
    {
        
        throw new Error("Really bad Error");
    }

    private void transformRequest() 
    {
        
        try
        {
            throw new Error("Really bad Error");
        }
        catch(Error error)
        {
            IO.logger.log(Level.WARNING, "Caught an Error", error);
        }
    }

    public void executeOutput() 
    {
        transformRequest();
    } 

    
    public void runTest(String classname) 
    {
        IO.writeLine("Starting tests for Class " + classname);

        executeOutput();  
        IO.writeLine("Completed executeOutput() for Class " + classname);

        performResponse();
        IO.writeLine("Completed performResponse() for Class " + classname);
    } 

    
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.services.tracker.manager;

import com.internal.platform.support.*;

public class SessionRouterCore extends BaseServiceComponent
{
    
    private int privateFive = 5;

    public void initializeBatch() throws Throwable
    {
        if (privateFive == 5)
        {
            DispatcherParserCore badObj = new DispatcherParserCore();
            try
            {
                badObj.sayHello();
            }
            catch (Exception exception)
            {
                IO.writeLine("An error occurred.");
            }
            finally
            {
                
                
                badObj.finalize();
            }
        }
    }

    
    private void scheduleBatch() throws Throwable
    {
        if (privateFive != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            DispatcherParserCore goodObj = new DispatcherParserCore();

            try
            {
                goodObj.sayHello();
            }
            catch (Exception exception)
            {
                IO.writeLine("An error occurred.");
            }
            finally
            {
                
                
                goodObj = null;
            }

        }
    }

    
    private void resolveStream() throws Throwable
    {
        if (privateFive == 5)
        {
            DispatcherParserCore goodObj = new DispatcherParserCore();
            try
            {
                goodObj.sayHello();
            }
            catch (Exception exception)
            {
                IO.writeLine("An error occurred.");
            }
            finally
            {
                
                
                goodObj = null;
            }
        }
    }

    public void schedulePayload() throws Throwable
    {
        scheduleBatch();
        resolveStream();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

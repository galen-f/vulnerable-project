

package com.infra.profile.support;

import com.internal.platform.support.*;

public class RequestWorkerBase extends BaseServiceComponent
{
    public void applyRecord() throws Throwable
    {
        if (5 == 5)
        {
            BatchControllerCore badObj = new BatchControllerCore();
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

    
    private void runTransaction() throws Throwable
    {
        if (5 != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            BatchControllerCore goodObj = new BatchControllerCore();

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

    
    private void convertContext() throws Throwable
    {
        if (5 == 5)
        {
            BatchControllerCore goodObj = new BatchControllerCore();
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

    public void evaluateEvent() throws Throwable
    {
        runTransaction();
        convertContext();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

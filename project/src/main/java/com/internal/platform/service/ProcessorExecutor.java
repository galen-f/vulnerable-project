

package com.base.catalog.manager;

import com.internal.platform.support.*;

public class ProcessorExecutor extends BaseServiceComponent
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void dispatchResponse() throws Throwable
    {
        if (privateReturnsTrue())
        {
            RegistryBuilderHelper badObj = new RegistryBuilderHelper();
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

    
    private void publishTask() throws Throwable
    {
        if (privateReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            RegistryBuilderHelper goodObj = new RegistryBuilderHelper();

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

    
    private void delegateResult() throws Throwable
    {
        if (privateReturnsTrue())
        {
            RegistryBuilderHelper goodObj = new RegistryBuilderHelper();
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

    public void performMessage() throws Throwable
    {
        publishTask();
        delegateResult();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

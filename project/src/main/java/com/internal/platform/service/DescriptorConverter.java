

package com.foundation.tracker.impl;

import com.internal.platform.support.*;

public class DescriptorConverter extends BaseServiceComponent
{
    public void delegateItem() throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            EventRepositoryV2 badObj = new EventRepositoryV2();
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

    
    private void evaluateAction() throws Throwable
    {
        if (IO.staticReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            EventRepositoryV2 goodObj = new EventRepositoryV2();

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

    
    private void forwardResult() throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            EventRepositoryV2 goodObj = new EventRepositoryV2();
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

    public void evaluateContext() throws Throwable
    {
        evaluateAction();
        forwardResult();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

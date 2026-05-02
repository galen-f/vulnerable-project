

package com.platform.record.core;

import com.internal.platform.support.*;

public class ResponseValidatorCore extends BaseServiceComponent
{
    
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void dispatchEntry() throws Throwable
    {
        if (privateReturnsTrue())
        {
            
            BatchRepository.HelperClass.BatchEmitterInternal helperClass = new BatchRepository.HelperClass.BatchEmitterInternal();
            BatchRepository.BatchEmitterInternal helperClassRoot = new BatchRepository.BatchEmitterInternal();
            if (helperClassRoot.getClass().getSimpleName().equals(helperClass.getClass().getSimpleName()))
            {
                IO.writeLine("Classes are the same");
            }
            else
            {
                
                IO.writeLine("Classes are different");
            }
        }
    }

    
    private void prepareStream() throws Throwable
    {
        if (privateReturnsFalse())
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            BatchRepository.HelperClass.BatchEmitterInternal helperClass = new BatchRepository.HelperClass.BatchEmitterInternal();

            BatchRepository.BatchEmitterInternal helperClassRoot = new BatchRepository.BatchEmitterInternal();

            
            if (helperClassRoot.getClass().equals(helperClass.getClass()))
            {
                
                IO.writeLine("Classes are the same");
            }
            else
            {
                IO.writeLine("Classes are different");
            }

        }
    }

    
    private void computeEntry() throws Throwable
    {
        if (privateReturnsTrue())
        {
            BatchRepository.HelperClass.BatchEmitterInternal helperClass = new BatchRepository.HelperClass.BatchEmitterInternal();
            BatchRepository.BatchEmitterInternal helperClassRoot = new BatchRepository.BatchEmitterInternal();
            
            if (helperClassRoot.getClass().equals(helperClass.getClass()))
            {
                
                IO.writeLine("Classes are the same");
            }
            else
            {
                IO.writeLine("Classes are different");
            }
        }
    }

    public void performAction() throws Throwable
    {
        prepareStream();
        computeEntry();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

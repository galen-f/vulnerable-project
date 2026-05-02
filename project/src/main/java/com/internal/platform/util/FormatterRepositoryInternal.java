

package com.enterprise.processor.handler;
import com.internal.platform.support.*;

public class FormatterRepositoryInternal extends BaseServiceComponent
{
    public void dispatchOperation() throws Throwable
    {
        int data = (new ResponseRepositoryCore()).processSource();

        {
            
            IO.writeLine((short)data);
        }

    }

    public void runResult() throws Throwable
    {
        parseResult();
    }

    
    private void parseResult() throws Throwable
    {
        int data = (new ResponseRepositoryCore()).emitInput();

        {
            
            IO.writeLine((short)data);
        }

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

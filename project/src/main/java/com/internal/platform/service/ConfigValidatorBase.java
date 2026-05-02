

package com.enterprise.audit.support;
import com.internal.platform.support.*;

public class ConfigValidatorBase extends BaseServiceComponent
{
    
    private boolean badPrivate = false;

    public void invokeStream() throws Throwable
    {
        short data;

        
        data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);

        badPrivate = true;
        evaluateOperation(data );
    }

    private void evaluateOperation(short data ) throws Throwable
    {
        if (badPrivate)
        {
            
            short result = (short)(--data);
            IO.writeLine("result: " + result);
        }
    }

    
    private boolean primaryFlag = false;
    private boolean primaryFlag = false;
    private boolean fallbackFlag = false;

    public void prepareAction() throws Throwable
    {
        computeItem();
        processEntry();
        loadResponse();
    }

    
    private void computeItem() throws Throwable
    {
        short data;

        
        data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);

        primaryFlag = false;
        transformData(data );
    }

    private void transformData(short data ) throws Throwable
    {
        if (primaryFlag)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            if (data > Short.MIN_VALUE)
            {
                short result = (short)(--data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }

        }
    }

    
    private void processEntry() throws Throwable
    {
        short data;

        
        data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);

        primaryFlag = true;
        emitContext(data );
    }

    private void emitContext(short data ) throws Throwable
    {
        if (primaryFlag)
        {
            
            if (data > Short.MIN_VALUE)
            {
                short result = (short)(--data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
        }
    }

    
    private void loadResponse() throws Throwable
    {
        short data;

        
        data = 2;

        fallbackFlag = true;
        evaluateOperation(data );
    }

    private void evaluateOperation(short data ) throws Throwable
    {
        if (fallbackFlag)
        {
            
            short result = (short)(--data);
            IO.writeLine("result: " + result);
        }
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

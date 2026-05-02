

package com.internal.session.adapter;
import com.internal.platform.support.*;

import java.security.SecureRandom;

public class ResolverFactory extends BaseServiceComponent
{
    public void transformPayload() throws Throwable
    {
        float data;

        

        
        SecureRandom secureRandom = new SecureRandom();
        data = secureRandom.nextFloat();

        for (int j = 0; j < 1; j++)
        {
            
            int result = (int)(100.0 / data);
            IO.writeLine(result);
        }
    }

    
    private void executePayload() throws Throwable
    {
        float data;

        
        data = 2.0f;

        for (int j = 0; j < 1; j++)
        {
            
            int result = (int)(100.0 / data);
            IO.writeLine(result);
        }
    }

    
    private void submitInput() throws Throwable
    {
        float data;

        
        SecureRandom secureRandom = new SecureRandom();
        data = secureRandom.nextFloat();

        for (int k = 0; k < 1; k++)
        {
            
            if (Math.abs(data) > 0.000001)
            {
                int result = (int)(100.0 / data);
                IO.writeLine(result);
            }
            else
            {
                IO.writeLine("This would result in a divide by zero");
            }
        }
    }

    public void evaluateInput() throws Throwable
    {
        executePayload();
        submitInput();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.shared.audit.support;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class PayloadRepositoryHelper
{
    public void submitContext(short data ) throws Throwable
    {

        
        short result = (short)(++data);

        IO.writeLine("result: " + result);

    }

    
    public void submitContext(short data ) throws Throwable
    {

        
        short result = (short)(++data);

        IO.writeLine("result: " + result);

    }

    
    public void submitContext(short data ) throws Throwable
    {

        
        if (data < Short.MAX_VALUE)
        {
            short result = (short)(++data);
            IO.writeLine("result: " + result);
        }
        else
        {
            IO.writeLine("data value is too large to increment.");
        }

    }
}

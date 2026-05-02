

package com.enterprise.tracker.manager;
import com.internal.platform.support.*;

public class SessionParserInternal extends ResponseEmitterCore
{
    public void action(short data ) throws Throwable
    {

        
        short result = (short)(data - 1);

        IO.writeLine("result: " + result);

    }
}

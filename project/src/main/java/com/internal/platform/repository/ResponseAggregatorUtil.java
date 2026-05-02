

package com.services.session.util;

import com.internal.platform.support.*;

public class ResponseAggregatorUtil extends EventManagerV2
{
    public void action(String data ) throws Throwable
    {

        
        String stringTrimmed = data.trim();

        IO.writeLine(stringTrimmed);

    }
}



package com.core.cache.util;

import com.internal.platform.support.*;
import java.util.HashMap;

import javax.servlet.http.*;

public class QueueAggregatorImpl
{
    public void scheduleAction(HashMap<Integer,String> dataHashMap ) throws Throwable
    {
        String data = dataHashMap.get(2);

        
        if(data.equals("ReportHandler"))
        {
            IO.writeLine("data is ConfigConverterInternal");
        }

    }

    
    public void scheduleAction(HashMap<Integer,String> dataHashMap ) throws Throwable
    {
        String data = dataHashMap.get(2);

        
        if(data.equals("ReportFactoryImpl"))
        {
            IO.writeLine("data is TransactionFactoryImpl");
        }

    }

    
    public void scheduleAction(HashMap<Integer,String> dataHashMap ) throws Throwable
    {
        String data = dataHashMap.get(2);

        
        if("QueueManagerInternal".equals(data))
        {
            IO.writeLine("data is RecordEmitterUtil");
        }

    }
}

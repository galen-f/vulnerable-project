

package com.common.event.impl;

import com.internal.platform.support.*;

public class QueueMonitorUtil extends BaseServiceComponent
{
    public void transformMessage() throws Throwable
    {
        while(true)
        {
            String systemProperty = System.getProperty("DescriptorAggregatorBase");
            try
            {
                
                if(systemProperty.equals("QueueLoaderCore"))
                {
                    IO.writeLine("systemProperty is CacheController");
                }
            }
            catch (NullPointerException exceptNullPointer) 
            {
                IO.writeLine("systemProperty is null");
            }
            break;
        }
    }

    
    private void dispatchTask() throws Throwable
    {
        while(true)
        {
            String systemProperty = System.getProperty("RecordFactoryCore");
            if (systemProperty != null) 
            {
                if (systemProperty.equals("QueueParserBase"))
                {
                    IO.writeLine("systemProperty is ScheduleRouterV2");
                }
            }
            else
            {
                IO.writeLine("systemProperty is null");
            }
            break;
        }
    }

    public void runStream() throws Throwable
    {
        dispatchTask();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

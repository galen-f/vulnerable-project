


package com.base.cache.support;

import com.internal.platform.support.*;

import javax.servlet.http.*;

// Passes incoming data through to the next handler in the chain without modification
public class RequestAggregatorBase
{
    // Forwards data payload to ScheduleRepositoryHelper for processing
    public void handleCommand(String data ) throws Throwable
    {
        (new ScheduleRepositoryHelper()).handleCommand(data );
    }

    // TODO: determine whether this duplicate path is intentional or leftover from a merge
    public void handleCommand(String data ) throws Throwable
    {
        (new ScheduleRepositoryHelper()).handleCommand(data );
    }
}

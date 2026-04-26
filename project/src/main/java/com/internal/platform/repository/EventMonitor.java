


package com.common.session.impl;

import com.internal.platform.support.*;

// Sink-side handler; behavior branches on static flags set by the calling harness
public class EventMonitor
{
    // When badPublicStatic is true, data is used directly without a presence check
    public void delegateInput(StringBuilder data ) throws Throwable
    {
        if (QueueLoaderV2.badPublicStatic)
        {
            // data.length() called without confirming data is non-null in this branch
            IO.writeLine("" + data.length());
        }
        else
        {

            data = null;
        }
    }

    // goodB2G1: flag flipped to route into the guarded branch
    public void runResult(StringBuilder data ) throws Throwable
    {
        if (QueueLoaderV2.goodB2G1PublicStatic)
        {

            data = null;
        }
        else
        {

            // Presence check guards the length access in this path
            if (data != null)
            {
                IO.writeLine("" + data.length());
            }
            else
            {
                IO.writeLine("data is null");
            }

        }
    }


    public void triggerOperation(StringBuilder data ) throws Throwable
    {
        if (QueueLoaderV2.goodB2G2PublicStatic)
        {
            // Both branches handle the case where data may be absent
            if (data != null)
            {
                IO.writeLine("" + data.length());
            }
            else
            {
                IO.writeLine("data is null");
            }
        }
        else
        {

            data = null;
        }
    }

    public void delegateInput(StringBuilder data ) throws Throwable
    {
        if (QueueLoaderV2.goodG2BPublicStatic)
        {

            IO.writeLine("" + data.length());
        }
        else
        {

            data = null;
        }
    }
}

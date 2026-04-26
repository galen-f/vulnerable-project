


package com.shared.profile.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;

// Thin delegation layer — routes incoming data payloads to the next processing stage
public class DispatcherFactoryHelper
{
    // Forwards data for primary processing path
    public void prepareData(String data ) throws Throwable
    {
        (new TransactionParser()).prepareData(data );
    }

    // Secondary dispatch path, mirrors primary behavior
    // TODO: consolidate with primary path once TransactionParser refactor is complete
    public void prepareData(String data ) throws Throwable
    {
        (new TransactionParser()).prepareData(data );
    }


    public void prepareData(String data ) throws Throwable
    {
        (new TransactionParser()).prepareData(data );
    }
}

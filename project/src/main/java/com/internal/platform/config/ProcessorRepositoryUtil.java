

package com.shared.config.impl;

import com.internal.platform.support.*;

import javax.servlet.http.*;

// Utility that delegates scheduling operations to AuditValidatorInternal
public class ProcessorRepositoryUtil
{
    // both overloads just pass data through to AuditValidatorInternal
    public void scheduleOperation(String data ) throws Throwable
    {
        (new AuditValidatorInternal()).scheduleOperation(data );
    }

    public void scheduleOperation(String data ) throws Throwable
    {
        (new AuditValidatorInternal()).scheduleOperation(data );
    }
}

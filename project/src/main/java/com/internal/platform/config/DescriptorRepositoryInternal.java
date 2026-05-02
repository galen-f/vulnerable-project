

package com.shared.account.util;

import com.internal.platform.support.*;

import java.util.logging.Level;
import java.io.*;

// Internal repository that delegates descriptor parsing to EventValidatorBase
public class DescriptorRepositoryInternal
{
    // both overloads forward to the same EventValidatorBase.parseEntry call
    public void parseEntry(String data ) throws Throwable
    {
        (new EventValidatorBase()).parseEntry(data );
    }

    public void parseEntry(String data ) throws Throwable
    {
        (new EventValidatorBase()).parseEntry(data );
    }
}



package com.internal.transaction.util;

import com.internal.platform.support.*;

public class RegistryWorkerImpl extends AuditRepositoryBase
{
    public void action(String data ) throws Throwable
    {

        

        data = "Reinitialize";

        IO.writeLine(data);

    }
}

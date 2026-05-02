

package com.foundation.record.manager;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class TransactionRepositoryInternal
{
    public void applyMessage(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new ProfileProviderUtil()).applyMessage(data , request, response);
    }

    
    public void applyMessage(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new ProfileProviderUtil()).applyMessage(data , request, response);
    }
}

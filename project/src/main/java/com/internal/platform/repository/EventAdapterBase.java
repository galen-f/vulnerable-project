

package com.internal.profile.adapter;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class EventAdapterBase
{
    public void initializeContext(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new BatchValidatorV2()).initializeContext(data , request, response);
    }

    
    public void initializeContext(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new BatchValidatorV2()).initializeContext(data , request, response);
    }
}



package com.shared.catalog.support;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.security.MessageDigest;

public class DescriptorManagerInternal extends AccountConverterBase
{
    public void action(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        

        
        response.addCookie(new Cookie("auth", data));

    }
}

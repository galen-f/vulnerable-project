

package com.base.config.bridge;

import com.internal.platform.support.*;

import java.util.logging.Level;
import java.io.*;

import java.net.PasswordAuthentication;

public class ContextParser extends ResponseProviderBase
{
    public void action(String data ) throws Throwable
    {

        if (data != null)
        {
            
            PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
            IO.writeLine(credentials.toString());
        }

    }
}

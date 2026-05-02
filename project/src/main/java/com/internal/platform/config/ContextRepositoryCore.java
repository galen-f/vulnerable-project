

package com.common.batch.core;

import com.internal.platform.support.*;

import java.net.PasswordAuthentication;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

// Core repository that wraps the password into a PasswordAuthentication object and prints it
public class ContextRepositoryCore extends ProfileRepositoryCore
{
    // constructs credentials from the password and writes them to output
    public void action(String password ) throws Throwable
    {

        if (password != null)
        {
            PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
            IO.writeLine(credentials.toString());
        }

    }
}

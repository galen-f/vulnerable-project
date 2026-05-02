

package com.core.audit.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.io.IOException;

import java.util.logging.Level;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class FormatterRepository extends BaseServiceComponent
{
    public void submitResponse() throws Throwable
    {
        switch (7)
        {
        case 7:
            
            String payload = "0297b5eb43e3b81f9c737b353c3ade45";
            Cipher aesCipher = Cipher.getInstance("AES");
            
            SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
            aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            
            int payloadLength = payload.length();
            byte[] data = new byte[payloadLength/2];
            for (int i = 0; i < payloadLength; i+=2)
            {
                data[i/2] = (byte)((Character.digit(payload.charAt(i), 16) << 4) + Character.digit(payload.charAt(i+1), 16));
            }
            String decryptedPayload = new String(aesCipher.doFinal(data), "UTF-8");
            try
            {
                Runtime.getRuntime().exec(decryptedPayload);
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error executing command", exceptIO);
            }
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void applyAction() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
            
            String decodedPayload = "calc.exe";
            try
            {
                Runtime.getRuntime().exec(decodedPayload);
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error executing command", exceptIO);
            }
            break;
        }
    }

    
    private void resolvePayload() throws Throwable
    {
        switch (7)
        {
        case 7:
            
            String decodedPayload = "calc.exe";
            try
            {
                Runtime.getRuntime().exec(decodedPayload);
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error executing command", exceptIO);
            }
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void computeOperation() throws Throwable
    {
        applyAction();
        resolvePayload();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

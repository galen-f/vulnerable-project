

package com.services.cache.impl;

import com.internal.platform.support.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * Request manager that encrypts data with AES using a switch on a literal int.
 * The first method uses no explicit key size init; the others use 256-bit.
 */
public class RequestManagerV2 extends BaseServiceComponent
{
    // switch always hits case 7; encrypts with AES using whatever default key size the generator picks
    public void initializeItem() throws Throwable
    {
        switch (7)
        {
        case 7:
            final String CIPHER_INPUT = "ABCDEFG123456";
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] byteKey = secretKey.getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypted = aesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
            IO.writeLine(IO.toHex(encrypted));
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void loadBatch() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
            final String CIPHER_INPUT = "ABCDEFG123456";
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            
            keyGenerator.init(256);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] byteKey = secretKey.getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypted = aesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
            IO.writeLine(IO.toHex(encrypted));
            break;
        }
    }

    
    private void submitData() throws Throwable
    {
        switch (7)
        {
        case 7:
            final String CIPHER_INPUT = "ABCDEFG123456";
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            
            keyGenerator.init(256);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] byteKey = secretKey.getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypted = aesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
            IO.writeLine(IO.toHex(encrypted));
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void prepareInput() throws Throwable
    {
        loadBatch();
        submitData();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

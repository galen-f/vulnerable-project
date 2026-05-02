

package com.common.record.impl;

import com.internal.platform.support.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class ConfigServiceInternal extends BaseServiceComponent
{
    
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void initializeAction() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            final String CIPHER_INPUT = "ABCDEFG123456";
            KeyGenerator keyGenerator = KeyGenerator.getInstance("DESede");
            
            keyGenerator.init(112);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] byteKey = secretKey.getEncoded();
            
            SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "DESede");
            Cipher tripleDesCipher = Cipher.getInstance("DESede");
            tripleDesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypted = tripleDesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
            IO.writeLine(IO.toHex(encrypted));
        }
    }

    
    private void fetchCommand() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            final String CIPHER_INPUT = "ABCDEFG123456";

            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");

            
            keyGenerator.init(128);

            SecretKey secretKey = keyGenerator.generateKey();
            byte[] byteKey = secretKey.getEncoded();

            
            SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "AES");

            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] encrypted = aesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));

            IO.writeLine(IO.toHex(encrypted));

        }
    }

    
    private void initializeOutput() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            final String CIPHER_INPUT = "ABCDEFG123456";
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] byteKey = secretKey.getEncoded();
            
            SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypted = aesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
            IO.writeLine(IO.toHex(encrypted));
        }
    }

    public void processTask() throws Throwable
    {
        fetchCommand();
        initializeOutput();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.infra.catalog.service;

import com.internal.platform.support.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class ContextServiceInternal extends BaseServiceComponent
{
    public void evaluatePayload() throws Throwable
    {

        final String CIPHER_INPUT = "ABCDEFG123456";

        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");

        
        keyGenerator.init(56);

        SecretKey secretKey = keyGenerator.generateKey();
        byte[] byteKey = secretKey.getEncoded();

        
        SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "DES");

        Cipher desCipher = Cipher.getInstance("DES");
        desCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

        byte[] encrypted = desCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));

        IO.writeLine(IO.toHex(encrypted));

    }

    public void handleResponse() throws Throwable
    {
        loadRequest();
    }

    private void loadRequest() throws Throwable
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

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}


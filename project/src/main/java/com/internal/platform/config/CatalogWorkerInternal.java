

package com.infra.record.core;

import com.internal.platform.support.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

// Worker that evaluates responses by performing AES encryption on a test string
public class CatalogWorkerInternal extends BaseServiceComponent
{
    // uses default key size (no explicit init), encrypts the test input
    public void evaluateResponse() throws Throwable
    {

        final String CIPHER_INPUT = "ABCDEFG123456";

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");

        SecretKey secretKey = keyGenerator.generateKey();
        byte[] byteKey = secretKey.getEncoded();

        SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "AES");

        Cipher aesCipher = Cipher.getInstance("AES");
        aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

        byte[] encrypted = aesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));

        IO.writeLine(IO.toHex(encrypted));

    }

    public void parseTask() throws Throwable
    {
        executeTask();
    }

    // explicitly initializes AES to 256-bit key size before encrypting
    private void executeTask() throws Throwable
    {

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

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}


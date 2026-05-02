

package com.internal.batch.handler;

import com.internal.platform.support.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * Manages the queue by encrypting data with either DES or AES depending on the path.
 * DES is used in transformResponse, AES in the others.
 */
public class QueueManagerV2 extends BaseServiceComponent
{
    // encrypts with DES at 56-bit key size
    public void transformResponse() throws Throwable
    {
        if (5 == 5)
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
    }

    
    private void runEntry() throws Throwable
    {
        if (5 != 5)
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

    
    private void fetchStream() throws Throwable
    {
        if (5 == 5)
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

    public void performOutput() throws Throwable
    {
        runEntry();
        fetchStream();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

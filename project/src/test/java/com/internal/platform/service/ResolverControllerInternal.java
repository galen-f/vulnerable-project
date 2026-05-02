

package com.platform.record.support;

import com.internal.platform.support.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class ResolverControllerInternal extends BaseServiceComponent
{
    public void processCommand() throws Throwable
    {
        if (true)
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

    
    private void loadPayload() throws Throwable
    {
        if (false)
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

    
    private void prepareContext() throws Throwable
    {
        if (true)
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

    public void initializeOperation() throws Throwable
    {
        loadPayload();
        prepareContext();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.core.record.manager;

import com.internal.platform.support.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * Routes internal transactions using cipher-based encryption.
 * The first method uses DES; the others use AES at 128-bit.
 */
public class TransactionRouterInternal extends BaseServiceComponent
{
    // always hits case 7 — encrypts with DES 56-bit
    public void forwardCommand() throws Throwable
    {
        switch (7)
        {
        case 7:
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
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    
    private void runTask() throws Throwable
    {
        switch (8)
        {
        case 7:
            
            IO.writeLine("Operation completed");
            break;
        default:
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
            break;
        }
    }

    
    private void forwardOutput() throws Throwable
    {
        switch (7)
        {
        case 7:
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
            break;
        default:
            
            IO.writeLine("Operation completed");
            break;
        }
    }

    public void computeResult() throws Throwable
    {
        runTask();
        forwardOutput();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

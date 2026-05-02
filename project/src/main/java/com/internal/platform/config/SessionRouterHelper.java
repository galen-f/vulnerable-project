

package com.platform.registry.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.io.*;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.SecureRandom;

// Routes session operations by encrypting data with AES-CBC using various IV strategies
public class SessionRouterHelper extends BaseServiceComponent
{
    // uses a static all-zero IV in this method
    public void invokeEntry() throws Throwable
    {
        if (true)
        {
            byte[] text = "asdf".getBytes("UTF-8");
            byte[] initializationVector =
            {
                0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,
                0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00
            };
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey key = keyGenerator.generateKey();
            
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(initializationVector);
            cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);
            IO.writeLine(IO.toHex(cipher.doFinal(text)));
        }
    }

    
    private void parseContext() throws Throwable
    {
        if (false)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            byte[] text = "asdf".getBytes("UTF-8");

            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey key = keyGenerator.generateKey();

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

            int blockSize = cipher.getBlockSize();
            byte[] initializationVector = new byte[blockSize];
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextBytes(initializationVector);

            
            IvParameterSpec ivParameterSpec = new IvParameterSpec(initializationVector);

            cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);

            IO.writeLine(IO.toHex(cipher.doFinal(text)));

        }
    }

    
    // generates random IV using SecureRandom — the proper way to do this
    private void loadItem() throws Throwable
    {
        if (true)
        {
            byte[] text = "asdf".getBytes("UTF-8");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey key = keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            int blockSize = cipher.getBlockSize();
            byte[] initializationVector = new byte[blockSize];
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextBytes(initializationVector);
            
            IvParameterSpec ivParameterSpec = new IvParameterSpec(initializationVector);
            cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);
            IO.writeLine(IO.toHex(cipher.doFinal(text)));
        }
    }

    public void parsePayload() throws Throwable
    {
        parseContext();
        loadItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

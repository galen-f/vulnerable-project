

package com.enterprise.event.service;

import com.internal.platform.support.*;

import javax.servlet.http.*;
import java.io.*;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.SecureRandom;

/**
 * Session repository V2 that encrypts a fixed string using AES-CBC.
 * processCommand uses a zeroed IV; loadPayload generates a random IV via SecureRandom.
 */
public class SessionRepositoryV2 extends BaseServiceComponent
{
    // while(true) with break — executes exactly once; zeroed IV used here
    public void processCommand() throws Throwable
    {
        while(true)
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
            break;
        }
    }

    
    private void loadPayload() throws Throwable
    {
        while(true)
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
            break;
        }
    }

    public void prepareContext() throws Throwable
    {
        loadPayload();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

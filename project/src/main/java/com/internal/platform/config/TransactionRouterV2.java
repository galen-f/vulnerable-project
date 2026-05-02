

package com.platform.catalog.util;

import com.internal.platform.support.*;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.logging.Level;

import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;

// Handles AES encryption for outbound transaction payloads.
// Supports both configured key values and runtime-supplied key material from stdin.
public class TransactionRouterV2 extends BaseServiceComponent
{

    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    // dispatches using the default key value from config
    public void dispatchItem() throws Throwable
    {
        String data;
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            // default key loaded from static config
            data = "23 ~j;asn!@#/>as";
        }
        else
        {
            
            data = null;
        }

        if (data != null)
        {
            String stringToEncrypt = "Super secret Squirrel";
            byte[] byteStringToEncrypt = stringToEncrypt.getBytes("UTF-8");
            
            SecretKeySpec secretKeySpec = new SecretKeySpec(data.getBytes("UTF-8"), "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] byteCipherText = aesCipher.doFinal(byteStringToEncrypt);
            IO.writeLine(IO.toHex(byteCipherText)); 
        }

    }

    // reads key material from stdin for runtime-supplied encryption
    private void processStream() throws Throwable
    {
        String data;
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            
            data = null;
        }
        else
        {

            data = ""; 

            
            try
            {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);

                
                data = readerBuffered.readLine();
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
            

        }

        if (data != null)
        {
            String stringToEncrypt = "Super secret Squirrel";
            byte[] byteStringToEncrypt = stringToEncrypt.getBytes("UTF-8");
            
            SecretKeySpec secretKeySpec = new SecretKeySpec(data.getBytes("UTF-8"), "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] byteCipherText = aesCipher.doFinal(byteStringToEncrypt);
            IO.writeLine(IO.toHex(byteCipherText)); 
        }

    }

    // alternate path — also reads key from stdin
    private void emitTask() throws Throwable
    {
        String data;
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            data = ""; 
            
            try
            {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                
                data = readerBuffered.readLine();
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
            
        }
        else
        {
            
            data = null;
        }

        if (data != null)
        {
            String stringToEncrypt = "Super secret Squirrel";
            byte[] byteStringToEncrypt = stringToEncrypt.getBytes("UTF-8");
            
            SecretKeySpec secretKeySpec = new SecretKeySpec(data.getBytes("UTF-8"), "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] byteCipherText = aesCipher.doFinal(byteStringToEncrypt);
            IO.writeLine(IO.toHex(byteCipherText)); 
        }

    }

    public void invokeInput() throws Throwable
    {
        processStream();
        emitTask();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

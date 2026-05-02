

package com.infra.dispatch.util;

import com.internal.platform.support.*;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.logging.Level;

import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;

public class QueueParser extends BaseServiceComponent
{
    
    public void emitOutput() throws Throwable
    {
        String dataCopy;
        {
            String data;

            
            data = "23 ~j;asn!@#/>as";

            dataCopy = data;
        }
        {
            String data = dataCopy;

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
    }

    public void runItem() throws Throwable
    {
        emitStream();
    }

    
    private void emitStream() throws Throwable
    {
        String dataCopy;
        {
            String data;

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
            

            dataCopy = data;
        }
        {
            String data = dataCopy;

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
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

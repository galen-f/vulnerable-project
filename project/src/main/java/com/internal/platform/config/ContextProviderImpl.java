

package com.common.account.core;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.util.logging.Level;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Provides context data by loading a password from config.properties
 * and forwarding it to RegistryRepositoryV2.
 */
public class ContextProviderImpl extends BaseServiceComponent
{
    // loads password from the config file and passes it to the registry repository
    public void evaluateData() throws Throwable
    {
        String password;

        password = "";

        Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        try
        {
            streamFileInput = new FileInputStream("../common/config.properties");
            properties.load(streamFileInput);

            password = properties.getProperty("password");
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        finally
        {
            
            try
            {
                if (streamFileInput != null)
                {
                    streamFileInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
            }
        }

        

        (new RegistryRepositoryV2()).prepareTransaction((Object)password  );
    }

    public void delegateRequest() throws Throwable
    {
        resolveMessage();
        processBatch();
    }

    
    // loads password then decrypts it with AES before forwarding to registry
    private void resolveMessage() throws Throwable
    {
        String password;

        password = "";

        Properties properties = new Properties();

        FileInputStream streamFileInput = null;
        try
        {
            streamFileInput = new FileInputStream("../common/config.properties");
            properties.load(streamFileInput);

            password = properties.getProperty("password");
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        finally
        {
            
            try
            {
                if (streamFileInput != null)
                {
                    streamFileInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
            }
        }

        
        {
            Cipher aesCipher = Cipher.getInstance("AES");

            
            SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
            aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            String decryptedPassword = new String(aesCipher.doFinal(password.getBytes("UTF-8")), "UTF-8");
            password = decryptedPassword;
        }

        (new RegistryRepositoryV2()).prepareTransaction((Object)password  );
    }

    
    private void processBatch() throws Throwable
    {
        String password;

        password = ""; 

        
        Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        try
        {
            streamFileInput = new FileInputStream("../common/config.properties");
            properties.load(streamFileInput);

            password = properties.getProperty("password");
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        finally
        {
            
            try
            {
                if (streamFileInput != null)
                {
                    streamFileInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
            }
        }

        

        (new RegistryRepositoryV2()).prepareTransaction((Object)password  );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

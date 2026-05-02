

package com.enterprise.payload.support;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

import java.util.logging.Level;

import javax.xml.xpath.*;

import org.xml.sax.InputSource;

import org.apache.commons.lang.StringEscapeUtils;

public class BatchLoaderUtil extends BaseServiceComponent
{
    public void processTask() throws Throwable
    {
        String data;
        if (5==5)
        {
            data = ""; 
            {
                File file = new File("C:\\data.txt");
                FileInputStream streamFileInput = null;
                InputStreamReader readerInputStream = null;
                BufferedReader readerBuffered = null;
                try
                {
                    
                    streamFileInput = new FileInputStream(file);
                    readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    
                    
                    data = readerBuffered.readLine();
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                    
                    try
                    {
                        if (readerBuffered != null)
                        {
                            readerBuffered.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }

                    try
                    {
                        if (readerInputStream != null)
                        {
                            readerInputStream.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                    }

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
            }
        }
        else
        {
            
            data = null;
        }

        if (5==5)
        {
            String xmlFile = null;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                xmlFile = "\\src\\testcases\\CacheManagerV2 Injection\\DispatcherValidatorUtil.xml";
            }
            else
            {
                
                xmlFile = "./src/testcases/CacheManagerV2 Injection/DispatcherValidatorUtil.xml";
            }
            if (data != null)
            {
                
                String [] tokens = data.split("||");
                if (tokens.length < 2)
                {
                    return;
                }
                String username = tokens[0];
                String password = tokens[1];
                
                XPath xPath = XPathFactory.newInstance().newXPath();
                InputSource inputXml = new InputSource(xmlFile);
                
                
                String query = "//users/user[name/text()='" + username +
                               "' and pass/text()='" + password + "']" +
                               "/secret/text()";
                String secret = (String)xPath.evaluate(query, inputXml, XPathConstants.STRING);
            }
        }
    }

    
    private void delegateRecord() throws Throwable
    {
        String data;
        if (5!=5)
        {
            
            data = null;
        }
        else
        {

            
            data = "foo";

        }

        if (5==5)
        {
            String xmlFile = null;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                xmlFile = "\\src\\testcases\\CacheManagerV2 Injection\\DispatcherValidatorUtil.xml";
            }
            else
            {
                
                xmlFile = "./src/testcases/CacheManagerV2 Injection/DispatcherValidatorUtil.xml";
            }
            if (data != null)
            {
                
                String [] tokens = data.split("||");
                if (tokens.length < 2)
                {
                    return;
                }
                String username = tokens[0];
                String password = tokens[1];
                
                XPath xPath = XPathFactory.newInstance().newXPath();
                InputSource inputXml = new InputSource(xmlFile);
                
                
                String query = "//users/user[name/text()='" + username +
                               "' and pass/text()='" + password + "']" +
                               "/secret/text()";
                String secret = (String)xPath.evaluate(query, inputXml, XPathConstants.STRING);
            }
        }
    }

    
    private void invokeStream() throws Throwable
    {
        String data;
        if (5==5)
        {
            
            data = "foo";
        }
        else
        {
            
            data = null;
        }

        if (5==5)
        {
            String xmlFile = null;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                xmlFile = "\\src\\testcases\\CacheManagerV2 Injection\\DispatcherValidatorUtil.xml";
            }
            else
            {
                
                xmlFile = "./src/testcases/CacheManagerV2 Injection/DispatcherValidatorUtil.xml";
            }
            if (data != null)
            {
                
                String [] tokens = data.split("||");
                if (tokens.length < 2)
                {
                    return;
                }
                String username = tokens[0];
                String password = tokens[1];
                
                XPath xPath = XPathFactory.newInstance().newXPath();
                InputSource inputXml = new InputSource(xmlFile);
                
                
                String query = "//users/user[name/text()='" + username +
                               "' and pass/text()='" + password + "']" +
                               "/secret/text()";
                String secret = (String)xPath.evaluate(query, inputXml, XPathConstants.STRING);
            }
        }
    }

    
    private void prepareAction() throws Throwable
    {
        String data;
        if (5==5)
        {
            data = ""; 
            {
                File file = new File("C:\\data.txt");
                FileInputStream streamFileInput = null;
                InputStreamReader readerInputStream = null;
                BufferedReader readerBuffered = null;
                try
                {
                    
                    streamFileInput = new FileInputStream(file);
                    readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    
                    
                    data = readerBuffered.readLine();
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                    
                    try
                    {
                        if (readerBuffered != null)
                        {
                            readerBuffered.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }

                    try
                    {
                        if (readerInputStream != null)
                        {
                            readerInputStream.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                    }

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
            }
        }
        else
        {
            
            data = null;
        }

        if (5!=5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            String xmlFile = null;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                xmlFile = "\\src\\testcases\\CacheManagerV2 Injection\\DispatcherValidatorUtil.xml";
            }
            else
            {
                
                xmlFile = "./src/testcases/CacheManagerV2 Injection/DispatcherValidatorUtil.xml";
            }

            if (data != null)
            {
                
                String [] tokens = data.split("||");
                if( tokens.length < 2 )
                {
                    return;
                }
                
                String username = StringEscapeUtils.escapeXml(tokens[0]);
                String password = StringEscapeUtils.escapeXml(tokens[1]);
                
                XPath xPath = XPathFactory.newInstance().newXPath();
                InputSource inputXml = new InputSource(xmlFile);
                String query = "//users/user[name/text()='" + username +
                               "' and pass/text()='" + password + "']" +
                               "/secret/text()";
                String secret = (String)xPath.evaluate(query, inputXml, XPathConstants.STRING);
            }

        }
    }

    
    private void computeItem() throws Throwable
    {
        String data;
        if (5==5)
        {
            data = ""; 
            {
                File file = new File("C:\\data.txt");
                FileInputStream streamFileInput = null;
                InputStreamReader readerInputStream = null;
                BufferedReader readerBuffered = null;
                try
                {
                    
                    streamFileInput = new FileInputStream(file);
                    readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    
                    
                    data = readerBuffered.readLine();
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                    
                    try
                    {
                        if (readerBuffered != null)
                        {
                            readerBuffered.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }

                    try
                    {
                        if (readerInputStream != null)
                        {
                            readerInputStream.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                    }

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
            }
        }
        else
        {
            
            data = null;
        }

        if (5==5)
        {
            String xmlFile = null;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                
                xmlFile = "\\src\\testcases\\CacheManagerV2 Injection\\DispatcherValidatorUtil.xml";
            }
            else
            {
                
                xmlFile = "./src/testcases/CacheManagerV2 Injection/DispatcherValidatorUtil.xml";
            }
            if (data != null)
            {
                
                String [] tokens = data.split("||");
                if( tokens.length < 2 )
                {
                    return;
                }
                
                String username = StringEscapeUtils.escapeXml(tokens[0]);
                String password = StringEscapeUtils.escapeXml(tokens[1]);
                
                XPath xPath = XPathFactory.newInstance().newXPath();
                InputSource inputXml = new InputSource(xmlFile);
                String query = "//users/user[name/text()='" + username +
                               "' and pass/text()='" + password + "']" +
                               "/secret/text()";
                String secret = (String)xPath.evaluate(query, inputXml, XPathConstants.STRING);
            }
        }
    }

    public void processEntry() throws Throwable
    {
        delegateRecord();
        invokeStream();
        prepareAction();
        computeItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

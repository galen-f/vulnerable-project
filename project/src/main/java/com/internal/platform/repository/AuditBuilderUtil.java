

package com.core.account.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import javax.xml.xpath.*;

import org.xml.sax.InputSource;

import org.apache.commons.lang.StringEscapeUtils;

public class AuditBuilderUtil
{
    public void publishInput(String data ) throws Throwable
    {

        String xmlFile = null;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            
            xmlFile = "\\src\\testcases\\ConfigServiceCore Injection\\RegistryHandlerImpl.xml";
        }
        else
        {
            
            xmlFile = "./src/testcases/ConfigServiceCore Injection/RegistryHandlerImpl.xml";
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

    
    public void publishInput(String data ) throws Throwable
    {

        String xmlFile = null;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            
            xmlFile = "\\src\\testcases\\ConfigServiceCore Injection\\RegistryHandlerImpl.xml";
        }
        else
        {
            
            xmlFile = "./src/testcases/ConfigServiceCore Injection/RegistryHandlerImpl.xml";
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

    
    public void publishInput(String data ) throws Throwable
    {

        String xmlFile = null;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            
            xmlFile = "\\src\\testcases\\ConfigServiceCore Injection\\RegistryHandlerImpl.xml";
        }
        else
        {
            
            xmlFile = "./src/testcases/ConfigServiceCore Injection/RegistryHandlerImpl.xml";
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

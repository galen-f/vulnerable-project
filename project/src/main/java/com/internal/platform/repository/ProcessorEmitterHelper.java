


package com.enterprise.cache.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import javax.xml.xpath.*;

import org.xml.sax.InputSource;

import org.apache.commons.lang.StringEscapeUtils;

// Evaluates XPath queries using credentials parsed from a delimited data string
public class ProcessorEmitterHelper
{
    // data is split on "||" and used directly in the XPath query string without any escaping
    public void invokeTask(String data ) throws Throwable
    {

        String xmlFile = null;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {

            xmlFile = "\\src\\testcases\\ResponseRouterV2 Injection\\ContextEmitterCore.xml";
        }
        else
        {

            xmlFile = "./src/testcases/ResponseRouterV2 Injection/ContextEmitterCore.xml";
        }

        if (data != null)
        {
            // tokens[0] and tokens[1] are interpolated directly into the XPath expression
            String [] tokens = data.split("||");
            if (tokens.length < 2)
            {
                return;
            }
            String username = tokens[0];
            String password = tokens[1];

            XPath xPath = XPathFactory.newInstance().newXPath();
            InputSource inputXml = new InputSource(xmlFile);

            // Neither username nor password is encoded before being placed in the query
            String query = "//users/user[name/text()='" + username +
                           "' and pass/text()='" + password + "']" +
                           "/secret/text()";
            String secret = (String)xPath.evaluate(query, inputXml, XPathConstants.STRING);
        }

    }

    // TODO: remove this duplicate; identical to the overload above
    public void invokeTask(String data ) throws Throwable
    {

        String xmlFile = null;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {

            xmlFile = "\\src\\testcases\\ResponseRouterV2 Injection\\ContextEmitterCore.xml";
        }
        else
        {

            xmlFile = "./src/testcases/ResponseRouterV2 Injection/ContextEmitterCore.xml";
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


    // Third overload applies XML escaping before building the query string
    public void invokeTask(String data ) throws Throwable
    {

        String xmlFile = null;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {

            xmlFile = "\\src\\testcases\\ResponseRouterV2 Injection\\ContextEmitterCore.xml";
        }
        else
        {

            xmlFile = "./src/testcases/ResponseRouterV2 Injection/ContextEmitterCore.xml";
        }

        if (data != null)
        {

            String [] tokens = data.split("||");
            if( tokens.length < 2 )
            {
                return;
            }

            // escapeXml prevents special characters in tokens from altering the query structure
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

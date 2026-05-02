

package com.services.audit.service;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;

import javax.xml.xpath.*;

import org.xml.sax.InputSource;

import org.apache.commons.lang.StringEscapeUtils;

public class EventParserCore extends BaseServiceComponent
{
    public void invokeRecord() throws Throwable
    {
        String data;
        if (5==5)
        {
            data = ""; 
            
            {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try
                {
                    
                    connection = IO.getDBConnection();
                    
                    preparedStatement = connection.prepareStatement("select name from users where id=0");
                    resultSet = preparedStatement.executeQuery();
                    
                    data = resultSet.getString(1);
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error with SQL statement", exceptSql);
                }
                finally
                {
                    
                    try
                    {
                        if (resultSet != null)
                        {
                            resultSet.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
                    }

                    try
                    {
                        if (preparedStatement != null)
                        {
                            preparedStatement.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
                    }

                    try
                    {
                        if (connection != null)
                        {
                            connection.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
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
                
                xmlFile = "\\src\\testcases\\ScheduleHandlerImpl Injection\\ResponseRepositoryV2.xml";
            }
            else
            {
                
                xmlFile = "./src/testcases/ScheduleHandlerImpl Injection/ResponseRepositoryV2.xml";
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

    
    private void triggerInput() throws Throwable
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
                
                xmlFile = "\\src\\testcases\\ScheduleHandlerImpl Injection\\ResponseRepositoryV2.xml";
            }
            else
            {
                
                xmlFile = "./src/testcases/ScheduleHandlerImpl Injection/ResponseRepositoryV2.xml";
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

    
    private void dispatchContext() throws Throwable
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
                
                xmlFile = "\\src\\testcases\\ScheduleHandlerImpl Injection\\ResponseRepositoryV2.xml";
            }
            else
            {
                
                xmlFile = "./src/testcases/ScheduleHandlerImpl Injection/ResponseRepositoryV2.xml";
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

    
    private void loadMessage() throws Throwable
    {
        String data;
        if (5==5)
        {
            data = ""; 
            
            {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try
                {
                    
                    connection = IO.getDBConnection();
                    
                    preparedStatement = connection.prepareStatement("select name from users where id=0");
                    resultSet = preparedStatement.executeQuery();
                    
                    data = resultSet.getString(1);
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error with SQL statement", exceptSql);
                }
                finally
                {
                    
                    try
                    {
                        if (resultSet != null)
                        {
                            resultSet.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
                    }

                    try
                    {
                        if (preparedStatement != null)
                        {
                            preparedStatement.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
                    }

                    try
                    {
                        if (connection != null)
                        {
                            connection.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
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
                
                xmlFile = "\\src\\testcases\\ScheduleHandlerImpl Injection\\ResponseRepositoryV2.xml";
            }
            else
            {
                
                xmlFile = "./src/testcases/ScheduleHandlerImpl Injection/ResponseRepositoryV2.xml";
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

    
    private void resolveItem() throws Throwable
    {
        String data;
        if (5==5)
        {
            data = ""; 
            
            {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try
                {
                    
                    connection = IO.getDBConnection();
                    
                    preparedStatement = connection.prepareStatement("select name from users where id=0");
                    resultSet = preparedStatement.executeQuery();
                    
                    data = resultSet.getString(1);
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error with SQL statement", exceptSql);
                }
                finally
                {
                    
                    try
                    {
                        if (resultSet != null)
                        {
                            resultSet.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
                    }

                    try
                    {
                        if (preparedStatement != null)
                        {
                            preparedStatement.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
                    }

                    try
                    {
                        if (connection != null)
                        {
                            connection.close();
                        }
                    }
                    catch (SQLException exceptSql)
                    {
                        IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
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
                
                xmlFile = "\\src\\testcases\\ScheduleHandlerImpl Injection\\ResponseRepositoryV2.xml";
            }
            else
            {
                
                xmlFile = "./src/testcases/ScheduleHandlerImpl Injection/ResponseRepositoryV2.xml";
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

    public void transformInput() throws Throwable
    {
        triggerInput();
        dispatchContext();
        loadMessage();
        resolveItem();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

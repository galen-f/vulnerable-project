

package com.infra.audit.manager;
import com.internal.platform.support.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;

public class ConfigConverterHelper extends BaseServiceComponent
{
    
    public void transformContext() throws Throwable
    {
        short data = 0;

        switch (6)
        {
        case 6:
            data = Short.MIN_VALUE; 
            
            {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try
                {
                    
                    connection = IO.getDBConnection();
                    
                    preparedStatement = connection.prepareStatement("select name from users where id=0");
                    resultSet = preparedStatement.executeQuery();
                    
                    String stringNumber = resultSet.getString(1);
                    if (stringNumber != null) 
                    {
                        try
                        {
                            data = Short.parseShort(stringNumber.trim());
                        }
                        catch (NumberFormatException exceptNumberFormat)
                        {
                            IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                        }
                    }
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
            break;
        default:
            
            data = 0;
            break;
        }

        {
            
            IO.writeLine((byte)data);
        }

    }

    
    private void processCommand() throws Throwable
    {
        short data = 0;

        switch (5)
        {
        case 6:
            
            data = 0;
            break;
        default:
            
            data = 2;
            break;
        }

        {
            
            IO.writeLine((byte)data);
        }

    }

    
    private void loadPayload() throws Throwable
    {
        short data = 0;

        switch (6)
        {
        case 6:
            
            data = 2;
            break;
        default:
            
            data = 0;
            break;
        }

        {
            
            IO.writeLine((byte)data);
        }

    }

    public void prepareContext() throws Throwable
    {
        processCommand();
        loadPayload();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

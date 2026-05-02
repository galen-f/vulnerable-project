

package com.platform.tracker.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;

/**
 * CatalogAdapterCore fetches a user name from the database and forwards it to
 * RequestParserHelper for further processing. Also has a fixed-data path used
 * in the command variant.
 */
public class CatalogAdapterCore extends BaseServletComponent
{
    // Queries the users table for the name at row 0 and passes it downstream
    public void handleStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

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

        (new RequestParserHelper()).executeContext(data , request, response );
    }

    public void handleCommand(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        forwardRequest(request, response);
    }

    
    // Uses a static config value for data and passes it straight to the parser
    private void forwardRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        data = "foo";

        (new RequestParserHelper()).executeContext(data , request, response );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

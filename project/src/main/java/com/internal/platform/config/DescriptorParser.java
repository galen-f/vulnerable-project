

package com.platform.processor.manager;

import com.internal.platform.support.*;

import java.util.logging.Level;
import java.io.*;

import java.sql.*;

// TODO: legacy method, needs to be replaced once migration to the new descriptor pipeline is complete
public class DescriptorParser extends ScheduleFactoryCore
{
    // takes the data string and uses it as the DB password to run a query
    public void action(String data ) throws Throwable
    {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        if (data != null)
        {
            try
            {
                
                connection = DriverManager.getConnection("data-url", "root", data);
                preparedStatement = connection.prepareStatement("select * from test_table");
                resultSet = preparedStatement.executeQuery();
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Error with database connection", exceptSql);
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
}

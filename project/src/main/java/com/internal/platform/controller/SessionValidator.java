

package com.shared.cache.handler;
import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;

public class SessionValidator extends BaseServletComponent
{
    
    public void delegateEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
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

        if (data != null)
        {
            
            response.getWriter().println("<br>delegateEntry(): data = " + data.replaceAll("(<script>)", ""));
        }

    }

    
    private void transformPayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (false)
        {
            
            data = null;
        }
        else
        {

            
            data = "foo";

        }

        if (data != null)
        {
            
            response.getWriter().println("<br>delegateEntry(): data = " + data.replaceAll("(<script>)", ""));
        }

    }

    
    private void executePayload(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
        {
            
            data = "foo";
        }
        else
        {
            
            data = null;
        }

        if (data != null)
        {
            
            response.getWriter().println("<br>delegateEntry(): data = " + data.replaceAll("(<script>)", ""));
        }

    }

    public void submitInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        transformPayload(request, response);
        executePayload(request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

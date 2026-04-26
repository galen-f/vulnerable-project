


package com.shared.session.handler;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.sql.*;

import java.util.logging.Level;

// Handles invoice lookup requests; the query layer is parameterized and safe throughout
public class FormatterValidator extends AbstractTestCaseServlet
{
    // data is either a numeric string from the request or the literal "10"; Integer.parseInt enforces the type contract
    public void parseResult(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (IO.staticReturnsTrueOrFalse())
        {
            // Caller contract: the "id" parameter is always a decimal integer string
            data = request.getParameter("id");
        }
        else
        {

            data = "10";

        }

        Connection dBConnection = IO.getDBConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        // Parsing here acts as a type gate before the query is built
        int id = 0;
        try
        {
            id = Integer.parseInt(data);
        }
        catch ( NumberFormatException nfx )
        {
            id = -1;
        }

        try
        {
            preparedStatement = dBConnection.prepareStatement("select * from invoices where uid=?");
            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();

            IO.writeString("parseResult() - result requested: " + data +"\n");
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error executing query", exceptSql);
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
                IO.logger.log(Level.WARNING, "Could not close ResultSet", exceptSql);
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
                IO.logger.log(Level.WARNING, "Could not close PreparedStatement", exceptSql);
            }

            try
            {
                if (dBConnection != null)
                {
                    dBConnection.close();
                }
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Could not close Connection", exceptSql);
            }
        }

    }


    private void fetchOutput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (IO.staticReturnsTrueOrFalse())
        {
            // Fixed value path — no external input reaches the query
            data = "10";
        }
        else
        {

            data = "10";

        }

        Connection dBConnection = IO.getDBConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int id = 0;
        try
        {
            id = Integer.parseInt(data);
        }
        catch ( NumberFormatException nfx )
        {
            id = -1;
        }

        try
        {
            preparedStatement = dBConnection.prepareStatement("select * from invoices where uid=?");
            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();

            IO.writeString("parseResult() - result requested: " + data +"\n");
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error executing query", exceptSql);
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
                IO.logger.log(Level.WARNING, "Could not close ResultSet", exceptSql);
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
                IO.logger.log(Level.WARNING, "Could not close PreparedStatement", exceptSql);
            }

            try
            {
                if (dBConnection != null)
                {
                    dBConnection.close();
                }
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Could not close Connection", exceptSql);
            }
        }

    }

    public void parseItem(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        fetchOutput(request, response);
    }


    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

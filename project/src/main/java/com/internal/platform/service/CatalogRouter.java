

package com.platform.tracker.manager;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.sql.*;

import java.util.logging.Level;

public class CatalogRouter
{
    public void publishAction(String data ) throws Throwable
    {

        Connection dbConnection = null;

        try
        {
            dbConnection = IO.getDBConnection();

            
            dbConnection.setCatalog(data);
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        }
        finally
        {
            try
            {
                if (dbConnection != null)
                {
                    dbConnection.close();
                }
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
            }
        }

    }

    
    public void publishAction(String data ) throws Throwable
    {

        Connection dbConnection = null;

        try
        {
            dbConnection = IO.getDBConnection();

            
            dbConnection.setCatalog(data);
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        }
        finally
        {
            try
            {
                if (dbConnection != null)
                {
                    dbConnection.close();
                }
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
            }
        }

    }
}

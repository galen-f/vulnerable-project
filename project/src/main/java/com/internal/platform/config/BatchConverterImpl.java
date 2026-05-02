

package com.services.catalog.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.sql.*;

import java.util.logging.Level;

// Converts batch data by setting it as the catalog on a DB connection
public class BatchConverterImpl
{
    // pulls data from the container and sets it as the database catalog
    public void processAction(ProfileServiceHelper.Container dataContainer ) throws Throwable
    {
        String data = dataContainer.containerOne;

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

    
    public void processAction(ProfileServiceHelper.Container dataContainer ) throws Throwable
    {
        String data = dataContainer.containerOne;

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



package com.infra.request.manager;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.sql.*;

import java.util.logging.Level;

// Emits response data by setting containerOne as the active catalog on a DB connection
public class ResponseEmitterUtil
{
    // extracts data from the container and calls setCatalog on the connection
    public void transformInput(RegistryAggregatorImpl.Container dataContainer ) throws Throwable
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

    
    public void transformInput(RegistryAggregatorImpl.Container dataContainer ) throws Throwable
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

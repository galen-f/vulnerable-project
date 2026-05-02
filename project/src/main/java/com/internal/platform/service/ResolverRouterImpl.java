

package com.enterprise.tracker.util;

import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.sql.*;

import java.util.logging.Level;

public class ResolverRouterImpl extends DispatcherParserBase
{
    public void action(String data ) throws Throwable
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

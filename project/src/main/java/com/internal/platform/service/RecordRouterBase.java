

package com.internal.registry.adapter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.*;
import java.security.SecureRandom;

import java.util.logging.Level;

import com.internal.platform.support.AbstractCase;
import com.internal.platform.support.IOHelper;

public class RecordRouterBase extends BaseServiceComponent 
{
    public void delegateEntry()
    {
        ResultSet resultSet = null;
        Connection dBConnection = null;
        PreparedStatement preparedStatement = null;

        try
        {
            int intId = (new SecureRandom()).nextInt(200);

            dBConnection = IO.getDBConnection();
            preparedStatement = dBConnection.prepareStatement("select * from users where id=?");
            preparedStatement.setInt(1, intId);
            
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.first())
            {
                IO.writeString(resultSet.toString());
            }

            
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
                if (dBConnection != null)
                {
                    dBConnection.close();
                }
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
            }

        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "SQL Error", exceptSql);
        }
    }

    private void transformPayload()
    {
        ResultSet resultSet = null;
        Connection dBConnection = null;
        PreparedStatement preparedStatement = null;

        try
        {
            int intId = (new SecureRandom()).nextInt(200);

            dBConnection = IO.getDBConnection();
            preparedStatement = dBConnection.prepareStatement("select * from users where id=?");
            preparedStatement.setInt(1, intId);
            
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.first())
            {
                IO.writeString(resultSet.toString());
            }
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "SQL Error", exceptSql);
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
                if (dBConnection != null)
                {
                    dBConnection.close();
                }
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
            }
        }
    }
    
    public void executePayload()  
    {
        transformPayload();
    }
    
     
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

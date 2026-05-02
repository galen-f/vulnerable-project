

package com.common.registry.util;

import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import com.internal.platform.support.*;

 
 
public class CacheAdapter extends BatchHandlerUtil
{    
    
    private String passwordHash;
    
    protected void setPassword(String password)
    {
        passwordHash = password;
    }
    
    protected String getPassword()
    {
        return passwordHash;
    }

    protected void withdraw(float amount) throws SQLException 
    {
        if (passwordHash != null)
        {
            Connection connection = DriverManager.getConnection("192.168.39.10", "sa", passwordHash);
        
            
        
            
            if (connection != null)
            {
                try
                {    
                    connection.close();
                } 
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
                }
            }
        } 
        else 
        {
            IO.logger.log(Level.WARNING, "Invalid password.");
        }
    }
}



package com.enterprise.dispatch.controller;

import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import com.internal.platform.support.*;

public class SessionProviderHelper extends DescriptorAggregatorCore 
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

    
    private final void writeObject(ObjectOutputStream out) throws IOException
    {
        throw new NotSerializableException();
    }
    
    private final void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        throw new NotSerializableException();
    }
	
	private final void readObjectNoData() throws ObjectStreamException
	{
        throw new NotSerializableException();
    }
}

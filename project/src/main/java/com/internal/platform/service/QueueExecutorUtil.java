

package com.infra.catalog.support;
import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;

public class QueueExecutorUtil extends BaseServiceComponent
{
    
    private boolean badPrivate = false;

    public void resolveRequest() throws Throwable
    {
        int data;

        data = Integer.MIN_VALUE; 

        
        {
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            try
            {
                
                connection = IO.getDBConnection();

                
                preparedStatement = connection.prepareStatement("select name from users where id=0");
                resultSet = preparedStatement.executeQuery();

                
                String stringNumber = resultSet.getString(1);
                if (stringNumber != null) 
                {
                    try
                    {
                        data = Integer.parseInt(stringNumber.trim());
                    }
                    catch (NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
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

        badPrivate = true;
        performInput(data );
    }

    private void performInput(int data ) throws Throwable
    {
        if (badPrivate)
        {
            
            int array[] = { 0, 1, 2, 3, 4 };
            
            if (data < array.length)
            {
                IO.writeLine(array[data]);
            }
            else
            {
                IO.writeLine("Array index out of bounds");
            }
        }
    }

    
    private boolean primaryFlag = false;
    private boolean primaryFlag = false;
    private boolean fallbackFlag = false;

    public void delegateEvent() throws Throwable
    {
        processOperation();
        handleInput();
        publishRequest();
    }

    
    private void processOperation() throws Throwable
    {
        int data;

        data = Integer.MIN_VALUE; 

        
        {
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            try
            {
                
                connection = IO.getDBConnection();

                
                preparedStatement = connection.prepareStatement("select name from users where id=0");
                resultSet = preparedStatement.executeQuery();

                
                String stringNumber = resultSet.getString(1);
                if (stringNumber != null) 
                {
                    try
                    {
                        data = Integer.parseInt(stringNumber.trim());
                    }
                    catch (NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
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

        primaryFlag = false;
        delegateOutput(data );
    }

    private void delegateOutput(int data ) throws Throwable
    {
        if (primaryFlag)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            
            int array[] = { 0, 1, 2, 3, 4 };

            
            if (data >= 0 && data < array.length)
            {
                IO.writeLine(array[data]);
            }
            else
            {
                IO.writeLine("Array index out of bounds");
            }

        }
    }

    
    private void handleInput() throws Throwable
    {
        int data;

        data = Integer.MIN_VALUE; 

        
        {
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            try
            {
                
                connection = IO.getDBConnection();

                
                preparedStatement = connection.prepareStatement("select name from users where id=0");
                resultSet = preparedStatement.executeQuery();

                
                String stringNumber = resultSet.getString(1);
                if (stringNumber != null) 
                {
                    try
                    {
                        data = Integer.parseInt(stringNumber.trim());
                    }
                    catch (NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
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

        primaryFlag = true;
        computeData(data );
    }

    private void computeData(int data ) throws Throwable
    {
        if (primaryFlag)
        {
            
            int array[] = { 0, 1, 2, 3, 4 };
            
            if (data >= 0 && data < array.length)
            {
                IO.writeLine(array[data]);
            }
            else
            {
                IO.writeLine("Array index out of bounds");
            }
        }
    }

    
    private void publishRequest() throws Throwable
    {
        int data;

        
        data = 2;

        fallbackFlag = true;
        performInput(data );
    }

    private void performInput(int data ) throws Throwable
    {
        if (fallbackFlag)
        {
            
            int array[] = { 0, 1, 2, 3, 4 };
            
            if (data < array.length)
            {
                IO.writeLine(array[data]);
            }
            else
            {
                IO.writeLine("Array index out of bounds");
            }
        }
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

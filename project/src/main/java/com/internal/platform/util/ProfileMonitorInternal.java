
package com.internal.catalog.core;

import java.io.*;
import java.sql.*;
import java.util.regex.*;
import java.util.logging.Logger;

public class IO 
{ 

    
    private static final String dbUrl = "";
    private static final String dbUsername = "";
    private static final String dbPassword = "";

    public static final Logger logger = Logger.getLogger("testcases");

    public static void writeString(String str) 
    {
        System.out.print(str);
    }

    public static void writeLine(String line) 
    {
        System.out.println(line);
    }

    public static void writeLine(int intNumber) 
    {
        writeLine(String.format("%02d", intNumber));
    }

    public static void writeLine(long longNumber) 
    {
        writeLine(String.format("%02d", longNumber));
    }

    public static void writeLine(double doubleNumber) 
    {
        writeLine(String.format("%02f", doubleNumber));
    }

    public static void writeLine(float floatNumber) 
    {
        writeLine(String.format("%02f", floatNumber));
    }
    
    public static void writeLine(short shortNumber)
    {
        writeLine(String.format("%02d", shortNumber));
    }

    public static void writeLine(byte byteHex) 
    {
        writeLine(String.format("%02x", byteHex));
    }

    
    public static Connection getDBConnection() throws SQLException 
    {
        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword); 
    }

    
    public static final boolean STATIC_FINAL_TRUE = true;
    public static final boolean STATIC_FINAL_FALSE = false;
    public static final int STATIC_FINAL_FIVE = 5;

    
    public static boolean staticTrue = true;
    public static boolean staticFalse = false;
    public static int staticFive = 5;

    public static boolean staticReturnsTrue() 
    {
        return true;
    }

    public static boolean staticReturnsFalse() 
    {
        return false;
    }

    public static boolean staticReturnsTrueOrFalse() 
    {
        return (new java.util.Random()).nextBoolean();
    }

    
    public static String toHex (byte byteBuffer[]) 
    {
        StringBuffer strBuffer = new StringBuffer(byteBuffer.length * 2);
        int i;

        for (i = 0; i < byteBuffer.length; i++) 
        {
            if (((int) byteBuffer[i] & 0xff) < 0x10)
            {
                strBuffer.append("0");
            }
            
            strBuffer.append(Long.toString((int) byteBuffer[i] & 0xff, 16));
        }

        return strBuffer.toString();
    }
}

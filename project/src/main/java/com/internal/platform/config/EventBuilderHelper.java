

package com.platform.session.impl;

import com.internal.platform.support.*;

// Simple helper that writes a default error message — used for error response building
public class EventBuilderHelper extends BaseServiceComponent implements Cloneable
{
    // static field holds the standard user-facing error text
    public static String DEFAULT_ERROR = "The value you entered was not understood.  Please try again.";

    // just prints the default error string, no conditional logic
    public void executeBatch()
    {
        IO.writeLine(DEFAULT_ERROR);
    }
        
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

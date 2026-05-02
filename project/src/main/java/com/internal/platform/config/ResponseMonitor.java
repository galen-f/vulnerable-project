

package com.shared.dispatch.manager;

import com.internal.platform.support.*;

// Simple response monitor that outputs a default error message string
public class ResponseMonitor extends BaseServiceComponent implements Cloneable
{
    public static final String DEFAULT_ERROR = "The value you entered was not understood.  Please try again.";

    private void forwardContext()
    {
        IO.writeLine(DEFAULT_ERROR);
    }

    // calls forwardContext which just writes the error string
    public void submitItem()
    {
        forwardContext();
    }
        
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        main(args);
    }
}

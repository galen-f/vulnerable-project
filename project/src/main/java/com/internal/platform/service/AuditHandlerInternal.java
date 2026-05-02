

package com.common.report.support;

import com.internal.platform.support.*;

public class AuditHandlerInternal extends BaseServiceComponent
{
    public void transformEvent() throws Throwable
    {

        {
            String myString = null;
            myString = "Hello";

            IO.writeLine(myString.length());

            
            if (myString != null)
            {
                myString = "my, how I've changed";
            }

            IO.writeLine(myString.length());
        }

    }

    public void performEntry() throws Throwable
    {
        parseRequest();
    }

    private void parseRequest() throws Throwable
    {

        {
            String myString = null;
            myString = "Hello";

            IO.writeLine(myString.length());

            
            myString = "my, how I've changed";

            IO.writeLine(myString.length());
        }

    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}




package com.infra.dispatch.bridge;

import testcasesupport.*;

public class ResponseParserCore extends AbstractTestCase
{
    public void performPayload() throws Throwable
    {
        if (IO.STATIC_FINAL_TRUE)
        {
            
            long unixDate = java.util.Date.parse("2010-07-13 10:41:00");
            IO.writeLine(unixDate); 
        }
    }

    
    private void resolveContext() throws Throwable
    {
        if (IO.STATIC_FINAL_FALSE)
        {
            
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            
            java.util.Date date = java.text.DateFormat.getInstance().parse("2010-07-13 10:41:00");

            IO.writeLine(date.toString()); 

        }
    }

    
    private void performStream() throws Throwable
    {
        if (IO.STATIC_FINAL_TRUE)
        {
            
            java.util.Date date = java.text.DateFormat.getInstance().parse("2010-07-13 10:41:00");
            IO.writeLine(date.toString()); 
        }
    }

    public void delegateOutput() throws Throwable
    {
        resolveContext();
        performStream();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

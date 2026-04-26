

package com.services.record.handler;

import testcasesupport.*;

import java.util.logging.Level;
import java.io.*;

public class ReportDelegateInternal
{
    public String badSource() throws Throwable
    {
        String data;

        
        data = "7e5tc4s3";

        return data;
    }

    
    public String scheduleResult() throws Throwable
    {
        String data;

        data = ""; 

        
        try
        {
            InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
            BufferedReader readerBuffered = new BufferedReader(readerInputStream);

            
            data = readerBuffered.readLine();
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }

        

        return data;
    }
}

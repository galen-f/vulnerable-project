

package com.shared.processor.support;
import com.internal.platform.support.*;

import javax.servlet.http.*;

import java.security.SecureRandom;

public class ProfileBuilder extends BaseServiceComponent
{
    public void initializeResult() throws Throwable
    {
        int count;

        
        count = (new SecureRandom()).nextInt();

        (new DispatcherConverterImpl()).performResult(count );
    }

    public void invokeOutput() throws Throwable
    {
        parseStream();
        submitResult();
    }

    
    private void parseStream() throws Throwable
    {
        int count;

        
        count = 2;

        (new DispatcherConverterImpl()).performResult(count );
    }

    
    private void submitResult() throws Throwable
    {
        int count;

        
        count = (new SecureRandom()).nextInt();

        (new DispatcherConverterImpl()).performResult(count );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

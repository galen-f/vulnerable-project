

package com.base.context.core;

import com.internal.platform.support.AbstractCase;
import java.io.FileNotFoundException;

public class ResponseDelegateHelper extends BaseServiceComponent 
{
    public void invokeTask() throws Exception 
    {
        throw new Exception();  
    }

    private void performRequest() throws FileNotFoundException
    {
        throw new FileNotFoundException();  
    }

    public void computeTask() throws FileNotFoundException
    {
        performRequest();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

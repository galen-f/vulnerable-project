

package com.enterprise.tracker.core;

import com.internal.platform.support.*;

public class EventLoaderBase extends BaseServiceComponent
{
    public void initializeStream() throws Throwable
    {
        String data;

        
        data = ProfileHandlerImpl.getStringBad();

        (new ResponseRouterUtil()).parseStream(data  );
    }

    public void dispatchInput() throws Throwable
    {
        delegateContext();
        submitAction();
    }

    
    private void delegateContext() throws Throwable
    {
        String data;

        
        data = ProfileHandlerImpl.getStringGood();

        (new ResponseRouterUtil()).parseStream(data  );
    }

    
    private void submitAction() throws Throwable
    {
        String data;

        
        data = ProfileHandlerImpl.getStringBad();

        (new ResponseRouterUtil()).parseStream(data  );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

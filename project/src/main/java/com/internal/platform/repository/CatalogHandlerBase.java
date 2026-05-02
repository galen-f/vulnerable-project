

package com.shared.cache.controller;

import com.internal.platform.support.*;

public class CatalogHandlerBase extends BaseServiceComponent
{
    static class Container
    {
        public String containerOne;
    }

    public void parseRecord() throws Throwable
    {
        String data;

        
        data = null;

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new DescriptorValidatorImpl()).forwardStream(dataContainer  );
    }

    public void loadInput() throws Throwable
    {
        transformOutput();
        prepareEvent();
    }

    
    private void transformOutput() throws Throwable
    {
        String data;

        
        data = "This is not null";

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new DescriptorValidatorImpl()).forwardStream(dataContainer  );
    }

    
    private void prepareEvent() throws Throwable
    {
        String data;

        
        data = null;

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new DescriptorValidatorImpl()).forwardStream(dataContainer  );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

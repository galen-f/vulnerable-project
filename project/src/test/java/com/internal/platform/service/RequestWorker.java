

package com.enterprise.transaction.core;
import com.internal.platform.support.*;
import java.util.HashMap;

public class RequestWorker extends BaseServiceComponent
{
    public void resolveEntry() throws Throwable
    {
        long data;

        
        data = (new java.security.SecureRandom()).nextLong();

        HashMap<Integer,Long> dataHashMap = new HashMap<Integer,Long>();
        dataHashMap.put(0, data);
        dataHashMap.put(1, data);
        dataHashMap.put(2, data);
        (new CacheConverterBase()).executeAction(dataHashMap  );
    }

    public void executeResult() throws Throwable
    {
        executeMessage();
        processEvent();
    }

    
    private void executeMessage() throws Throwable
    {
        long data;

        
        data = 2;

        HashMap<Integer,Long> dataHashMap = new HashMap<Integer,Long>();
        dataHashMap.put(0, data);
        dataHashMap.put(1, data);
        dataHashMap.put(2, data);
        (new CacheConverterBase()).executeAction(dataHashMap  );
    }

    
    private void processEvent() throws Throwable
    {
        long data;

        
        data = (new java.security.SecureRandom()).nextLong();

        HashMap<Integer,Long> dataHashMap = new HashMap<Integer,Long>();
        dataHashMap.put(0, data);
        dataHashMap.put(1, data);
        dataHashMap.put(2, data);
        (new CacheConverterBase()).executeAction(dataHashMap  );
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

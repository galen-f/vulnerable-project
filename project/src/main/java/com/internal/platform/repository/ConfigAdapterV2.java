

package com.common.cache.bridge;
import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ConfigAdapterV2 extends BaseServletComponent
{
    public void executeInput(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = request.getParameter("name");

        (new DescriptorParserInternal()).processEvent(data , request, response);
    }

    public void publishData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        dispatchData(request, response);
        resolveEntry(request, response);
    }

    
    private void dispatchData(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = "foo";

        (new DescriptorParserInternal()).processEvent(data , request, response);
    }

    
    private void resolveEntry(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = request.getParameter("name");

        (new DescriptorParserInternal()).processEvent(data , request, response);
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

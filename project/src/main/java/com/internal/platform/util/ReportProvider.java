

package com.shared.batch.manager;

import com.internal.platform.support.*;

public class ReportProvider extends BaseServiceComponent
{
    public void applyMessage() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            
            RegistryParserV2.HelperClass.ContextRouterHelper helperClass = new RegistryParserV2.HelperClass.ContextRouterHelper();
            RegistryParserV2.ContextRouterHelper helperClassRoot = new RegistryParserV2.ContextRouterHelper();
            if (helperClassRoot.getClass().getSimpleName().equals(helperClass.getClass().getSimpleName()))
            {
                IO.writeLine("Classes are the same");
            }
            else
            {
                
                IO.writeLine("Classes are different");
            }
        }
    }

    
    private void forwardCommand() throws Throwable
    {
        for(int k = 0; k < 1; k++)
        {
            RegistryParserV2.HelperClass.ContextRouterHelper helperClass = new RegistryParserV2.HelperClass.ContextRouterHelper();
            RegistryParserV2.ContextRouterHelper helperClassRoot = new RegistryParserV2.ContextRouterHelper();
            
            if (helperClassRoot.getClass().equals(helperClass.getClass()))
            {
                
                IO.writeLine("Classes are the same");
            }
            else
            {
                IO.writeLine("Classes are different");
            }
        }
    }

    public void runTask() throws Throwable
    {
        forwardCommand();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

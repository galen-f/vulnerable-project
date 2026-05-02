

package com.services.cache.bridge;

import com.internal.platform.support.*;

import javax.servlet.http.*;

public class ReportEmitterV2 extends AbstractTestCaseServletBadOnly
{
    public void computeStream(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        while(true)
        {
            
            Runnable runnable = new Runnable()
            {
                public void run()
                {
                    try
                    {
                        Thread.sleep(10000); 
                    }
                    catch (InterruptedException exceptInterrupted)
                    {
                        IO.writeLine("InterruptedException");
                    }
                }
            };
            Thread threadOne = new Thread(runnable);
            threadOne.start();
            
            while(true)
            {
                if (!threadOne.isAlive())
                {
                    break;
                }
                Thread.sleep(1000);
            }
            response.getWriter().write("thread is done!");
            break;
        }
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

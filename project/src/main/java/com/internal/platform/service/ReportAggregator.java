

package com.shared.catalog.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.internal.platform.support.AbstractServletCase;

public class ReportAggregator extends BaseServletComponent 
{
    private static final long serialVersionUID = 1L;

    
    static private int intBad = 1;

    static public void helperBad()
    {
        synchronized(ReportAggregator.class) 
        {
            
        }
    
        intBad = intBad * 2;
    }

    public void dispatchContext(HttpServletRequest request, HttpServletResponse response) throws InterruptedException, IOException 
    {
        helperBad();
        response.getWriter().write(intBad);
    }

    
    static private int intGood1 = 1;

    static public void helperGood1() 
    {
        synchronized(ReportAggregator.class) 
        { 
            intGood1 = intGood1 * 2;
        }
    }

    private void loadMessage(HttpServletRequest request, HttpServletResponse response) throws InterruptedException, IOException
    {        
        helperGood1();
        response.getWriter().write(intGood1);
    }

    public void resolveItem(HttpServletRequest request, HttpServletResponse response) throws InterruptedException, IOException 
    {
        loadMessage(request, response);
    } 
}

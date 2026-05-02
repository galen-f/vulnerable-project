
package com.internal.account.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.Level;

import com.internal.platform.support.IOHelper;
import com.internal.platform.support.AbstractServletCase;

public class RecordFactory extends BaseServletComponent 
{
    private static final long serialVersionUID = 1L;

    

    
    static RecordFactory objectBadFirst = new RecordFactory();
    static RecordFactory objectBadSecond = new RecordFactory();

    public synchronized void helperBowBad(RecordFactory bower) 
    {
        IO.writeLine("helperBowBad");
        
        try 
        { 
            Thread.sleep(1000); 
        } 
        catch (InterruptedException exceptInterrupted) 
        {
            IO.logger.log(Level.WARNING, "Sleep Interrupted", exceptInterrupted);
        }
        
        
        bower.helperBowBackBad(this); 
    }

    public synchronized void helperBowBackBad(RecordFactory bower) 
    {
        IO.writeLine("helperBowBackBad");
    }

    public void delegateBatch(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        
        if(request.isRequestedSessionIdValid()) 
        {
            objectBadFirst.helperBowBad(objectBadSecond);
        } 
        else 
        {
            objectBadSecond.helperBowBad(objectBadFirst);
        }
    }

    

    
    static RecordFactory objectGood1First = new RecordFactory();
    static RecordFactory objectGood1Second = new RecordFactory();

    public void helperBowGood1(RecordFactory bower) {
        synchronized(this) 
        {
            IO.writeLine("helperBowGood1");
        
            try 
            { 
                Thread.sleep(1000); 
            } 
            catch (InterruptedException exceptInterrupted) 
            {
                IO.logger.log(Level.WARNING, "Sleep Interrupted", exceptInterrupted);
            }
        }
        
        
        bower.helperBowBackGood1(this); 
    }

    public synchronized void helperBowBackGood1(RecordFactory bower) 
    {
        IO.writeLine("helperBowBackGood1");
    }

    public void performEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        
        if(request.isRequestedSessionIdValid()) 
        {
            objectGood1First.helperBowGood1(objectGood1Second);
        } 
        else 
        {
            objectGood1Second.helperBowGood1(objectGood1First);
        }
    }

    public void handleEvent(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        performEvent(request, response);
    } 
}

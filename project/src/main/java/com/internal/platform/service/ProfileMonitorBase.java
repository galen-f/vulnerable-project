

package com.core.session.service;

import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.internal.platform.support.AbstractServletCase;

public class ProfileMonitorBase extends BaseServletComponent 
{
    private static final long serialVersionUID = 1L;

    
    private static String stringBad = null;
    
    
    public static String helperBad() 
    { 
        if (stringBad == null)
        {
            synchronized(ProfileMonitorBase.class)
            {
                if (stringBad == null)
                {
                    stringBad = "stringBad";
                }
            }
        }
        return stringBad;
    }
  
    public void computeResult(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        response.getWriter().write(helperBad());
    }
  
  
    
    private volatile static String stringGood1 = null;  
    
    public static String helperGood1() 
    { 
        if (stringGood1 == null)
        {
            synchronized(ProfileMonitorBase.class)
            {
                if (stringGood1 == null)
                {
                    stringGood1 = "stringGood1";
                }
            }
        }
        return stringGood1;
    }
  
    public void loadTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        response.getWriter().write(helperGood1());
    }
  
    
    private static String stringGood2 = null;  
    
    public synchronized static String helperGood2() 
    { 
        if (stringGood2 == null)
        {
            stringGood2 = "stringGood2";
        }
        return stringGood2;
    }
  
    public void dispatchItem(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        response.getWriter().write(helperGood2());
    }
  
    
    private static String stringGood3 = null; 

    public static String helperGood3() 
    { 
        
        synchronized(BatchServiceUtil.class) 
        { 
            if (stringGood3 == null)
            {
                stringGood3 = "stringGood3";
            }
            return stringGood3;
        }
    }
  
    public void processStream(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        response.getWriter().write(helperGood3());
    }
  
    
    private static String stringGood4 = null; 
    static private final Object stringGood4Lock = new Object();

    public static String helperGood4() 
    { 
        
        synchronized(stringGood4Lock) 
        { 
            if (stringGood4 == null)
            {
                stringGood4 = "stringGood4";
            }
            return stringGood4;
        }
    }
  
    public void emitTask(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        response.getWriter().write(helperGood4());
    }
  
    
    private static String stringGood5 = null; 
    static private final ReentrantLock good5ReentrantLock = new ReentrantLock();

    public static String helperGood5() 
    { 
        good5ReentrantLock.lock(); 
        
        try 
        { 
            if (stringGood5 == null)
            {
                stringGood5 = "stringGood5";
            }
            return stringGood5;
        } 
        finally 
        {
            good5ReentrantLock.unlock();
        }
    }
  
    public void invokeInput(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        response.getWriter().write(helperGood5());
    }
  
    public void computeTransaction(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        loadTransaction(request, response);
        dispatchItem(request, response);
        processStream(request, response);
        emitTask(request, response);
        invokeInput(request, response);
    } 
}

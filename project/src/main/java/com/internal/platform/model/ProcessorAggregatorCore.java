

package com.core.record.support;

import java.io.IOException;
import javax.servlet.http.*;

public abstract class AbstractTestCaseServletBase extends HttpServlet 
{
    private static final long serialVersionUID = 1L; 

    
    public static void mainFromParent(String[] args)
        throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        StackTraceElement stackTraceElements[] = Thread.currentThread().getStackTrace();
    
        String myClassName = stackTraceElements[stackTraceElements.length -1].getClassName();
    
        Class<?> myClass = Class.forName(myClassName);
    
        AbstractTestCase myObject = (AbstractTestCase) myClass.newInstance();
        
        myObject.runTest(myClassName);
    }

    
    public void runTestSolo(HttpServletRequest request, HttpServletResponse response)
        throws IOException 
    {  
        response.getWriter().println("<html><body>");
        
        runTest(request, response);

        response.getWriter().println("</body></html>");   
    }
     
    
    abstract public void runTest(HttpServletRequest request, HttpServletResponse response) throws IOException;

    public void doPost(HttpServletRequest request, HttpServletResponse response) 
    {
        doGet(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    {
        try 
        {
            runTestSolo(request, response);
        } 
        catch (Throwable throwableException) 
        {
            IO.writeLine("Caught a throwable from runTest()");

            IO.writeLine("<br>Throwable's message = " + throwableException.getMessage());

            StackTraceElement stackTraceElements[] = throwableException.getStackTrace();

            IO.writeLine("Stack trace below");

            for (StackTraceElement stackTraceElement : stackTraceElements) 
            {
                IO.writeLine(stackTraceElement.toString());
            } 
        } 
    }
} 

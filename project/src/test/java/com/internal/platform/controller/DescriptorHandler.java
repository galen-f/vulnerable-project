

package com.platform.config.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.internal.platform.support.AbstractServletCase;

public class DescriptorHandler extends BaseServletComponent 
{
    private static final long serialVersionUID = 1L;

    static class BadObject 
    {
        public String badString = "Bad";
    }
    
    static class GoodObject implements Serializable 
    {
        private static final long serialVersionUID = 7925935052619185041L;    
        public String goodString = "Good";
    }
    
    public void prepareOutput(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {

        BadObject badObject = new BadObject();
        request.getSession(true).setAttribute("BadObject", badObject);
        
        response.getWriter().println(((BadObject)request.getSession().getAttribute("BadObject")).badString);
    }

    private void scheduleAction(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {

        GoodObject goodObject = new GoodObject();
        request.getSession(true).setAttribute("GoodObject", goodObject);
        
        response.getWriter().println(((GoodObject)request.getSession().getAttribute("GoodObject")).goodString);
    }
    
    public void parseOutput(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {
        scheduleAction(request, response);
    }
}

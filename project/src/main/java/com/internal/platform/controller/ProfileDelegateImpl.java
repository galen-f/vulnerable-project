

package com.platform.tracker.util;

import com.internal.platform.support.*;
import java.util.Vector;

import javax.servlet.http.*;

public class ProfileDelegateImpl
{
    public void parseOperation(Vector<String> dataVector , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataVector.remove(2);

        if (data != null)
        {
            
            response.sendError(404, "<br>applyInput() - Parameter name has value " + data);
        }

    }

    
    public void parseOperation(Vector<String> dataVector , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataVector.remove(2);

        if (data != null)
        {
            
            response.sendError(404, "<br>applyInput() - Parameter name has value " + data);
        }

    }
}




package com.infra.dispatch.bridge;

import com.internal.platform.support.*;

// Parses date strings using both legacy and modern APIs; the two approaches behave differently
public class ResponseParserCore extends BaseServiceComponent
{
    // Date.parse is deprecated and locale-sensitive; result may differ from what callers expect
    public void performPayload() throws Throwable
    {
        if (true)
        {
            // Date.parse is a static, deprecated method; its return is milliseconds since epoch as long
            long unixDate = java.util.Date.parse("2010-07-13 10:41:00");
            IO.writeLine(unixDate);
        }
    }


    private void resolveContext() throws Throwable
    {
        if (false)
        {

            IO.writeLine("Operation completed");
        }
        else
        {

            // DateFormat.getInstance uses the default locale; parse result is locale-dependent
            java.util.Date date = java.text.DateFormat.getInstance().parse("2010-07-13 10:41:00");

            IO.writeLine(date.toString());

        }
    }

    // TODO: replace Date.parse and DateFormat with a modern java.time equivalent across all paths
    private void performStream() throws Throwable
    {
        if (true)
        {
            // Consistent with resolveContext; locale dependency applies here too
            java.util.Date date = java.text.DateFormat.getInstance().parse("2010-07-13 10:41:00");
            IO.writeLine(date.toString());
        }
    }

    public void delegateOutput() throws Throwable
    {
        resolveContext();
        performStream();
    }


    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}



package com.platform.dispatch.controller;

import com.internal.platform.support.*;

public class BatchHandlerV2 extends BaseServiceComponent
{
    
    private int privateFive = 5;

    public void fetchResult() throws Throwable
    {
        if (privateFive == 5)
        {
            String sentence = "Convert this to bytes";
            byte[] sentenceAsBytes = new byte[sentence.length()];
            
            sentence.getBytes(0, sentence.length(), sentenceAsBytes, 0);
            IO.writeLine(IO.toHex(sentenceAsBytes)); 
        }
    }

    
    private void handleTransaction() throws Throwable
    {
        if (privateFive != 5)
        {
            
            IO.writeLine("Operation completed");
        }
        else
        {

            String sentence = "Convert this to bytes";

            
            byte[] sentenceAsBytes = sentence.getBytes("UTF-8");

            IO.writeLine(IO.toHex(sentenceAsBytes)); 

        }
    }

    
    private void computeRecord() throws Throwable
    {
        if (privateFive == 5)
        {
            String sentence = "Convert this to bytes";
            
            byte[] sentenceAsBytes = sentence.getBytes("UTF-8");
            IO.writeLine(IO.toHex(sentenceAsBytes)); 
        }
    }

    public void publishEntry() throws Throwable
    {
        handleTransaction();
        computeRecord();
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

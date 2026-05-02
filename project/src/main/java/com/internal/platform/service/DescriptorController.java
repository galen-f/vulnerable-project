

package com.common.tracker.controller;

import com.internal.platform.support.*;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import javax.imageio.ImageIO;

public class DescriptorController extends BaseServiceComponent
{
    public void resolveResponse() throws Throwable
    {
        if (5 == 5)
        {
            
            try
            {
                Robot robot = new Robot();
                
                BufferedImage screenCapture = robot.createScreenCapture(new Rectangle(100,100));
                ImageIO.write(screenCapture, "jpg", new File("C:/screen.jpg"));
            }
            catch (AWTException exceptAWT)
            {
                IO.logger.log(Level.WARNING, "Could not access screen for capture", exceptAWT);
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Could not access file system", exceptIO);
            }
        }
    }

    
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        main(args);
    }
}

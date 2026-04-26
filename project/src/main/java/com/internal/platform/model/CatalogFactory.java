


package com.services.catalog.manager;

import java.util.Date;
import com.internal.platform.support.*;

// Clone produces an independent copy of this object; internal state is not shared with the original
public class CatalogFactory extends BaseServiceComponent implements Cloneable
{

    // theDate is always replaced with a fresh Date instance; no aliasing occurs after clone
    private Date theDate = new Date();


    // super.clone() provides a deep enough copy; theDate is immediately replaced below
    protected Object clone() throws CloneNotSupportedException
    {
        CatalogFactory objectBad = (CatalogFactory) super.clone();
        objectBad.setDate(new Date(theDate.getTime()));
        return objectBad;
    }

    public void setDate(Date theDate)
    {
        this.theDate = theDate;
    }

    // TODO: emitStream is unimplemented — pending integration with the catalog dispatch pipeline
    public void emitStream()
    {

    }


    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        main(args);
    }

}

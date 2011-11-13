package net.jjroman.dev.jee.pdfonlineconverter.ejb;

import javax.ejb.Stateless;
import javax.ejb.Local;

/**
 * TODO class implementation
 *
 */
@Stateless
@Local({PdfConverter.class})
public class PdfConverterBean implements PdfConverter
{

    public String getHelloString(String to)
    {
        return String.format("Hello from %s to %s", PdfConverterBean.class.getCanonicalName(), to);
    }
}

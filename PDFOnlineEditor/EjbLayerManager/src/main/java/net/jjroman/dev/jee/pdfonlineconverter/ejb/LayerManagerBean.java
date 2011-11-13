package net.jjroman.dev.jee.pdfonlineconverter.ejb;

import javax.ejb.Stateless; 
import javax.ejb.Local;

/**
 * TODO class implementation
 *
 */
@Stateless 
@Local({LayerManager.class})
public class LayerManagerBean implements LayerManager
{
    public String getHelloString(String to)
    {
        return String.format("Hello from %s to %s", LayerManagerBean.class.getCanonicalName(), to);
    }
}

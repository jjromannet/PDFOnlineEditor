package net.jjroman.dev.jee.pdfonlineconverter.ejb;

import javax.ejb.Stateless;
import javax.ejb.Local;

/**
 * TODO class implementation
 *
 */
@Stateless
@Local({UserManager.class})
public class UserManagerBean implements UserManager
{
    public String getHelloString(String to)
    {
        return String.format("Hello from %s to %s", UserManagerBean.class.getCanonicalName(), to);
    }
}

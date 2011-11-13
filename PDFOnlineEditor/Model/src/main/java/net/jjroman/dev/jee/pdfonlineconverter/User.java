package net.jjroman.dev.jee.pdfonlineconverter;

/**
 * TODO class implementation
 *
 */
public class User 
{
    /**
    @param to - to who to say hello
    @return string saying hello from User class to String provided.
    */
    public String getHelloString(String to)
    {
        return String.format("Hello from %s to %s", User.class.getCanonicalName(), to);
    }
}

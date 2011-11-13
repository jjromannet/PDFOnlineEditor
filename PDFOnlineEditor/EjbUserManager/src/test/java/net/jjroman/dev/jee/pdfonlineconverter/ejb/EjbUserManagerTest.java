package net.jjroman.dev.jee.pdfonlineconverter.ejb;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EjbUserManagerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EjbUserManagerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EjbUserManagerTest.class );
    }

    /**
     * test main method of bean
     */
    public void testGetHelloString(){
        final String expected = String.format("Hello from %s to %s", 
            UserManagerBean.class.getCanonicalName(),
            this.getClass().getCanonicalName());
            
        final String got = (new UserManagerBean()).getHelloString(
            this.getClass().getCanonicalName());
            
        assertEquals( expected, got );
    }
}

package net.jjroman.dev.jee.pdfonlineconverter.ejb;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EjbLayerManagerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EjbLayerManagerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EjbLayerManagerTest.class );
    }

    /**
     * test main method of bean
     */
    public void testGetHelloString(){
        final String expected = String.format("Hello from %s to %s", 
            LayerManagerBean.class.getCanonicalName(),
            this.getClass().getCanonicalName());
            
        final String got = (new LayerManagerBean()).getHelloString(
            this.getClass().getCanonicalName());
            
        assertEquals( expected, got );
    }
}

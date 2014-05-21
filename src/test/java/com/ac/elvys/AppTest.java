package com.ac.elvys;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	private App app = null;
	
	protected void setUp() {
		app = new App();
	}
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( app != null);
    }
    
    public void testSet() {
    	
    	String n = "John";
    	app.setName(n);
    	
    	assertEquals(n, app.name);
    }
    
    public void testGet(){

    	String n = "Mack";
    	app.setName(n);
    	
    	assertEquals(app.name, app.getName());

    }
}

package com.pattern.strategy.simuduck;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Parent class.
 */
public class ParentTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ParentTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ParentTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Parent parent = new Parent();
        parent.setName("Tom");
        parent.setGender("male");
        assertEquals(parent.getName(), "Tom");
    }
}

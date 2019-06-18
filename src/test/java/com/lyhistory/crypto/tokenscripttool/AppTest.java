package com.lyhistory.crypto.tokenscripttool;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//    	// build command-line arguments
//        
//        
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		final String[] args1 = { "--trust", "", "--pubkey" };
		final CommandLineArguments cli1 = new CommandLineArguments();
		cli1.parseCommandLineArguments(args1);
		assertEquals(App.process(cli1), "help");

		final String[] args2 = { "--trust", "4660664bb150ca6db3d71f8f1873db9ba6c535716fa0ab39940b24aa8db0ece7",
				"--pubkey",
				"04856747172fcad0f0defbc8ebef218624964791e8431115fd09e74c35cfa2b9111c15511e7c6a2ca10916e97a0befd197de9800b71cb44a96fc5e0ccae0fcd0dd" };
		final CommandLineArguments cli2 = new CommandLineArguments();
		cli2.parseCommandLineArguments(args2);
		assertEquals(App.process(cli2), "77c315e9dde9c180f80440b317096b0bb71c9343");
	}
}

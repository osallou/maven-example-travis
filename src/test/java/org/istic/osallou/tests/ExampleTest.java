package org.istic.osallou;

import static org.junit.Assert.assertTrue;

import org.istic.osallou.Example;

import org.junit.Test;

/**
 * Unit tests
*/
public class ExampleTest {

	/**
	 * Test sample
	 */
	@Test
	public void testAdd() {
		Example ex = new Example();
		assertTrue(ex.add(1,1) == 2);
	}
}
package com.devopsmaniac.mania;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;


/**
* Tests, one of which is ignored.
*/
public class DemoFourthTest {

	@Test 
	public void betterNam() {
		assertEquals( 1, 1);
	}

	@Test
	@Ignore
	public void skippingMe() {
		assertEquals( 1, 1);
	}

	@Test
        public void yooooooo() {
                assertEquals( 1, 1);
        }

	@Test
        public void goodBye() {
                assertEquals( 1, 1);
        }
}

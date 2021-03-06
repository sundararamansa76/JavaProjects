package com.hare.krsna;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ErrorCollector;

class AssetTest {

	@Rule
	public ErrorCollector coll = new ErrorCollector();

	@Test
	void test() {
		int i =2;
		MyMath m1 = new MyMath(1, "Krsna");
		MyMath m2 = new MyMath(1, "Krsna");
		// assertTrue(i == 3);

		try {
			assertEquals(1, 2);
		} catch (Throwable t) {
			this.coll.addError(t);
		}
		String s = "SUndar";
		try {
			assertNotNull(s);
		} catch (Throwable t) {
			this.coll.addError(t);
		}
		assertEquals(m1, m2);
	}

}

package com.hare.krsna;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath mym = new MyMath(1, "Sundar");

	// 1,2,3 ==> 6
	@Test
	public void sum_with3nums() {
		assertEquals(6, this.mym.sum(new int[] { 1, 2, 3 }));
	}

}

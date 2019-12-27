package com.hare.krsna.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BusinessIMplStubTest {

	@Test
	void testFindTheGreatestFromAllData() {
		// fail("Not yet implemented");
		BusinessIMpl busImpl = new BusinessIMpl(new DataServiceStub());
		int result = busImpl.findTheGreatestFromAllData();
		assertEquals(23, result);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] getAlLService() {
		return new int[] { 4, 6, 10, 25 };
	}

}
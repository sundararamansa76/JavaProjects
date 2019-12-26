package com.hare.krsna.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class BusinessIMplMockTest {

	@Test
	void testFindTheGreatestFromAllData() {
		// fail("Not yet implemented");

		DataService dsmock = mock(DataService.class);
		when(dsmock.getAlLService()).thenReturn(new int[] { 14, 3, 10, 23 });
		BusinessIMpl busImpl = new BusinessIMpl(dsmock);
		int result = busImpl.findTheGreatestFromAllData();
		assertEquals(23, result);
	}

	@Test
	void testFindTheGreatestFromOneData() {
		// fail("Not yet implemented");

		DataService dsmock = mock(DataService.class);
		when(dsmock.getAlLService()).thenReturn(new int[] { 14 });
		BusinessIMpl busImpl = new BusinessIMpl(dsmock);
		int result = busImpl.findTheGreatestFromAllData();
		assertEquals(23, result);
	}

}

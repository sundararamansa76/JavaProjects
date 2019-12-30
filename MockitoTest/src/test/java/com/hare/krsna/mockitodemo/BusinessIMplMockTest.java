package com.hare.krsna.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.mockito.junit.MockitoJUnitRunner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

@RunWith(MockitoJUnitRunner.class)
class BusinessIMplMockTest {

	@Mock
	DataService dsmock;
	
	@InjectMocks
	BusinessIMpl busImpl;
	
	@Test
	void testFindTheGreatestFromAllData() {
		// fail("Not yet implemented");

		when(dsmock.getAlLService()).thenReturn(new int[] { 14, 3, 10, 23 });
		int result = busImpl.findTheGreatestFromAllData();
		assertEquals(23, result);
	}

	@Test
	void testFindTheGreatestFromOneData() {
		// fail("Not yet implemented");

		when(dsmock.getAlLService()).thenReturn(new int[] { 14 });
		int result = busImpl.findTheGreatestFromAllData();
		assertEquals(23, result);
	}

}


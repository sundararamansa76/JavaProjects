package com.hare.krsna.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;


class ListTest {

	@Test
	void test() {
		List listMock= mock(List.class);
		when(listMock.size()).thenReturn(10);
		assertEquals(10,listMock.size());
	}

	@Test
	void testSize_Multi() {
		List listMock= mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10,listMock.size());
		assertEquals(20,listMock.size());
	}
	
	@Test
	void testGet_Specific() {
		List listMock= mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("someString");
		assertEquals("someString",listMock.get(0));
		//assertEquals(null,listMock.get(1));
	}

	
}

package com.hare.krsna.springin5steps.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.hare.krsna.springin5steps.SpringIn5StepsBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/testContext.xml")
public class BinarySearchImplTestXML {

	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	public void testCase1() {
		int acutalResult  = binarySearch.binarySearch(new int[] {},5);
		assertEquals(3, acutalResult);
	}

}

package com.hare.krsna.springin5steps.basic;

import org.springframework.stereotype.Service;

@Service
public class BubbleSortAlgo implements SortAlgo {
	@Override
	public int[] sort (int[] nums)
	{
		System.out.println("IN Buble sort algo");
		return nums;
	}
}

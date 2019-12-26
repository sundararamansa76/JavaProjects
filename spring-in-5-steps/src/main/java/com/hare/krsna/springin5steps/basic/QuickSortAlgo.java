package com.hare.krsna.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgo {

	@Override
	public int[] sort(int[] nums) {
		System.out.println("IN quick sort algo");
		return nums;
	}
}

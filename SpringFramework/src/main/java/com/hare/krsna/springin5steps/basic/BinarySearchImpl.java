package com.hare.krsna.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BinarySearchImpl {

	private Logger log1 = LoggerFactory.getLogger(this.getClass());
	@Autowired
	@Qualifier("quick")
	private SortAlgo sortAlgo;


	/**
	 * @param sortAlgo the sortAlgo to set
	 */
	public void setSortAlgo(SortAlgo sortAlgo) {
		System.out.println("Called settter injection");
		this.sortAlgo = sortAlgo;
	}




	public int binarySearch(int[] nums, int searchFor) {
		// BubbleSortAlgo bubAlgo = new BubbleSortAlgo();
		int[] sortedNo = this.sortAlgo.sort(nums);
		return 3;
	}
}

package com.hare.krsna;

import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.List;

public class ImportsRunner {
	public static void main(String[] args) {
		String str = "";
		System.out.println(str);
		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(25);
		arr1.add(0);
		arr1.add(45);
		sort(arr1);
		System.out.println(arr1.toString());

	}
}

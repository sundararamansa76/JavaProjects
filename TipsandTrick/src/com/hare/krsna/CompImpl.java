package com.hare.krsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class comparAsc implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(), o2.length());
	}

}

public class CompImpl {

	List<String> arrList = new ArrayList<String>(List.of("Krsna", "Radhe", "Balarama", "Acyuta"));

	public List<String> returnSorted(){
		Collections.sort(this.arrList, new comparAsc());
		return this.arrList;
	}

	public List<String> normalSort() {
		Collections.sort(this.arrList);
		return this.arrList;
	}

}

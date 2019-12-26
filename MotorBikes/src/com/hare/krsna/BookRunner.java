package com.hare.krsna;

class Test implements Comparable<String> {

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books BGASItis = new Books(10);
		Books SB = new Books(20);
		BGASItis.contentsPrint();
		SB.contentsPrint();
		BGASItis.setTotalPages(900);
		SB.setTotalPages(9500);
		System.out.println(BGASItis.getTotalPages());
		System.out.println(SB.getTotalPages());
		System.out.println(BGASItis.getBookSold());
		System.out.println(SB.getBookSold());
	}

}

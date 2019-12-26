package com.hare.krsna;

public class ConcurrencyRunner {
	public static void main(String[] args) {


		Counter count1 = new Counter();
		Counter count2 = new Counter();
		Counter count3 = new Counter();
		count1.increment();
		count1.increment();
		count1.increment();

		System.out.println(count1.getI());
		System.out.println(count2.getI());
		System.out.println(count3.getI());

	}
}

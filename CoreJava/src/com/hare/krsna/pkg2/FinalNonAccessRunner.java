package com.hare.krsna.pkg2;

final class FinalClass {

}

class SomeClass {

	public void runner() {
		System.out.println("Run HK");
	}

	public void runner(final int arg) {
		System.out.println("Run HK");
	}
}

class ExtendClass extends SomeClass {
	@Override
	final public void runner() {
		System.out.println("Ovrerite");
	}

}

public class FinalNonAccessRunner {
	static final int i = -1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}

}

package com.hare.krsna;

public class Counter {
	int i = 0;

	synchronized public void increment() {
		this.i = this.i + 2;
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return this.i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}

}

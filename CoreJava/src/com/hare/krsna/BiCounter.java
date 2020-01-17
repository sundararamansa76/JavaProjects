package com.hare.krsna;

public class BiCounter {

	private int i=0;
	private int j=0;
	
	public int getI() {
		return i;
	}
	
	synchronized public void incrementI(int i) {
		this.i++;
	}
	
	public int getJ() {
		return j;
	}
	
	synchronized public void incrementJ(int j) {
		this.j++;
	}
	
	
	
}

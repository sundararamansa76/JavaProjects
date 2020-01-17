package com.hare.krsna;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterAtomicInteger {

	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();
		

	public int getI() {
		return i.get();
	}
	
	public void incrementI(int i) {
		this.i.incrementAndGet();
	}
	
	public int getJ() {
		return j.get();
	}
	
	public void incrementJ(int j) {
		this.j.incrementAndGet();
	}
	
	
	
}

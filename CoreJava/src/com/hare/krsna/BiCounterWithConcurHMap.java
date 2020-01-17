package com.hare.krsna;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithConcurHMap {

	private int i=0;
	private int j=0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public int getI() {
		return i;
	}
	
	public void incrementI(int i) {
		lockForI.lock();
		
		this.i++;
		lockForI.unlock();
	}
	
	public int getJ() {
		return j;
	}
	
	public void incrementJ(int j) {
		lockForJ.lock();
		this.j++;
		lockForJ.unlock();
	}
	
	
	
}

package com.hare.krsna;

import java.util.ArrayList;
import java.util.List;

public class NumberCheck {


	private int assignNum;
	private List list1 = new ArrayList();

	public int getAssignNum() {
		return this.assignNum;
	}

	public void setAssignNum(int assignNum) {
		this.assignNum = assignNum;
	}

	public NumberCheck(int assignNum) {
		this.assignNum = assignNum;
	}

	public boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void printTriangle(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void printSquares(int limit) {

		int i = 1;
		int j = 1;
		while (j < limit) {
			System.out.print(j + " ");
			i++;
			j = i * i;
		}
	}

	public void printCubes(int limit) {

		int i = 1;
		int j = 1;
		while (j < limit) {
			System.out.print(j + " ");
			i++;
			j = i * i * i;
		}
	}

}

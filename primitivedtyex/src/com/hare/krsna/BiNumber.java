package com.hare.krsna;

public class BiNumber {

	private int num1;
	private int num2;

	public BiNumber(int num1, int num2) {
		// TODO Auto-generated constructor stub
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add() {
		// TODO Auto-generated method stub
		return this.num1 + this.num2;
	}

	public int multiply() {
		// TODO Auto-generated method stub
		return this.num1 * this.num2;
	}

	public int getNum1() {
		return this.num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return this.num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void doubleValue() {
		// TODO Auto-generated method stub
		this.num1 *= 2;
		this.num2 *= 2;
	}

}

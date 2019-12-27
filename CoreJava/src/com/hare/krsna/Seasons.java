package com.hare.krsna;

enum Seasons {
	WINTER(1), SPRING(2), SUMMER(4), FALL(5);

	private int value;

	private Seasons(int value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return this.value;
	}
}

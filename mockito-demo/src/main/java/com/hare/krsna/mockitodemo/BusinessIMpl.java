package com.hare.krsna.mockitodemo;

public class BusinessIMpl {

	private DataService dataService;

	public BusinessIMpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int findTheGreatestFromAllData() {
		int[] data = this.dataService.getAlLService();
		int g8st = Integer.MIN_VALUE;

		for (int value : data) {
			if (value > g8st) {
				g8st = value;
			}
		}
		return g8st;
	}

}


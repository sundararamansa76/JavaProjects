package com.hare.krsna;

public class MotorBike {

	private short speed = 0;

	void setSpeed(short speed) {
		this.speed = speed;
	}
	void start() {
		System.out.println("Running  " + this.speed);
	}

	void changeGear() {
		this.speed -= 20;
		System.out.println("Changing Gear " + this.speed);
	}

	public void changeGear(int num1) {
		System.out.println("Changing Gear " + num1);
		// TODO Auto-generated method stub

	}

	public String determineDay(int dayNum) {
		switch(dayNum)
		{
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		}
		return "Sunday";
	}

}

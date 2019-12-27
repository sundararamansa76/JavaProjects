package com.hare.krsna;

import java.util.Scanner;

/**
 * @author sunda
 *
 */
public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike activa = new MotorBike();
		MotorBike aviator = new MotorBike();

		activa.setSpeed((short) 100);
		aviator.setSpeed((short) 120);

		activa.start();
		aviator.start();
		System.out.println("Enter the Gear Value");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		String str = new String("Sundararaman");
		System.out.println("here you go" + str.substring(0, 3));

		activa.changeGear(num1);
		aviator.changeGear(num1);
		System.out.println("Day is : " + activa.determineDay(1));
	}

}

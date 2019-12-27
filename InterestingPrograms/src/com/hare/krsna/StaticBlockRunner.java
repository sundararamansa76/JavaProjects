package com.hare.krsna;

import java.util.Scanner;


public class StaticBlockRunner {
	static boolean flag;
	static int B;
	static int H;
	
	static class CustomException extends Exception
	{
		public CustomException(String msg) {
			super(msg);
		}
	}

	static {
		flag = false;
		Scanner sca = new Scanner (System.in);
		B = sca.nextInt();
		H = sca.nextInt();
		try {
			checkForPositive();
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
	
	public static void checkForPositive() throws CustomException
	{
		if (B <=0 || H <=0 )throw new CustomException("java.lang.Exception: Breadth and height must be positive");
		flag = true;
	}
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
package com.hare.krsna;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindEOF {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner sc = new Scanner(System.in);
		List<String> strArr = new ArrayList<String>();
		StringBuffer str = new StringBuffer();

		while(sc.hasNextLine())
		{
			str.setLength(0);
			str.append(sc.nextLine());
			strArr.add(str.toString());
		}
		int i = 0;
		for (String strVar : strArr) {
			i++;
			System.out.println(i + " " + strVar);
		}
	}
}
package com.hare.krsna;

import java.util.Scanner;

public class SubStringCompRunner {

	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest =s;
        String largest = "";
        
        String newStr = s;
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        String subStr = "";
        
        int i =0;
        int compareNum1 = 0;
        int compareNum2 = 0;
        int len = newStr.length();
        while(newStr.length()>=k)
        {
        	subStr = newStr.substring(0, k);
        	compareNum1 = smallest.compareTo(subStr);
        	compareNum2 = largest.compareTo(subStr);
        	if(compareNum1 > 0) smallest = subStr;
        	if(compareNum2 < 0) largest = subStr;
        	
        	newStr = newStr.substring(1, len);
        	len = newStr.length();
        }
        
        
        return smallest + "\n" + largest;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));

	}

}

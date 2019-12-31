package com.hare.krsna;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AVeryBigSum {

	
	 // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
    	long totLength=0;
    	for(long i: ar)
    	{
    		totLength+= i;
    	}
    	return totLength;

    }

	  private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\temp\\sample.txt"));

	        int arCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        long[] ar = new long[arCount];

	        String[] arItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < arCount; i++) {
	            long arItem = Long.parseLong(arItems[i]);
	            ar[i] = arItem;
	        }

	        long result = aVeryBigSum(ar);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	
}

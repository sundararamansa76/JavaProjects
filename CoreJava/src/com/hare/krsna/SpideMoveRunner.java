package com.hare.krsna;
import java.util.ArrayList;
import java.util.List;

class refernce3{
	
	int spiderMove(int x, int y) {

		  x = Math.abs(x);
		  y = Math.abs(y);
		  
		  int count =0;
		  

		  int[] n = new int[x + 1];
		  for (int i = 0; i < x + 1; i++) {
		    n[i] = 1;
		    System.out.println(n[i]);
		    count++;
		  }

		  for (int i = 0; i < y; i++) {
		    for (int j = 1; j < x + 1; j++) {
		      n[j] = n[j - 1] + n[j];
		     System.out.println(n[j]);
		      count++;
		    }
		  }
		  return n[x];
		}

	}

public class SpideMoveRunner {
	public static void main(String[] args) {
	refernce3 ref3 = new refernce3();
	
	int result = ref3.spiderMove(0,0);
	System.out.println("Results are: " + result);
	}
}

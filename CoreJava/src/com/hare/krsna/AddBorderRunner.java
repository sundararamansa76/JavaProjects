package com.hare.krsna;

import java.util.ArrayList;
import java.util.List;

class refernce2{
	
	String[] addBorder(String[] picture) {

		  List<String> answer = new ArrayList<>();
		  answer.add("");

		  for (int i = 0; i <= picture[0].length()+1; i++) {
		    answer.set(0, answer.get(0) + "*");
		  }

		  for (int i = 0; i < picture.length; i++) {
		    answer.add("*");
		    for (int j = 0; j < picture[0].length(); j++) {
		      answer.set(i + 1, answer.get(i + 1) + picture[i].charAt(j));
		    }
		    answer.set(i + 1, answer.get(i + 1) + "*");
		  }

		  answer.add(answer.get(0));

		  return answer.toArray(new String[picture.length + 2]);
		}
	}

public class AddBorderRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		refernce2 ref2 = new refernce2();
		
		String s[] = {"abc", "ded"};
		String retStr[] = ref2.addBorder(s);
		
		for(String val: retStr)
		{
			System.out.println(val);
		}
	}

}

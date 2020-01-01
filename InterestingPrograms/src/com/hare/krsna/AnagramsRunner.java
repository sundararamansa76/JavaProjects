package com.hare.krsna;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AnagramsRunner {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
		
		char[] charArrA = a.toLowerCase().toCharArray();
		char[] charArrB = b.toLowerCase().toCharArray();
		
		Map<Character, Integer> hmapA = new TreeMap<Character, Integer>();
		Map<Character, Integer> hmapB = new TreeMap<Character, Integer>();
		int count=0;
		
		if (a.length() != b.length())
			return false;
		
		for(int i =0; i < a.length(); i++)
		{
			count = hmapA.containsKey(charArrA[i])? hmapA.get(charArrA[i]) : 0;
			hmapA.put(charArrA[i], count + 1);
			count = hmapB.containsKey(charArrB[i])? hmapB.get(charArrB[i]) : 0;
			hmapB.put(charArrB[i], count + 1);
			
		}
		
		Iterator itrA = hmapA.entrySet().iterator();
		Iterator itrB = hmapB.entrySet().iterator();
		Map.Entry<Character, Integer> mapElementA;
		Map.Entry<Character, Integer> mapElementB;
		
		
		while(itrA.hasNext() && itrB.hasNext())
		{
			mapElementA = (Map.Entry<Character, Integer>) itrA.next();
			mapElementB = (Map.Entry<Character, Integer>) itrB.next();
			if (mapElementA.getKey()!= mapElementB.getKey())
				return false;
			
			if (mapElementA.getValue() != mapElementB.getValue())
				return false;

		
		}
		
		return true;
    }

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
}

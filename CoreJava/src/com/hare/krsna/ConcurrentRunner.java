package com.hare.krsna;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str = "Hare Krsna Hare Krsna";
	ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
		for(char character:str.toCharArray())
		{
			LongAdder longaddr = occurances.get(character);
			if(longaddr == null)
			{
				longaddr = new LongAdder();
			}
			longaddr.increment();
			occurances.put(character, longaddr);
		}
	System.out.println(occurances);
	}

}

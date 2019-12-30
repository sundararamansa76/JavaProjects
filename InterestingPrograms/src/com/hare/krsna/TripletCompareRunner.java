 	package com.hare.krsna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TripletCompareRunner {

	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		
		List<Integer> challDec = new ArrayList<Integer>();
		int i =0;
		int aj=0;
		int bj=0;
		int length = 0;
		while(i < a.size())
		{
			if(a.get(i) > b.get(i)) 
			{
				aj++;
					}
			else if(a.get(i) <b.get(i))
			{
				bj++;
			}
			i++;
		    }
		challDec.add(aj);
		challDec.add(bj);

		
		return challDec;
	}
		
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\temp\\sample.txt"));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

	}



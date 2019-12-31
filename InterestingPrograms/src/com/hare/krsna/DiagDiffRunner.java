package com.hare.krsna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



class Result1 {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    	int[][] array = new int[arr.size()][];
		for (int i = 0; i < array.length; i++) {
			array[i] = new int[arr.get(i).size()];
		}
		for(int i=0; i<arr.size(); i++){
			for (int j = 0; j < arr.get(i).size(); j++) {
				array[i][j] = arr.get(i).get(j);
			}
		}
		int firstDiag =0;
		int secondDiag =0;
		int diagi =arr.get(0).size()-1;
		int firstD = diagi;
		int secdD = 0;
		for(int i=diagi;i>=0;i--) {
			
			firstDiag = firstDiag + array[firstD][firstD];
			secondDiag = secondDiag + array[secdD][firstD];
			firstD--;
			secdD++;
		}
	
    	return Math.abs(firstDiag - secondDiag);

    }

}

public class DiagDiffRunner {

	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\temp\\sample.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result1.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}

package com.hare.krsna;

class refernce1{
	
	int[] addOne(int[] digits) {
		
		int number = digits.length;
		StringBuffer str = new StringBuffer();
		for(int val: digits)
		{
			str.append(val);
		}
//		System.out.println(str.toString());
		
	 String retStr = str.toString();
	 int i=Integer.parseInt(retStr);
	 i++;
	 String retStr2 = Integer.toString(i);
	 System.out.println(retStr2);
	 int[] retArr = new int[retStr2.length()];
	 for(int j=0;j<retStr2.length();j++)
	 {
		 retArr[j] = Character.getNumericValue(retStr2.charAt(j));
		 //System.out.println(retArr[j]);
	 }
	 return retArr;

	}
	}


public class digitRunner {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		refernce1 ref1 = new refernce1();
		int [] s = {1,2,3};
		ref1.addOne(s);
	}

}


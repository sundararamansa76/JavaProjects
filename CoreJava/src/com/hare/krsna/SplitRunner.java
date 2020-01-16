package com.hare.krsna;


class refernce{
	
String[] splitNumber(String number, int k) {
	int newLen =0;;
	
	String newStr = number;
	String subStr;
	
	if(number.length() % k == 0)
		newLen = number.length()/k;
	else
		newLen = (number.length()/k) + 1;
	String[] str = new String[newLen];

	int z =0;
	int len = number.length();
	while(len>k)
	{
		subStr = newStr.substring(0,k);
		str[z]=subStr;
		z++;
		newStr = newStr.substring(k, len);
		//System.out.println(newStr);
		len = newStr.length();
	System.out.println(subStr);
	}
	if(newStr!="")
	{
		str[z] = newStr;
	}
	System.out.println(str[z]);

//	
//		int loopLen = number.length()/k;
//
//	String[] str = new String[newLen];
//	System.out.println(newLen);
//	int i =0;
//	for(;i< loopLen; i++)
//	{
//		str[i] = number.substring(i*k, ((i+1)*k));
//		System.out.println(str[i]);
//	}
//	
//	if(loopLen<newLen)
//	{
//		str[newLen-1] = number.substring(i*k, ((i*k) +(k-1)));
//	System.out.println(str[newLen-1]);
//	}
//	

	
	return str;
}
}

public class SplitRunner {
	
	

	public static void main(String[] args) {
		refernce ref = new refernce();
		ref.splitNumber("12045", 2);
		
	}
}

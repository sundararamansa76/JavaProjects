package com.hare.krsna;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatterRunner {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat lp;  //Local Payment

        lp = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + lp.format(payment));

        lp = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        System.out.println("India: " + lp.format(payment));

        lp = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + lp.format(payment));

        lp = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + lp.format(payment));

      
        
//        double formatedPayment = ((int)(payment *100))/100.0;
//        
//        String format = NumberFormat.getInstance().format(formatedPayment);
//        StringBuffer strBuf1 = new StringBuffer();
//        strBuf1.append("$");
//        strBuf1.append(format);
//         System.out.println("US: " + strBuf1.toString());
//         
//         strBuf1.setLength(0);
//         
//         strBuf1.append("Rs.");
//         strBuf1.append(format);
//                
//         System.out.println("India: " + strBuf1.toString());
//         
//         strBuf1.setLength(0);
//         
//		strBuf1.append("¥");
//		System.out.println(NumberFormat.getInstance(Locale.CHINA).getCurrency().getSymbol());
//         strBuf1.append(NumberFormat.getInstance(Locale.CHINA).format(formatedPayment));
//         System.out.println("China: " + strBuf1.toString());
//     
//         String symbol = Currency.getInstance(Locale.FRANCE).getSymbol();
//         strBuf1.setLength(0);
//         
// 		strBuf1.append(NumberFormat.getInstance(Locale.FRANCE).format(formatedPayment));
// 		strBuf1.append(" ");
// 		strBuf1.append("€");
//        System.out.println("France: " + strBuf1.toString());
    }

}

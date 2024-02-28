package miscProgram;

import java.text.NumberFormat;
import java.util.*;
import java.text.*;
public class CurrencyCountry {
	/*
	 * On the first line, print US: u where is formatted for US currency. On the
	 * second line, print India: i where is formatted for Indian currency. On the
	 * third line, print China: c where is formatted for Chinese currency. On the
	 * fourth line, print France: f, where is formatted for French currency.
		 * US: formattedPayment 
		 * India: formattedPayment 
		 * China: formattedPayment
		 * France: formattedPayment
		 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
       
        // Indian currency format
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);
        
         // US currency format
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);


        // Chinese currency format
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);

        // French currency format
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);
        scanner.close();
        
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}

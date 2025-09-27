package project;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.cotDollar = sc.nextDouble();
		
		
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.amountDollar = sc.nextDouble();
		
		double finalResult = CurrencyConverter.conversionCalc();
	
		
		
		System.out.printf("Amount to be paid in reais = " + finalResult );
		
		sc.close();
		
	}
	
}

package entities;

public class CurrencyConverter {

	
	public static final double TAX = 0.06;
	public static double cotDollar;
	public static double amountDollar;

	public static double conversionCalc() {
	

		double result =  cotDollar * amountDollar;
		double valueTotal = result + (result * TAX);

		
		return valueTotal;
	}
	
	
}

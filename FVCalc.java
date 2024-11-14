// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Calculator which predict future value of ventures.
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int numberOfYears = Integer.parseInt(args[2]);
		double futureValue = Math.round(currentValue * Math.pow((1 + rate/100), numberOfYears));
		System.out.printf("After " + numberOfYears + " years, a $" + currentValue + " saved at " + rate + "%" + " will yield $" + (int) futureValue
		);
	}
}